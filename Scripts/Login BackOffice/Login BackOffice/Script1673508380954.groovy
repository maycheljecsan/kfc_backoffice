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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.Url)
WebUI.maximizeWindow()

TestObject emailField = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@id='email']")
TestObject passField = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//input[@id='password']")
TestObject rememberChk = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//label[@for='remember']")
TestObject signInButton = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//button[contains(text(),'Sign In')]")
TestObject welcome = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//li//span[text()='Dashboard']")
TestObject logo = new TestObject().addProperty('xpath', ConditionType.EQUALS, "//img[contains(@src,'kfcLogo')]")

WebUI.setText(emailField, "admin@dana.ffi.co.id")
WebUI.setText(passField, "12345678")
if (GlobalVariable.remember == "Yes") {
	WebUI.check(rememberChk)
}
WebUI.click(signInButton)

//boolean val1 = WebUI.verifyElementPresent(welcome, 3)
//boolean val2 = WebUI.verifyElementPresent(logo, 3)
if ((WebUI.verifyElementPresent(welcome, 3)) || (WebUI.verifyElementPresent(logo, 3))) {
//if (val1 == true || val2 == true) {
	KeywordUtil.markPassed("Anda Berhasil Login")
} else {
	KeywordUtil.markFailed("Anda Gagal Login")
}

//if (WebUI.verifyElementPresent(welcome, 3)) {
//	KeywordUtil.markPassed("Anda Berhasil Login")
//} else {
//	KeywordUtil.markFailed("Anda Gagal Login")
//}



