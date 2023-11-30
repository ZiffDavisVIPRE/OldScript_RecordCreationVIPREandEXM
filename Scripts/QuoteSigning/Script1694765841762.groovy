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

//WebUI.callTestCase(findTestCase('Test Cases/LoginasExcelMicroUser'), null)
//WebUI.navigateToUrl('https://vipre-exm--qa.sandbox.lightning.force.com/lightning/r/SBQQ__Quote__c/a260E000001RHH6QAO/view', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/Tab_SystemonQuote'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/Text_SignedDocumentValidation'), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/Field_OverrideSignedDocumentValidation'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/btn_EditOverrideDocument'), FailureHandling.STOP_ON_FAILURE)
WebUI.scrollToPosition(0, 40, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/ChkBox_OverrideSigned'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/QuoteLineandQuote/SystemTabonQuote/btn_Save'), FailureHandling.STOP_ON_FAILURE)