import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.openBrowser(null)

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Page_Swag Labs/input_Username (23)'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Password (23)'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_login-button (24)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-backpack (10)'))

WebUI.click(findTestObject('Page_Swag Labs/a_Cart, 1 items (7)'))

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Backpackcarry.allTheThings() wit (4)'), 0)

WebUI.click(findTestObject('Page_Swag Labs/button_checkout (4)'))

WebUI.setText(findTestObject('Page_Swag Labs/input_First Name (3)'), 'silvia')

WebUI.setText(findTestObject('Page_Swag Labs/input_Last Name (3)'), 'simamora')

WebUI.setText(findTestObject('Page_Swag Labs/input_Zip_Postal Code (2)'), '123456')

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_checkout_info'), 0)

WebUI.click(findTestObject('Page_Swag Labs/input_continue (4)'))

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Backpackcarry.allTheThings() wit (4)'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_Payment Information'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_Free Pony Express Delivery'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_Item total_ 29.99'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_Tax_ 2.40'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_Total_ 32.39 (2)'), 0)

