package main.java.pageEvents;

import static test.java.BaseTest.driver;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import main.java.pageObjects.CheckoutPageElements;
import main.java.pageObjects.MenuPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

public class CheckoutPageEvents {
	
	public void loginMethod() {
		BaseTest.logger.info("Login User");
		
		ElementFetch elementFetch = new ElementFetch();
		String chusername = "jul1o";
		String chpassword = "A1234*l";
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.chName)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).click();
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).clear();		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chName).sendKeys(BaseTest.excelPropertyLoader.getValue("chusername"));
        
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).click();
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).clear();	
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chPass).sendKeys(BaseTest.excelPropertyLoader.getValue("chpassword"));	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(CheckoutPageElements.chBtn)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.chBtn).click();
		
	}
	
	public void clickOnCart() {
    	BaseTest.logger.info("Clicking Menu Cart");
    
    	ElementFetch elementFetch = new ElementFetch();
		
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(MenuPageElements.modal)));		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutCart).click();
	}

    public void clickOnCheckout() {
    	
    	BaseTest.logger.info("Clicking Checkout Button");
        
    	ElementFetch elementFetch = new ElementFetch();
		
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.checkoutButton)));    		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutButton).click();
    	
    }
    public void clickOnNext() {
    	//
    	BaseTest.logger.info("Clicking Next Button");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		ElementFetch elementFetch = new ElementFetch();				
    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CheckoutPageElements.checkoutNext)));    		
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkoutNext).click();
    }

}
