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

//WebUI.callTestCase(findTestCase('Test Cases/CreatingNewContact-User'), null)

WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/NewDirectQuoteButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DirectQuoteCreationObject/NewDirectQuoteTextVisibility'), 20)

WebUI.scrollToElement(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSalesTerritory'), 20)

WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSalesTerritory'))

WebUI.click(findTestObject('DirectQuoteCreationObject/QuoteSalesTerritoryValue', [('value') : GlobalVariable.SalesTerritory_VIPRE]))

WebUI.scrollToElement(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteBillingEntity'), 20)

WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteBillingEntity'))

WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/BillingEntityValue',[('value') : GlobalVariable.BillingEntity_VIPRE]))

WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSaveButon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteElementVerify'), 20, FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSelection'),	30)
//WebUI.click(findTestObject('Object Repository/DirectQuoteCreationObject/QuoteSelection'))
