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

//WebUI.callTestCase(findTestCase('Test Cases/DirectQuoteCreation-VIPRE'), null)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/EditLineButton'), 20)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/EditLineButton'))

WebUI.switchToFrame(findTestObject('Object Repository/QuoteLineandQuote/IFrameSelector'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/EditQuoteTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/AddProductButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ProductSelectionTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SearchProductSearchBar'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/QuoteLineandQuote/SearchProductSearchBar'), GlobalVariable.Product, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/ClickSearchButton'), FailureHandling.STOP_ON_FAILURE)

//WebUI.getText(findTestObject, FailureHandling.STOP_ON_FAILURE)
//WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ProdutCode',[('value') : GlobalVariable.Product]))
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ProdutCode', [('value') : GlobalVariable.Product]),
	20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SelectProductCheckbox', [('value') : GlobalVariable.Product]),
	FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SelectProduct-SelectionPage'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/EditQuoteTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SaveButton'), FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSelection'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Calling QuoteSigning Testcases to accept the quote without sending for signing')

WebUI.callTestCase(findTestCase('Test Cases/QuoteSigning'), null, FailureHandling.STOP_ON_FAILURE)
WebUI.sleep(5000)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/QuoteLineandQuote/Tab_Details'),30)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/QuoteLineandQuote/AcceptedSalesProcess'),
	30)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/QuoteLineandQuote/MarkasCurrentStatus'),
	30)
sleep(20000)
WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ContractNameDisplayVerify'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToElement(findTestObject('Object Repository/QuoteLineandQuote/ClickContract'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/QuoteLineandQuote/ClickContract'),
	30)
//WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/ClickContract'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/ContractPageVerify'), 20, FailureHandling.STOP_ON_FAILURE)

