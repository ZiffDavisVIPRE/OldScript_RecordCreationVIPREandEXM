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

//WebUI.callTestCase(findTestCase('Test Cases/PartnerContract-PartnerQuoteSelection'), null)

WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerQuotePageandEditlines/QuoteTextVerification'), 20)

//Verify the Status field value is set to Draft
WebUI.scrollToElement(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusField'), 20)
Status=WebUI.verifyElementText(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusFieldValue'), 'Draft')
System.out.println(Status)

//Verify the Partner Contract has the Contract Value
//WebUI.scrollToElement(findTestObject('Object Repository/PartnerQuotePageandEditlines/BillingSchedule_Section'), 20)

//WebUI.scrollToElement(findTestObject('Object Repository/PartnerQuotePageandEditlines/PartnerContract'), 20)
//Contract=WebUI.getAttribute(findTestObject('Object Repository/PartnerQuotePageandEditlines/PartnerContractValue'), 'href')
//System.out.println(Contract)
//WebUI.verifyNotMatch(Contract, null, false)
//System.out.println('success')

//EditLines
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/QuoteLineandQuote/EditLineButton'),20)
WebUI.switchToFrame(findTestObject('Object Repository/QuoteLineandQuote/IFrameSelector'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/EditQuoteTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/AddProductButton'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ProductSelectionTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SearchProductSearchBar'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/QuoteLineandQuote/SearchProductSearchBar'), GlobalVariable.Product, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/ClickSearchButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ProdutCode', [('value') : GlobalVariable.Product]),20, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SelectProductCheckbox', [('value') : GlobalVariable.Product]),FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SelectProduct-SelectionPage'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/EditQuoteTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)

//Edit Quantity
WebUI.doubleClick(findTestObject('Object Repository/PartnerQuotePageandEditlines/EditQuantity'))
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/EditQuantity'),20)
WebUI.sendKeys(findTestObject('Object Repository/PartnerQuotePageandEditlines/QuantityInput'), GlobalVariable.ProductQuantity)
//WebUI.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerQuotePageandEditlines/TargetCustomerAmountLabel'), 20)
WebUI.click(findTestObject('Object Repository/PartnerQuotePageandEditlines/TargetCustomerAmountField'))

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/QuickSaveButton'),20)
WebUI.sleep(1000)

Quantity=WebUI.getText(findTestObject('Object Repository/PartnerQuotePageandEditlines/QuantityValue'))
//BigDecimal Quantities = new BigDecimal(Quantity)
System.out.println(Quantity)
//QuantityNew=Quantity.replace(',','').toInteger()
//System.out.println(QuantityNew)

UnitPrice=WebUI.getText(findTestObject('Object Repository/PartnerQuotePageandEditlines/ListUnitPriceValue'))
UnitPrices=UnitPrice.split(" ")[0]
System.out.println(UnitPrices)
//BigDecimal ListUnitPrice = new BigDecimal(UnitPrices)
//double ListUnitPrice=Double.valueOf(UnitPrices)
//ListUnitPrice=UnitPrices.replace(',','').toInteger()

//System.out.println(ListUnitPrice)


Subscription=WebUI.getAttribute(findTestObject('Object Repository/PartnerQuotePageandEditlines/SubscriptionTerm'), 'value')
//BigDecimal SubscriptionTerm = new BigDecimal(Subscription)
//SubscriptionTerm=Subscription.replace(',','').toInteger()
//System.out.println(SubscriptionTerm)

//ARR = Quantity * ListUnitPrice * SubscriptionTerm
//System.out.println(ARR)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SaveButton'), FailureHandling.STOP_ON_FAILURE)
WebUI.sleep(5000)
//WindowIndex=WebUI.getWindowIndex()
//System.out.println(WindowIndex)

//WebUI.switchToWindowIndex(2)
//WebUI.waitForElementPresent(findTestObject('Object Repository/PartnerAgreementContract/ContractWordValidation'), 30)
//WebUI.refresh()
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/DetailsTab'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/EditStatusField'),20)
//WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/StatusFieldDraft'),20)
//WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/StatusFieldActivated'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/SaveButtonOnContract'),20)

//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/Start Date Field'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/StartDate Input'),20)
//WebUI.setText(findTestObject('Object Repository/PartnerAgreementContract/StartDate Input'), GlobalVariable.StartDate_PartnerContract)
//WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/SaveButtonOnContract'),20)


//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/EndClientCancellation'),20)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/EndClientCancellationInput'),20)
//WebUI.setText(findTestObject('Object Repository/PartnerAgreementContract/EndClientCancellationInput'),GlobalVariable.EndClientCancellation)
//WebUI.sleep(5000)
//CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerAgreementContract/SaveButtonOnContract'),20)

//WebUI.switchToWindowIndex(2)

WebUI.callTestCase(findTestCase('Test Cases/QuoteSigning'), null)

WebUI.click(findTestObject('Object Repository/PartnerQuotePageandEditlines/Tab_Details'))
WebUI.scrollToElement(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusField'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusFieldEdit'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusFieldNone'),20)
WebUI.sleep(5000)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusFieldAccepted'),20)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/SaveButton'),20)
StatusValue=WebUI.getText(findTestObject('Object Repository/PartnerQuotePageandEditlines/StatusFieldValue'))
WebUI.verifyMatch(StatusValue, "Accepted", false)
WebUI.sleep(10000)
WebUI.refresh()
WebUI.refresh()

WebUI.waitForElementPresent(findTestObject('Object Repository/PartnerQuotePageandEditlines/ContractName'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerQuotePageandEditlines/ClickContractName'),20)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PartnerCustomerOrder/DetailsTab'),20)
//WebUI.refresh()
//WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerCustomerOrder/ContractRecordTypeField'), 20)
//ContractRecord=WebUI.getText(findTestObject('Object Repository/PartnerCustomerOrder/ContractRecordTypeValue'))
//System.out.println(ContractRecord)
//WebUI.verifyMatch(ContractRecord, 'Partner Customer Order', false)

//StatusField=WebUI.getText(findTestObject('Object Repository/PartnerCustomerOrder/StatusFieldValue'))
//System.out.println(StatusField)
//WebUI.verifyMatch(StatusField, 'Activated', false)