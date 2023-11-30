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

WebUI.callTestCase(findTestCase('Test Cases/LogintoSalesforce-Admin'), null)

WebUI.verifyElementPresent(findTestObject('Object Repository/AccountCreationPage/VIPRESalesElement'), 30)
WebUI.sleep(2000)
WebUI.click(findTestObject('Object Repository/UserLoginSearch/SearchButton'), FailureHandling.STOP_ON_FAILURE)

//Enter the value and press Enter in search
WebUI.sendKeys(findTestObject('Object Repository/UserLoginSearch/SearchInput'), GlobalVariable.LoginUserNameExcelMicro)
WebUI.sendKeys(findTestObject('Object Repository/UserLoginSearch/SearchInput'), Keys.chord(Keys.ENTER))

//Click on the people
WebUI.verifyElementPresent(findTestObject('Object Repository/UserLoginSearch/PeopleElement'), 20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/UserLoginSearch/PeopleElement'),20)
WebUI.click(findTestObject('Object Repository/UserLoginSearch/SelectUserfromPeople'))

//Click User Detail
WebUI.click(findTestObject('Object Repository/UserLoginSearch/UserDetailButton'))

//Click login
WebUI.switchToFrame(findTestObject('Object Repository/UserLoginSearch/UserIframe'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/UserLoginSearch/LoginButton'), 30)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/UserLoginSearch/LoginButton'),20)
