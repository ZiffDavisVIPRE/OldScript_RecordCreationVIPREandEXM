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

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContact'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContactEdit'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBillingContactInputField'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/PrimaryBilling-NewContact'),20)

WebUI.scrollToElement(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationLabel'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationNone'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SalutationValue',[('value') : GlobalVariable.Salutation]),20)
	
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/FirstName'), GlobalVariable.AccountFirstName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Last Name'), GlobalVariable.AccountLastName)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Account Name'), GlobalVariable.AccountName_Direct_ExcelMicro)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/AccountNameList',[('value') : GlobalVariable.AccountName_Direct_ExcelMicro]),20)

WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Email'), GlobalVariable.AccountEmail)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Phone'), GlobalVariable.PhoneNumber)
WebUI.setText(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/Title'), GlobalVariable.Title)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/PrimaryContact/SaveButton'),20)
WebUI.sleep(10000)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/PAOppMandatoryField/Account-PrimaryBillingContact/SaveButton'),20)
WebUI.sleep(10000)