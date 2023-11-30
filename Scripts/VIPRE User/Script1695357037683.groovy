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

WebUI.click(findTestObject('Object Repository/UserLogin/SetUp'))
sleep 5000
WebUI.click(findTestObject('Object Repository/UserLogin/SetUpforCurrentApp'))
sleep 5000
WebUI.switchToWindowIndex(1)
WebUI.setText(findTestObject('Object Repository/UserLogin/SearchSetUp'),GlobalVariable.LoginUserNameVIPRE)
sleep 5000
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/UserLogin/SelectSearchUser',[('value') : GlobalVariable.LoginUserNameVIPRE]),20)
sleep 5000
WebUI.switchToFrame(findTestObject('Object Repository/UserLogin/UserIFrame'), 20)
WebUI.verifyElementPresent(findTestObject('Object Repository/UserLogin/IsActiveChecked'),20)
CustomKeywords.'vipreQA.ClickUsingJS.ClickNewObj'(findTestObject('Object Repository/UserLogin/LoginButton'),20)

WebUI.switchToWindowIndex(0)
WebUI.waitForElementVisible(findTestObject('Object Repository/PartnerAgreementContract/ContractWordValidation'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()
WebUI.refresh()
WebUI.waitForElementVisible(findTestObject('Object Repository/PartnerAgreementContract/ContractWordValidation'), 20, FailureHandling.STOP_ON_FAILURE)
