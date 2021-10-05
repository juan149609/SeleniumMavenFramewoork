package main.java.pageEvents;

/*import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.MenuPageElements;*/
import main.java.pageObjects.RegisterPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import main.java.utils.Constants;
import main.java.utils.ExcelPropertyLoader;

import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

public class RegisterPageEvents {
	
	
    public void registerForm() {
    	BaseTest.logger.info("Entering Data to Register");
    	
    	String username = "jul1o";
    	String email = "julio@softteck.com";
    	String password = "A1234*l";
    	String confirm_password = "A1234*l";
    	ElementFetch elementFetch = new ElementFetch();
		
    	
        
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).clear();		
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).sendKeys(BaseTest.excelPropertyLoader.getValue("tusername"));
        
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).sendKeys(BaseTest.excelPropertyLoader.getValue("email"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("password"));
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("confirm_password"));
    	
    }

    public void clickOnRegister() {
    	
    	BaseTest.logger.info("Clicking Register Button");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		ElementFetch elementFetch = new ElementFetch();		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerAgree)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerAgree).click();
				
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerButton)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerButton).click();
    	
    }
    public void validateRegister() {
    	BaseTest.logger.info("Validate Register");
		//WebDriverWait wait = new WebDriverWait(driver, 20);		
		ElementFetch elementFetch = new ElementFetch();	
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerButton)));
		Assert.assertTrue(elementFetch.getListWebElements("XPATH", RegisterPageElements.registerUsername).size()>0, "Registration failed");
    }

}
