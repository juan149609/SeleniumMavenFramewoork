package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.java.BaseTest;

import static test.java.BaseTest.driver;

public class HomePageEvents {


    public void clickOnMenu() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the menu icon");
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}

	public void clickOnSearch() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the search button");
		elementFetch.getWebElement("XPATH", HomePageElements.searchButton).click();
	}

	public void searchItem() {
		BaseTest.logger.info("Entering Item for Search");
		String item = "Laptop";

		WebDriverWait wait = new WebDriverWait(driver, 20);
		ElementFetch elementFetch = new ElementFetch();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageElements.searchBar)));
		elementFetch.getWebElement("XPATH", HomePageElements.searchBar).sendKeys(item);
		elementFetch.getWebElement("XPATH", HomePageElements.searchBar).sendKeys(Keys.ENTER);
	}

}
