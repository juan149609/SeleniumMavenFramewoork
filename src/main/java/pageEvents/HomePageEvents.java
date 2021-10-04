package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;


public class HomePageEvents {

    public void clickOnMenu() { 
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the menu icon");
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}

}
