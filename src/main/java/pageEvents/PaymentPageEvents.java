package main.java.pageEvents;

import static test.java.BaseTest.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import main.java.pageObjects.PaymentPageElements;
import main.java.utils.Constants;
import main.java.utils.ElementFetch;
import main.java.utils.ExcelPropertyLoader;
import test.java.BaseTest;


public class PaymentPageEvents {
	
	public void paymentSelection() {
		BaseTest.logger.info("Selection Payment Method");
		
		ElementFetch elementFetch = new ElementFetch();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentSafePaySelection)));
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentSafePaySelection).click();      
		
	}
	
	public void paymentUserAndPass() {
		BaseTest.logger.info("Entering username and password");
		
		ElementFetch elementFetch = new ElementFetch();
		String pusername = "jul1o";
		String ppassword = "A1234*l";
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		ExcelPropertyLoader excelPropertyLoader = new ExcelPropertyLoader();
		excelPropertyLoader.LoadFile(Constants.ExcleFilePath);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentUsername)));
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).click();
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).clear();		
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentUsername).sendKeys(BaseTest.excelPropertyLoader.getValue("pusername"));
        
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).click();
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).clear();	
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPassword).sendKeys(BaseTest.excelPropertyLoader.getValue("ppassword"));	
		
		System.out.println("An exceptional case 1");
	}

    public void clickOnPayButton() {
    	BaseTest.logger.info("Clicking PayNow Button");
        
    	ElementFetch elementFetch = new ElementFetch();
		
    	WebDriverWait wait = new WebDriverWait(driver, 20);
    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.paymentPayNow)));    		
		elementFetch.getWebElement("XPATH", PaymentPageElements.paymentPayNow).click();
    }
    /*public void validatingOrder() {
    	//
    	BaseTest.logger.info("Validating order");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		ElementFetch elementFetch = new ElementFetch();				
    	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PaymentPageElements.orderValidation)));    		
		//elementFetch.getWebElement("XPATH", PaymentPageElements.orderValidation).click();
    }*/

}
