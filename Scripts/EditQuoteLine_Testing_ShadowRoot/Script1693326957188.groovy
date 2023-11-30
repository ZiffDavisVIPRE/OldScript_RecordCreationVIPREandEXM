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

WebUI.callTestCase(findTestCase('Test Cases/LogintoSalesforce-Admin'),null)
WebUI.navigateToUrl('https://vipre-exm--qa.sandbox.lightning.force.com/one/one.app#eyJjb21wb25lbnREZWYiOiJvbmU6YWxvaGFQYWdlIiwiYXR0cmlidXRlcyI6eyJhZGRyZXNzIjoiaHR0cHM6Ly92aXByZS1leG0tLXFhLS1zYnFxLnNhbmRib3gudmYuZm9yY2UuY29tL2FwZXgvc2I%2FaWQ9YTI2MEUwMDAwMDFSQmFLUUFXIn0sInN0YXRlIjp7fX0%3D')

WebUI.switchToFrame(findTestObject('Object Repository/QuoteLineandQuote/IFrameSelector'), 20, FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyElementPresent(findTestObject('Object Repository/ShadowRoot_Test_EditQuote/EditQuote_Text'),20, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/ShadowRoot_Test_EditQuote/SubscriptionTerm'), '24', FailureHandling.STOP_ON_FAILURE)