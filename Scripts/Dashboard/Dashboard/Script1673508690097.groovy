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

WebUI.callTestCase(findTestCase('Login BackOffice/Login BackOffice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Dashboard/li_Dashboard'))

WebUI.click(findTestObject('Object Repository/Dashboard/li_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/canvas_Monthly_bar-chart'), 0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Dashboard/div_Transaction Online vs Offline          _a0e5a0'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Transaction Online vs Offline          _a0e5a0'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Offline Transaction Payment Methods    _cf66f8'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Dashboard/div_Online Transaction Payment Methods     _65ea24'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Online Transaction Payment Methods     _65ea24'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Prepaid Transaction ResultsPay n Pick (_9ce269'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Dashboard/div_Online Transaction - Order Types       _72bc22'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Online Transaction - Order Types       _72bc22'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_GoSend - Completion Rate            Per_746231'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_GoSend - Distance Percentage           _3d652e'), 
    0)

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('Dashboard/div_Unique Customer          Period 01-Janu_13c697'), 3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_Unique Customer          Period 01-Janu_13c697'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/div_User Acquisition          Period 01-Jan_3caca8'), 
    0)

WebUI.click(findTestObject('Login_BO/button_Dashboard___BVID__28__BV_toggle_'))

WebUI.click(findTestObject('Login_BO/a_Logout'))

WebUI.closeBrowser()

