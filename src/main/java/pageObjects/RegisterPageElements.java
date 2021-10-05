package main.java.pageObjects;

import static test.java.BaseTest.driver;

import org.openqa.selenium.By;

public interface RegisterPageElements {
	//String createNewAccount = "/html/body/login-modal/div/div/div[3]/a[2]";
	//String signInButton = "//*[@id='menuUser']";
    
	String registerUsername = "//*[@id=\'formCover\']/div[1]/div[1]/sec-view[1]/div/input";
    String registerEmail = "//*[@id=\'formCover\']/div[1]/div[1]/sec-view[2]/div/input"; 
    String registerPassword = "//*[@id=\'formCover\']/div[1]/div[2]/sec-view[1]/div/input";
    String registerConfirmedPassword = "//*[@id=\'formCover\']/div[1]/div[2]/sec-view[2]/div/input";
    String registerAgree = "//*[@id=\'formCover\']/sec-view/div/label";
    String registerButton = "//*[@id=\'register_btnundefined\']";
    
    String accountUsername = "//*[@id=\"menuUserLink\"]/span";
    //String registerText = "//h3[contains(text(),'Register']"; //*[@id="menuUserLink"]/span[contains(text(),'Register']";
    //
}
