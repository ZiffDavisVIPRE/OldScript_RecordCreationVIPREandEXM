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

//WebUI.callTestCase(findTestCase('Test Cases/CreatePAOpp-User-ExcelMicro-DirectAccount'), null)


//Add a Product Validation and Add Products
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductRevalidation'),20)
WebUI.scrollToPosition(0, 3500)

WebUI.waitForElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'),20)

WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/PriceBookHeader-ExcelMicro'), 20)
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
//WebUI.sendKeys(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/QuantityInput'),GlobalVariable.Quantity)
WebUI.sendKeys(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/QuantityInput'),GlobalVariable.Quantity, FailureHandling.STOP_ON_FAILURE)
WebUI.sleep(1000)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProduct-Clickproduct'),20)

//Click Save and close
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProductSaveButton'),20)
WebUI.sleep(1000)

//Revalidate Message
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'), 20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
WebUI.sleep(1000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Generate MSP Pricing
WebUI.verifyElementPresent(findTestObject('Object Repository/GenerateMSPPricing/GenerateMSPPricingValidationMessage'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/GenerateMSPPricing/GenerateMSPPricingButton'),20)

WebUI.verifyElementPresent(findTestObject('Object Repository/GenerateMSPPricing/GenerateMSPScreenMessage'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/GenerateMSPPricing/ClickNextToGenerateMSPMessage'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/GenerateMSPPricing/NextButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/GenerateMSPPricing/PricingGeneratedSuccessfullyMessage'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/GenerateMSPPricing/FinishButton'),20)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/PricingTab'),20)
PricingTableCount=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/GetMSPPricingTableCount'))
System.out.println(PricingTableCount)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PricingInformation/DetailsTab'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)


//Click Create Draft Contract

WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractValidation'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftcontractButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractScreenValidation'), 20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/MSP-ContractStartDate'), GlobalVariable.MSPContractStartDate)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/MSP-MinumumMonthlyCommitment'),GlobalVariable.MSPMinumumMonthlyCommitment)
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

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationLabel'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationValue',[('value') : GlobalVariable.Salutation]),20)
	
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/FirstName'), GlobalVariable.FirstName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Last Name'), GlobalVariable.LastName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Account Name'), GlobalVariable.AccountName_Reseller_ExcelMicro)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/AccountNameList',[('value') : GlobalVariable.AccountName_Reseller_ExcelMicro]),20)

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

//Payment Method
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodLabel',[('value') : MandatoryFields]), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodEdit'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Payment Method/PaymentMethodValue',[('value') : GlobalVariable.PaymentMethod]),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)

//Mandatory field messages check
//MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
//System.out.println("Fields:"+MandatoryFields)

//Validation Message for PA Document Ready for Signature
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PAOutforSignatureValidationMsg'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/MSP-ShowmoreActionButtonforSendPA'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/MSP-SendPAforSignButton'),20)

//Enter Start Date
WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateField'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateEdit'),20)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateInput'),GlobalVariable.StartDatePA_ExcelMicro)
WebUI.waitForElementVisible(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'), 20)
WebUI.click(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'))


//Revalidate Message
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PAOutforSignatureValidationMsg'), 20)

//Changing the Stage from Sales Qualified to Close-Won
WebUI.click(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StageEdit'), FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-SalesQualified'),20)
WebUI.click(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-ClosedWon'))
WebUI.waitForElementVisible(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'), 20)
WebUI.click(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'))

//Revalidate Message
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PACloseWonValidationMsg'), 20, FailureHandling.STOP_ON_FAILURE)







//Enter Start Date and save the record
//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateField'), 20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateEdit'),20)
//WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/StartDateInput'),GlobalVariable.StartDatePA_ExcelMicro)
//WebUI.sleep(10000)

//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-SalesQualified'), 20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-SalesQualified'),20)
//WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/Stage-ClosedWon'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)

//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/ResaleTerritory'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
//WebUI.sleep(10000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/StartDate and Stage/CloseErrorDialog'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
//WebUI.sleep(10000)

//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PACloseWonValidationMsg'), 20, FailureHandling.STOP_ON_FAILURE)

