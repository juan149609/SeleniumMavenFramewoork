package main.java.pageEvents;

import main.java.pageObjects.HomePageElements;
/*import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.MenuPageElements;*/
import main.java.pageObjects.RegisterPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

public class RegisterPageEvents {
	
	
    public void registerForm() {
    	BaseTest.logger.info("Entering Data to Register");
    	ElementFetch elementFetch = new ElementFetch();
		
    	
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerUsername)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).clear();		
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).sendKeys(BaseTest.excelPropertyLoader.getValue("username"));
        
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).sendKeys(BaseTest.excelPropertyLoader.getValue("email"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("password"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("confirm_password"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerName).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerName).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerName).sendKeys(BaseTest.excelPropertyLoader.getValue("firstName"));

        elementFetch.getWebElement("XPATH", RegisterPageElements.registerLastName).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerLastName).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerLastName).sendKeys(BaseTest.excelPropertyLoader.getValue("lastName"));

    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPhone).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerPhone).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPhone).sendKeys(BaseTest.excelPropertyLoader.getValue("phoneNumber"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerCountry).click();
		//elementFetch.getWebElement("XPATH", RegisterPageElements.registerCountry).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerCountry).sendKeys(BaseTest.excelPropertyLoader.getValue("country"));

    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerCity).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerCity).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerCity).sendKeys(BaseTest.excelPropertyLoader.getValue("city"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerAddress).click();
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerAddress).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerAddress).sendKeys(BaseTest.excelPropertyLoader.getValue("address"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerState).click();
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerState).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerState).sendKeys(BaseTest.excelPropertyLoader.getValue("state"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPostalCode).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerPostalCode).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPostalCode).sendKeys(BaseTest.excelPropertyLoader.getValue("postalCode"));
    	
    }

    public void clickOnRegister() {    	
    	BaseTest.logger.info("Clicking Register Button");
    	ElementFetch elementFetch = new ElementFetch();		
		
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerAgree)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerAgree).click();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerButton)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerButton).click();
    	
    }
    
    public void validateRegister() {
    	BaseTest.logger.info("Validate Register");	
		ElementFetch elementFetch = new ElementFetch();	
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(10, TimeUnit.SECONDS);
		
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(HomePageElements.loader)));
		
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", HomePageElements.userAccountName).size()>0, "Registration failed");
    }
}
