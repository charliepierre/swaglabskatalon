import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def o={String n,String x->new TestObject(n).addProperty('xpath',ConditionType.EQUALS,x)}
WebUI.openBrowser(''); WebUI.navigateToUrl('https://www.saucedemo.com/'); WebUI.setText(o('u','//*[@id="user-name"]'),'standard_user'); WebUI.setText(o('p','//*[@id="password"]'),'secret_sauce'); WebUI.click(o('l','//*[@id="login-button"]')); WebUI.selectOptionByLabel(o('sort','//*[@data-test="product-sort-container"]'),'Price (high to low)',false); WebUI.closeBrowser()