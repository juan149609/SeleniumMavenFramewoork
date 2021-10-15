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
        Click_AcceptConditions_TC12();
        Click_RegisterCheck_TC13_TC14();
        Validate_Registration_TC15();
    }
    
  
   public void Click_AcceptConditions_TC12() { 

       registerPageEvents.registerForm();
	   try {	   
	   registerPageEvents.clickOnRegisterAgree();
	   }
	   catch(Exception e){
	   Assert.fail("Fail On Agremment Click");  
	   }
   }
   
   
   public void Click_RegisterCheck_TC13_TC14() {
	  int ErrorMessage;	 
		 ErrorMessage=registerPageEvents.clickOnRegister();
		  switch(ErrorMessage) {
		  case 0:
			   
		  case 1:	
			  Assert.fail("Fail On Click Register");
		  case 2:
			  Assert.fail("Fail On Click Agree");
			  default :
		  } 
   }
   

  
   public void Validate_Registration_TC15() { 
	   
	   try {
	   registerPageEvents.validateRegister();
	   }
	   catch(Exception e) {
		   Assert.fail("Fail On Validate Register"); 
	   }
   }
}

