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

//WebUI.callTestCase(findTestCase('Test Cases/CreatingNewDirectAccount-VIPRE'), null)

//WebUI.callTestCase(findTestCase('Test Cases/CreatingNewDirectAccount-ExcelMicro'), null)

//Click on Contact Object Related List Link from Account Page
WebUI.scrollToPosition(0, 0, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementClickable(findTestObject('Object Repository/ContactObject/ContactLinkObject'))

WebUI.click(findTestObject('Object Repository/ContactObject/ContactLinkObject'))

//Verify Contact title is displayed when the contact page is loaded and click New Button
WebUI.verifyElementPresent(findTestObject('Object Repository/ContactObject/ContactTitle'), 20)

WebUI.click(findTestObject('Object Repository/ContactObject/NewButtonOnContact'))

//Verify New Contact Page is loaded and select VIPRE Record Type Contact
//WebUI.verifyElementPresent(findTestObject('Object Repository/ContactObject/NewContactPopupScreen'), 20)

//WebUI.click(findTestObject('Object Repository/ContactObject/VIPREContactRecordType'))

//WebUI.click(findTestObject('Object Repository/ContactObject/NextButton'))

//WebUI.verifyElementPresent(findTestObject('Object Repository/ContactObject/NewContactVIPREelement'), 20)

//Setting values for Contact
WebUI.scrollToElement(findTestObject('Object Repository/ContactObject/SalutationLabel'), 20)

WebUI.click(findTestObject('Object Repository/ContactObject/SalutationNone'))

WebUI.click(findTestObject('Object Repository/ContactObject/SalutationMs'))

WebUI.setText(findTestObject('Object Repository/ContactObject/FirstName'), GlobalVariable.FirstName)

WebUI.setText(findTestObject('Object Repository/ContactObject/LastName'), GlobalVariable.LastName)

WebUI.setText(findTestObject('Object Repository/ContactObject/Email'), GlobalVariable.Email)

WebUI.setText(findTestObject('Object Repository/ContactObject/Phone'), GlobalVariable.PhoneNumber)

WebUI.setText(findTestObject('Object Repository/ContactObject/Title'), GlobalVariable.Title)

WebUI.click(findTestObject('Object Repository/ContactObject/SaveButton'))

//click on the created Contact. Concatinating the FirstName and LastName and send it as a variable
String Name = WebUI.concatenate([GlobalVariable.FirstName,GlobalVariable.LastName] as String[], FailureHandling.STOP_ON_FAILURE)
println(Name)

CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/ContactObject/ContactCreated'),20)
//WebUI.click(findTestObject('Object Repository/ContactObject/ContactCreated'))
//WebUI.click(findTestObject('Object Repository/ContactObject/ContactCreated',[('value') : Name]))

