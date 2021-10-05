package main.java.pageEvents;

import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import main.java.pageObjects.CheckoutPageElements;
import main.java.pageObjects.HomePageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class CheckoutPageEvents {
	
	/*public void loginMethod() {
		BaseTest.logger.info("Login User");
		
		ElementFetch elementFetch = new ElementFetch();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.chName)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).click();
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).clear();		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).sendKeys(BaseTest.excelPropertyLoader.getValue("chusername"));
        
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.chName)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).click();
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).clear();	
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).sendKeys(BaseTest.excelPropertyLoader.getValue("chpassword"));	
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.chBtn)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chBtn).click();
		
	}*/
	//Test cases
	public void clickOnCart() {
    	BaseTest.logger.info("Clicking Menu Cart");
    
    	ElementFetch elementFetch = new ElementFetch();
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.checkoutCart)));		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutCart).click();
	}

    public void clickOnCheckout() {
    	
    	BaseTest.logger.info("Clicking Checkout Button");
        
    	ElementFetch elementFetch = new ElementFetch();
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.checkoutButton)));    		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutButton).click();
    	
    }
    public void clickOnNext() {
    	//
    	BaseTest.logger.info("Clicking Next Button");
		ElementFetch elementFetch = new ElementFetch();	
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.checkoutNext)));    		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutNext).click();
    }

}
