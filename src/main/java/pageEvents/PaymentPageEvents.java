package main.java.pageEvents;

import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.PaymentPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;


public class PaymentPageEvents {
	
	/*public void paymentSelection() {
		BaseTest.logger.info("Selection Payment Method");
		
		ElementFetch elementFetch = new ElementFetch();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PaymentPageElements.paymentSafePaySelection)));
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentSafePaySelection).click();      
		
	}*/
	
	public void paymentUserAndPass() {
		BaseTest.logger.info("Entering username and password");		
		ElementFetch elementFetch = new ElementFetch();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(20, TimeUnit.SECONDS);	
				
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentUsername)));
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).click();
		//elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).clear();		
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).sendKeys(BaseTest.excelPropertyLoader.getValue("username"));
        
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentPassword)));
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).click();
		//elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).clear();	
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("password"));	
	}

    public void clickOnPayButton() {
    	BaseTest.logger.info("Clicking PayNow Button");
    	ElementFetch elementFetch = new ElementFetch();
    	
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(20, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentPayNow)));    		
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPayNow).click();
    }
    public void validatingOrder() {
    	//
    	BaseTest.logger.info("Validating order");		
		ElementFetch elementFetch = new ElementFetch();				
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(20, TimeUnit.SECONDS);	
				
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(PaymentPageElements.orderValidation))); 
		String originalTitle = "Thank you for buying with Advantage";
        Assert.assertEquals(originalTitle, elementFetch.getWebElement("XPATH", PaymentPageElements.orderValidation).getText());
    }

}

