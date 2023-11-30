import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//WebUI.callTestCase(findTestCase('Test Cases/CreatePartnerAcquisitionOpportunity-Admin'), null)

//Validation Message to fill Partner Model and Accreditation Level
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelValidationMessageRevalidate'), 20)
MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

//Selecting Partner Model
//WebUI.scrollToPosition(0, 800)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/QualificationElement'),20)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelEdit'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelValues',[('value') : GlobalVariable.ResellerPartnerModel]),20)

//Selecting Accreditation Level
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Accreditation/AccreditationNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Accreditation/AccreditationValues',[('value') : GlobalVariable.ResellerAccreditationLevel]),20)

//Click Save and Revalidate
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(5000)
//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)


//Add a Product Validation and Add Products
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductRevalidation'),20)
WebUI.scrollToPosition(0, 3500)

WebUI.waitForElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'),20)

WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/PriceBookHeader-VIPRE'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/PAProductSelection',[('value') : GlobalVariable.PAProducts]),20)

//Click Next
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/NextButton'),20)

//Verify Edit Selected Product
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProductVerification'), 20)

//Edit Sales Price
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickSalePrice'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/SalesPriceInput'), GlobalVariable.SalePrice)

//Edit Quantity
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickEditQuantity'),20)
WebUI.sendKeys(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/QuantityInput'),GlobalVariable.Quantity)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickLineDescription'),20)

//Click Save and close
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProductSaveButton'),20)
WebUI.sleep(1000)


//Revalidate Message
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'), 20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
//WebUI.sleep(1000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)


//Click Create Draft Contract
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractValidation'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftcontractButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractScreenValidation'), 20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ResellerPartner-AnnualSalesTarget'),GlobalVariable.AnnualSalesTarget)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ResellerPartner-MinimumOrderValue'), GlobalVariable.MinimumOrderValue)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractNext'),20)

WebUI.waitForElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractFinishButton'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractFinishButton'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractFinishButton'),20)

//Revalidate Button
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Mandatory field messages check
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/MandatoryFieldMsgs'), 20)

MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println(MandatoryFields.size())
System.out.println("Fields:"+MandatoryFields)

//Account: Primary Billing Contact
String URL = WebUI.getAttribute(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/AccountNameonPA'), 'href')
System.out.println("URL of the Account:"+URL)

WebUI.callTestCase(findTestCase('Test Cases/OpenInaNewTab'), [('Path'):URL])
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContact'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContactEdit'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContactInputField'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBilling-NewContact'),20)

//Verify New Contact Page is loaded and select VIPRE Record Type Contact
WebUI.verifyElementPresent(findTestObject('Object Repository/ContactObject/NewContactPopupScreen'), 20)
WebUI.click(findTestObject('Object Repository/ContactObject/VIPREContactRecordType'))
WebUI.click(findTestObject('Object Repository/ContactObject/NextButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/ContactObject/NewContactVIPREelement'), 20)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationLabel'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationValue',[('value') : GlobalVariable.Salutation]),20)
	
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/FirstName'), GlobalVariable.FirstName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Last Name'), GlobalVariable.LastName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Account Name'), GlobalVariable.AccountName_Reseller_VIPRE)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/AccountNameList',[('value') : GlobalVariable.AccountName_Reseller_VIPRE]),20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Email'), GlobalVariable.Email)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Phone'), GlobalVariable.PhoneNumber)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Title'), GlobalVariable.Title)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SaveButton'),20)
WebUI.sleep(10000)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/SaveButton'),20)
WebUI.sleep(10000)
WebUI.switchToWindowIndex(0)

//Revalidate Button
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Mandatory field messages check
MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

//Primary Contact
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/PrimaryContactField',[('value') : MandatoryFields]),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/PrimaryContactclick'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/PrimaryContactclick'),GlobalVariable.FirstName)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SelectListedContact',[('value') : GlobalVariable.FirstName]),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Mandatory field messages check
MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

//Ongoing Account Manager
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/OngoingAccountManagers/OngoingAccountManagerLabel',[('value') : MandatoryFields]), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/OngoingAccountManagers/EditButtonOngoingManager'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/OngoingAccountManagers/InputOngoingManager'),GlobalVariable.LoginUserNameVIPRE)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/OngoingAccountManagers/ClickOngoingManagerValue',[('value') : MandatoryFields]), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Resale Territory - Get next Mandatory Field
MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/Resale Territorys/ResaleTerritory',[('value') : MandatoryFields]), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Resale Territorys/EditResaleTerritory'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/Resale Territorys/ResaleTerritoryInput'),GlobalVariable.SalesTerritory_VIPRE)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Payment Method
MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodLabel',[('value') : MandatoryFields]), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodEdit'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodValue',[('value') : GlobalVariable.PaymentMethod]),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Pricing Information
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/PricingInformationRevalidateMessage'),20)

MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
System.out.println("Fields:"+MandatoryFields)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/PricingTab'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/EditPricingInformation'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/PricingInformationInput'),GlobalVariable.PricingInformation)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/DetailsTab'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Validation Message for PA Document Ready for Signature
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PAOutforSignatureValidationMsg'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/SendPAforSignButton'),20)


//Enter Start Date and Stage to Close-Won
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateField'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateEdit'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateInput'),GlobalVariable.StartDate)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-SalesQualified'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-SalesQualified'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-ClosedWon'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)

//StageValue=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/GetStageValue'))
//System.out.println(StageValue)
WebUI.sleep(5000)
WebUI.scrollToPosition(0, 10)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PACloseWonValidationMsg'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.closeWindowIndex(1)

//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/GetStageValue'),20)
//StageValue=WebUI.verifyElementText(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/GetStageValue'), 'Closed Won')
//System.out.println(StageValue)

//if(WebUI.verifyMatch(StageValue, 'Closed Won', false))
//{
	//System.out.println("Opportunity is Closed Won successfully")
//}
