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

WebUI.navigateToUrl('https://www.kompas.com/')

//delay to make sure the webpage loads correctly
WebUI.delay(5)

//navigate to login page
WebUI.click(findTestObject('Login/btn_Profile'))

WebUI.click(findTestObject('Login/btn_Login'))

//verify that already on login page
WebUI.verifyElementPresent(findTestObject('Login/lbl_LoginForVerify'), 0)

WebUI.setText(findTestObject('Login/tb_Email'), 'hananurulaz@gmail.com')

WebUI.setText(findTestObject('Login/tb_Password'), 'halohalo')

WebUI.click(findTestObject('Login/btn_MainLogin'))

//verify that inputs are false
WebUI.verifyElementPresent(findTestObject('Login/lbl_WrongInput'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

