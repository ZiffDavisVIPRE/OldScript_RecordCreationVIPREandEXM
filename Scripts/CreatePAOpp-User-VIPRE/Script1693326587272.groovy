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

//WebUI.callTestCase(findTestCase('Test Cases/CreatingResellerAccount-User-VIPRE'), null)
WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/DropDownMenuonAccount'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/PAOpportunity-VIPRE'), FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('Object Repository/PartnerAcquisitionCreation/SalesTerritoryLabel'), 20, FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/SalesTerritoryNone'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/SalesTerritoryValue',[('value') : GlobalVariable.SalesTerritory_VIPRE]), FailureHandling.STOP_ON_FAILURE)

//WebUI.scrollToElement(findTestObject('Object Repository/PartnerAcquisitionCreation/BillingEntityLabel'), 20, FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/BillingEntityNone'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/BillingEntityValue',[('value') : GlobalVariable.BillingEntity_VIPRE]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/CloseDateBox'), FailureHandling.STOP_ON_FAILURE)
WebUI.setText(findTestObject('Object Repository/PartnerAcquisitionCreation/CloseDateBox'), GlobalVariable.CloseDateUser, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/SaveButton'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/ClickOpportunities'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerAcquisitionCreation/OpportunityTextVerify'), 30, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/PartnerAcquisitionCreation/ClickonCreatedOpportunity',[('value') : GlobalVariable.AccountName_Reseller_VIPRE]), FailureHandling.STOP_ON_FAILURE)

//WebUI.executeJavaScript('document.body.style.zoom="60%"', null)

WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerAcquisitionCreation/PAOppPageVerify',[('value') : GlobalVariable.AccountName_Reseller_VIPRE]), 20, FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/PartnerAcquisitionCreation/PartnerModelValidationMsg'), 20, FailureHandling.STOP_ON_FAILURE)

WebUI.sleep(2000)
