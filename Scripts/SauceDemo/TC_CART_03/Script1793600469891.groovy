import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

def objectByXpath = { String name, String xpath ->
    new TestObject(name).addProperty('xpath', ConditionType.EQUALS, xpath)
}

def username = objectByXpath('username', '//*[@id="user-name"]')
def password = objectByXpath('password', '//*[@id="password"]')
def loginButton = objectByXpath('loginButton', '//*[@id="login-button"]')
def inventoryItem = objectByXpath('inventoryItem', '(//*[contains(@class,"inventory_item")])[1]')
def addToCartButton = objectByXpath('addToCartButton', '(//*[contains(@class,"inventory_item")])[1]//button[starts-with(@id,"add-to-cart")]')
def cartLink = objectByXpath('cartLink', '//*[@class="shopping_cart_link"]')
def removeButton = objectByXpath('removeButton', '//button[starts-with(@id,"remove-")]')
def cartItem = objectByXpath('cartItem', '//*[contains(@class,"cart_item")]')

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.waitForElementVisible(username, 10)
WebUI.setText(username, 'standard_user')
WebUI.setText(password, 'secret_sauce')
WebUI.click(loginButton)

WebUI.waitForElementVisible(inventoryItem, 10)
WebUI.waitForElementVisible(addToCartButton, 10)
WebUI.click(addToCartButton)

WebUI.waitForElementVisible(cartLink, 10)
WebUI.click(cartLink)

WebUI.waitForElementVisible(cartItem, 10)
WebUI.waitForElementVisible(removeButton, 10)
WebUI.click(removeButton)

WebUI.verifyElementNotPresent(cartItem, 10)
WebUI.closeBrowser()