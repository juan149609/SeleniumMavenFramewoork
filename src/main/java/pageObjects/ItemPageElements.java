package main.java.pageObjects;

public interface ItemPageElements {
	//Identifiers
	String search = "//*[@id=\"menuSearch\"]";
	String inSearchBox = "//*[@id=\"autoComplete\"]";
	String itemToAdd = "//*[@id=\'output\']/div/div[2]/a[2]/img";
	String addMoreItems = "//*[@id=\'productProperties\']/div[2]/e-sec-plus-minus/div/div[3]";
	String addToCart = "//*[@id=\'productProperties\']/div[4]/button";
}
