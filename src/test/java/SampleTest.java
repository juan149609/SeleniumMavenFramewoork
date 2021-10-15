package test.java;

import main.java.pageEvents.CheckoutPageEvents;


import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.ItemPageEvents;
import main.java.pageEvents.MenuPageEvents;
import main.java.pageEvents.PaymentPageEvents;
import main.java.pageEvents.RegisterPageEvents;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	RegisterPageEvents registerPageEvents = new RegisterPageEvents();
   	HomePageEvents homePageEvents = new HomePageEvents();
   	MenuPageEvents menuPageEvents = new MenuPageEvents();
	//Full Test Cases
   @Test
    public void fullTestMethod() throws InterruptedException { 

        homePageEvents.clickOnMenu();
              
        menuPageEvents.onModalOpen();
        registerPageEvents.clickOnRegisterAgree();
        registerPageEvents.clickOnRegister();
        registerPageEvents.validateRegister();
    }
    
}

