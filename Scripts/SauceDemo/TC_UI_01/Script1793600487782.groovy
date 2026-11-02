import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def o={String n,String x->new TestObject(n).addProperty('xpath',ConditionType.EQUALS,x)}
WebUI.openBrowser(''); WebUI.navigateToUrl('https://www.saucedemo.com/'); WebUI.setText(o('u','//*[@id="user-name"]'),'bad_user'); WebUI.setText(o('p','//*[@id="password"]'),'bad_password'); WebUI.click(o('l','//*[@id="login-button"]')); WebUI.verifyElementVisible(o('error','//*[contains(@data-test,"error")]')); WebUI.closeBrowser()