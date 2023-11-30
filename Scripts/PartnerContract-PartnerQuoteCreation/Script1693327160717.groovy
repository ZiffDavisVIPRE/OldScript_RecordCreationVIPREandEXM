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


//WebUI.callTestCase(findTestCase('Test Cases/CreatePAOpp-User-VIPRE'), null)

//Validation Message to fill Partner Model and Accreditation Level
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelValidationMessageRevalidate'), 20)
//MandatoryFields=WebUI.getText(findTestObject('Object Repository/PAOppMandatoryField/MandatoryField/GetMandatoryFields'))
//System.out.println("Fields:"+MandatoryFields)

//Selecting Partner Model
//WebUI.scrollToPosition(0, 800)

//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/QualificationElement'),20)

//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelEdit'),20)
////WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelNone'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PartnerModel/PartnerModelValues',[('value') : GlobalVariable.ResellerPartnerModel]),20)

//Selecting Accreditation Level
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Accreditation/AccreditationNone'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Accreditation/AccreditationValues',[('value') : GlobalVariable.ResellerAccreditationLevel]),20)

//Click Save and Revalidate
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/SaveButton'),20)
//WebUI.sleep(5000)
//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'), 20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)


//Add a Product Validation and Add Products
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductRevalidation'),20)
//WebUI.scrollToPosition(0, 3500)

//WebUI.waitForElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'), 20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/AddProductButton'),20)

//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/PriceBookHeader-VIPRE'), 20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/PAProductSelection',[('value') : GlobalVariable.PAProducts]),20)

//Click Next
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/NextButton'),20)

//Verify Edit Selected Product
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProductVerification'), 20)

//Edit Sales Price
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickSalePrice'),20)
//WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/SalesPriceInput'), GlobalVariable.SalePrice)

//Edit Quantity
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickEditQuantity'),20)
//WebUI.sendKeys(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/QuantityInput'),GlobalVariable.Quantity)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/ClickLineDescription'),20)

//Click Save and close
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/AddandEditProducts/EditSelectedProductSaveButton'),20)
//WebUI.sleep(1000)


//Revalidate Message
//WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'), 20)
//WebUI.sleep(1000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)
//WebUI.sleep(1000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/RevalidateButton'),20)


//Click Create Draft Contract

//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractValidation'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftcontractButton'),20)
//WebUI.verifyElementPresent(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractScreenValidation'), 20)

//WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ResellerPartner-AnnualSalesTarget'),GlobalVariable.AnnualSalesTarget)
//WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ResellerPartner-MinimumOrderValue'), GlobalVariable.MinimumOrderValue)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/CreateDraftContractNext'),20)

//String Contract = WebUI.getAttribute(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ClickhereOnContract'), 'href')
//System.out.println("URL of the Contract:"+Contract)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/CreateDraftContract/ClickhereOnContract'),20)

//WebUI.switchToWindowIndex(2)

//WebUI.callTestCase(findTestCase('Test Cases/LogintoSalesforce-Admin'), null)
//WebUI.navigateToUrl('https://vipre-exm--qa.sandbox.lightning.force.com/lightning/r/Contract/800JX000005DbTVYA0/view')

WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerAgreementContract/ContractWordValidation'), 20)
//WebUI.waitForElementPresent(findTestObject('Object Repository/PartnerAgreementContract/ContractWordValidation'), 30)
WebUI.click(findTestObject('Object Repository/PartnerAgreementContract/DetailsTab'))
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/DetailsTab'),20)
WebUI.getText(findTestObject('Object Repository/PartnerAgreementContract/StatusField'))
WebUI.verifyElementText(findTestObject('Object Repository/PartnerAgreementContract/StatusField'), 'Activated')

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/NewQuoteButton'),20)

//Partner Quote Creation
WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerQuoteCreationScreen/NewQuoteValidation'), 20)
WebUI.scrollToElement(findTestObject('Object Repository/PartnerQuoteCreationScreen/EndClientInputBox'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/EndClientInputBox'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/EndClient-NewAccount'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/AccountObject/NewAccountTextVerify'), 20)
//WebUI.click(findTestObject('Object Repository/AccountRecordTypes/ClientOfReseller'), FailureHandling.STOP_ON_FAILURE)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/AccountRecordTypes/ClientOfReseller'),20)
WebUI.click(findTestObject('Object Repository/AccountRecordTypes/NextButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AccountRecordTypes/ClientOfResellerTextVerify'),20)
WebUI.setText(findTestObject('Object Repository/CORAccountCreationPage/AccountNameInput'), GlobalVariable.COR_AccountName)

//Billing Address

//Billing Country
WebUI.scrollToElement(findTestObject('Object Repository/CORAccountCreationPage/BillingcountryLabel'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/CORAccountCreationPage/BillingCountryNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/CORAccountCreationPage/BillingCountryGreenland'),30)

//Billing Street
WebUI.setText(findTestObject('Object Repository/CORAccountCreationPage/BillingStreet'),GlobalVariable.COR_BillingStreet)
WebUI.setText(findTestObject('Object Repository/CORAccountCreationPage/PostalCode'),GlobalVariable.COR_PostalCode)
WebUI.setText(findTestObject('Object Repository/CORAccountCreationPage/BillingCity'),GlobalVariable.COR_BillingCity)

//Sales Territory
WebUI.scrollToElement(findTestObject('Object Repository/CORAccountCreationPage/SalesTerritoryLabel'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/CORAccountCreationPage/SalesTerritoryNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/CORAccountCreationPage/SalesTerritoryValue',[('value') : GlobalVariable.SalesTerritory_VIPRE]),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/CORAccountCreationPage/SaveButton'),20)
WebUI.sleep(5000)
 
//PrimaryContact
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/PrimaryContactInputbox'),20)
WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/Select_Contact'),20)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/NewContact'),20)
WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerQuoteCreationScreen/NewContactTextVerify'),20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/FirstName'), GlobalVariable.FirstName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Last Name'), GlobalVariable.LastName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Account Name'), GlobalVariable.COR_AccountName)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/AccountNameList',[('value') : GlobalVariable.COR_AccountName]),20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Email'), GlobalVariable.Email)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Phone'), GlobalVariable.PhoneNumber)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Title'), GlobalVariable.Title)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SaveButton'),20)
WebUI.sleep(10000)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuoteCreationScreen/SaveButton'),20)
