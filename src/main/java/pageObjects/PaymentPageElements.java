package main.java.pageObjects;

public interface PaymentPageElements {
	//Identifiers 
	String paymentSafePaySelection = "//*[@id=\'paymentMethod\']/div/div[1]/div[1]/input";
    String paymentUsername = "//*[@id=\'paymentMethod\']/div/div[2]/sec-form/sec-view[1]/div/input";
    String paymentPassword = "//*[@id=\'paymentMethod\']/div/div[2]/sec-form/sec-view[2]/div/input";
    String paymentPayNow = "//*[@id=\'pay_now_btn_SAFEPAY\']"; 
    String orderValidation = "//*[@id=\'orderPaymentSuccess\']/h2/span";
}
