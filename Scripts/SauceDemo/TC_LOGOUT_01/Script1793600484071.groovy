import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def o={String n,String x->new TestObject(n).addProperty('xpath',ConditionType.EQUALS,x)}
WebUI.openBrowser(''); WebUI.navigateToUrl('https://www.saucedemo.com/'); WebUI.setText(o('u','//*[@id="user-name"]'),'standard_user'); WebUI.setText(o('p','//*[@id="password"]'),'secret_sauce'); WebUI.click(o('l','//*[@id="login-button"]')); WebUI.click(o('menu','//*[@id="react-burger-menu-btn"]')); WebUI.click(o('logout','//*[@id="logout_sidebar_link"]')); WebUI.verifyElementPresent(o('login','//*[@id="login-button"]'),10); WebUI.closeBrowser()