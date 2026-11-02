import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def o={String n,String x->new TestObject(n).addProperty('xpath',ConditionType.EQUALS,x)}
WebUI.openBrowser(''); WebUI.navigateToUrl('https://www.saucedemo.com/')
WebUI.setText(o('user','//*[@id="user-name"]'),'locked_out_user'); WebUI.setText(o('pass','//*[@id="password"]'),'secret_sauce'); WebUI.click(o('login','//*[@id="login-button"]'))
WebUI.verifyElementPresent(o('error','//*[contains(@data-test,"error")]'),10); WebUI.closeBrowser()