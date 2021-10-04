package test.java;

import main.java.pageEvents.HomePageEvents;
import main.java.pageEvents.MenuPageEvents;
import main.java.pageEvents.RegisterPageEvents;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
	
    @Test
    public void registerAccountMethod() { 
    	HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnMenu();
        
        MenuPageEvents menuPageEvents = new MenuPageEvents();
        menuPageEvents.onModalOpen();
        
        RegisterPageEvents registerPageEvents = new RegisterPageEvents();
        registerPageEvents.registerForm();
        registerPageEvents.clickOnRegister();        
    }
    
}

