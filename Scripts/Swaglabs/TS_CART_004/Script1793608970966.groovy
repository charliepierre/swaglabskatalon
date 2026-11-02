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

WebUI.setText(findTestObject('Page_Swag Labs/input_Username (17)'), 'standard_user')

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Password (17)'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_login-button (18)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-backpack (4)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-bike-light (1)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-bolt-t-shirt (1)'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-fleece-jacket'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-sauce-labs-onesie'))

WebUI.click(findTestObject('Page_Swag Labs/button_add-to-cart-test.allthethings()-t-shirt-('))

WebUI.click(findTestObject('Page_Swag Labs/a_Cart, 6 items'))

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Backpackcarry.allTheThings() wit (2)'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Bike LightA red light isnt the (1)'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Bolt T-ShirtGet your testing sup'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs Fleece JacketIts not every day'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Sauce Labs OnesieRib snap infant onesie for'), 0)

WebUI.assertElementPresent(findTestObject('Page_Swag Labs/div_1Test.allTheThings() T-Shirt (Red)This class'), 0)

