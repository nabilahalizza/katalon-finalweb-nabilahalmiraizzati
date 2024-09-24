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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.mainURL)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('user-menu'), 0)

WebUI.click(findTestObject('user-menu'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('createnewacc-btn'), 0)

WebUI.click(findTestObject('createnewacc-btn'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('createuname-field'), 0)

WebUI.setText(findTestObject('createuname-field'), 'Nabilah')

WebUI.setText(findTestObject('createmail-field'), 'nabilah@gmail.com')

WebUI.setText(findTestObject('createpass-field'), 'Pass123')

WebUI.setText(findTestObject('confirmpass-field'), 'Pass123')

WebUI.verifyElementPresent(findTestObject('iagree-cbx'), 0)

if (WebUI.verifyElementNotChecked(findTestObject('iagree-cbx'), 0)) {
    WebUI.check(findTestObject('iagree-cbx'))

    println('Checkbox was unchecked, now checked.')
} else {
    println('Checkbox was already checked.')
}

WebUI.delay(3)

WebUI.click(findTestObject('regist-btn'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('username-txt'), 0)

WebUI.click(findTestObject('user-menu'))

WebUI.click(findTestObject('logout-btn'))
