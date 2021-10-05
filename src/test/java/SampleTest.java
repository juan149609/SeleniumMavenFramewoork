package test.java;

import main.java.pageEvents.CheckoutPageEvents;
import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.MenuPageEvents;
import main.java.pageEvents.PaymentPageEvents;
import main.java.pageEvents.RegisterPageEvents;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	
   @Test
    public void fullTestMethod() { 
    	HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnMenu();
        
        /*MenuPageEvents menuPageEvents = new MenuPageEvents();
        menuPageEvents.onModalOpen();
        
        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
        registerPageEvents.registerForm();
        registerPageEvents.clickOnRegister();    
        registerPageEvents.validateRegister();*/
        
        CheckoutPageEvents checkoutPageEvents = new CheckoutPageEvents();
        checkoutPageEvents.loginMethod();
        checkoutPageEvents.clickOnCart();
        checkoutPageEvents.clickOnCheckout();
        checkoutPageEvents.clickOnNext();
        
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.paymentSelection();
        paymentPageEvents.paymentUserAndPass();
        paymentPageEvents.clickOnPayButton();
    }
    
}

