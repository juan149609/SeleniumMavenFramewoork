package main.java.pageEvents;

/*import main.java.pageObjects.HomePageElements;
import main.java.pageObjects.MenuPageElements;*/
import main.java.pageObjects.RegisterPageElements;
import main.java.utils.ElementFetch;
import test.java.BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static test.java.BaseTest.driver;

import java.util.concurrent.TimeUnit;

public class RegisterPageEvents {
	
	
    public void registerForm() {
    	BaseTest.logger.info("Entering Data to Register");
    	
    	String username = "jvl1275s001";
    	String email = "julio@softteck.com";
    	String password = "Jm1234";
    	String confirm_password = "Jm1234";
    	ElementFetch elementFetch = new ElementFetch();
		
            		
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).clear();		
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerUsername).sendKeys(username);
        
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerEmail).sendKeys(email);
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerPassword).sendKeys(password);
    	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).click();
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).clear();	
    	elementFetch.getWebElement("XPATH", RegisterPageElements.registerConfirmedPassword).sendKeys(confirm_password);
    	
    	
        /*wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerAgree)));
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerAgree).click();
        
        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegisterPageElements.registerButton)));
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerButton)));
        elementFetch.getWebElement("XPATH", RegisterPageElements.registerButton).click();  */      
    }

    public void clickOnRegister() {
    	
    	
    	BaseTest.logger.info("Clicking Register Button");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		ElementFetch elementFetch = new ElementFetch();		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerAgree)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerAgree).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(RegisterPageElements.registerButton)));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(RegisterPageElements.registerButton)));
		elementFetch.getWebElement("XPATH", RegisterPageElements.registerButton).click();
    	
    }

}
