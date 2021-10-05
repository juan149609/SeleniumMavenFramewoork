package main.java.pageEvents;

import static test.java.BaseTest.driver;

import org.openqa.selenium.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;


public class HomePageEvents {
	//Test cases
    public void clickOnMenu() { 
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking the menu icon");//The specific test info for the report
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);//Declare and initialise a fluent wait
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS); //Here we specify the timeout of the wait
		wait.withTimeout(2, TimeUnit.SECONDS); //We specify the polling time
		
		wait.ignoring(NoSuchElementException.class);//Here we specify what exceptions to ignore
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(HomePageElements.signInButton))); //Here is where we specify the condition to wait on
		elementFetch.getWebElement("XPATH", HomePageElements.signInButton).click();
	}

}
