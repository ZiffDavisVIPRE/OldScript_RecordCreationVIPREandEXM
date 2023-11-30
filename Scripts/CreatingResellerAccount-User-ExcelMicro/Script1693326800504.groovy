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
WebUI.sleep(5000)
WebUI.verifyElementPresent(findTestObject('Object Repository/AccountCreationPage/ExcelMicroSalesElement'), 30)

//Selecting Accounts Object on Home page using JavaScript executor
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/AccountObject/AccountsTab'), 30)

//Selecting New Button on Account to create a New Account Record using Javascript executor
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/AccountObject/NewButtononAccount'),	30)
WebUI.click(findTestObject('Object Repository/AccountRecordTypes/Reseller'))
WebUI.click(findTestObject('Object Repository/AccountRecordTypes/NextButton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AccountRecordTypes/ResellerTextVerify'), 20, FailureHandling.STOP_ON_FAILURE)

//Account Details of ExcelMicro

WebUI.sendKeys(findTestObject('AccountCreationPage/AccountName'), GlobalVariable.AccountName_Reseller_ExcelMicro)
//WebUI.scrollToElement(findTestObject('Object Repository/AccountCreationPage/AccountCurrencyLabel'), 20)

WebUI.scrollToElement(findTestObject('Object Repository/AccountCreationPage/SalesTerritoryLabel'), 20)
WebUI.click(findTestObject('Object Repository/AccountCreationPage/SalesTerritoryNone'))
WebUI.click(findTestObject('Object Repository/AccountCreationPage/SalesTerritoryValue',[('value') : GlobalVariable.SalesTerritory_ExcelMicro]))

//Selecting Billing CountryObject Repository/UserLoginSearch/UserIframe
WebUI.scrollToElement(findTestObject('Object Repository/AccountCreationPage/BillingCountryLabel'), 20)
WebUI.click(findTestObject('Object Repository/AccountCreationPage/BillingCountryNone'))
WebUI.click(findTestObject('Object Repository/AccountCreationPage/BillingCountryBahrain'))

//Setting the Address and Company Registration Number
WebUI.setText(findTestObject('AccountCreationPage/BillingStreet'), GlobalVariable.BillingStreet)
WebUI.setText(findTestObject('AccountCreationPage/BillingCity'), GlobalVariable.BillingCity)
WebUI.setText(findTestObject('AccountCreationPage/PostalCode'), GlobalVariable.PostalCode)
//WebUI.setText(findTestObject('AccountCreationPage/CompanyRegistrationNo'), GlobalVariable.CompanyRegistrationNumber)

//Click on Save Button
WebUI.click(findTestObject('Object Repository/AccountCreationPage/SaveButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AccountCreationPage/AccountPageAppear'), 30)
