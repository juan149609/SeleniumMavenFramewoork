package main.java.pageObjects;

public interface CheckoutPageElements {
	//Identifiers
	String chName = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input";
	String chPass = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input";
	String chBtn= "//*[@id=\'sign_in_btnundefined\']";
	
	String checkoutCart = "//*[@id=\'menuCart\']";
	String checkoutButton = "//*[@id=\'checkOutButton\']";
    String checkoutNext = "//*[@id=\'next_btn\']"; 
}
