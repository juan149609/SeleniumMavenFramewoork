package main.java.pageEvents;

import main.java.pageObjects.ItemPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class ItemPageEvents {

    public void clickOnExit() {
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Clicking the exit button");
        elementFetch.getWebElement("XPATH", ItemPageElements.exitBtn).click();
    }
    public void selectItem(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Selecting two items");
        elementFetch.getWebElement("XPATH", ItemPageElements.laptop).click();
        elementFetch.getWebElement("XPATH", ItemPageElements.qty).click();
    }

    public void addToTheCart(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Add to the cart and back home");
        elementFetch.getWebElement("XPATH", ItemPageElements.addToCartBtn).click();
        elementFetch.getWebElement("XPATH", ItemPageElements.homeBtn).click();
    }
}
