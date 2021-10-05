package test.java;

import main.java.pageEvents.*;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	
   @Test
    public void fullTestMethod() {
       HomePageEvents homePageEvents = new HomePageEvents();
       ItemPageEvents itemPageEvents = new ItemPageEvents();
//        homePageEvents.clickOnMenu();
//
//        /*MenuPageEvents menuPageEvents = new MenuPageEvents();
//        menuPageEvents.onModalOpen();
//
//        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
//        registerPageEvents.registerForm();
//        registerPageEvents.clickOnRegister();
//        registerPageEvents.validateRegister();*/
//
//        CheckoutPageEvents checkoutPageEvents = new CheckoutPageEvents();
//        checkoutPageEvents.loginMethod();
//        checkoutPageEvents.clickOnCart();
//        checkoutPageEvents.clickOnCheckout();
//        checkoutPageEvents.clickOnNext();
//
//        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
//        paymentPageEvents.paymentSelection();
//        paymentPageEvents.paymentUserAndPass();
//        paymentPageEvents.clickOnPayButton();

       homePageEvents.clickOnSearch();
       homePageEvents.searchItem();
       itemPageEvents.clickOnExit();
       itemPageEvents.selectItem();
       itemPageEvents.addToTheCart();
    }
    
}

