package main.java.pageEvents;

import static test.java.BaseTest.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.MenuPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class MenuPageEvents {
	
	public void onModalOpen() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking CREATE NEW ACCOUNT");
		//Assert.assertTrue(elementFetch.getListWebElements("XPATH", MenuPageElements.registerText).size()>0, "Menu modal did not open");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(MenuPageElements.createNewAccount)));
		
		elementFetch.getWebElement("XPATH", MenuPageElements.createNewAccount).click();
	}

}
