package main.java.pageObjects;

import test.java.BaseTest;

public interface HomePageElements {
	//Identifiers
    String signInButton = "//*[@id='menuUser']";
	String homeButton = "/html/body/div[3]/nav/a[1]";
	String loader = "/html/body/div[2]";
	String userAccountName = "//*[@id=\'menuUserLink\']/span[contains(text(), '"+BaseTest.excelPropertyLoader.getValue("username")+"')] ";
}