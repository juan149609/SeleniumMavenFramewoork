package main.java.pageObjects;

public interface RegisterPageElements {
	//Identifiers
	String registerUsername = "//*[@id=\'formCover\']/div[1]/div[1]/sec-view[1]/div/input";
    String registerEmail = "//*[@id=\'formCover\']/div[1]/div[1]/sec-view[2]/div/input"; 
    String registerPassword = "//*[@id=\'formCover\']/div[1]/div[2]/sec-view[1]/div/input";
    String registerConfirmedPassword = "//*[@id=\'formCover\']/div[1]/div[2]/sec-view[2]/div/input";
    
    String registerName = "//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input";
    String registerLastName = "//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[2]/div/input";
    String registerPhone = "//*[@id=\"formCover\"]/div[2]/div[2]/sec-view/div/input";
    String registerCountry = "//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select";
    String registerCity = "//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[2]/div/input";
    String registerAddress = "//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[1]/div/input";
    String registerState = "//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/input";
    String registerPostalCode = "//*[@id=\"formCover\"]/div[3]/div[3]/sec-view/div/input";
    
    String registerAgree = "//*[@id=\'formCover\']/sec-view/div/label";
    String registerButton = "//*[@id=\'register_btnundefined\']";
}
