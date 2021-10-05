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
}
