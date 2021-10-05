package main.java.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	//The number of times we want to retry a particular test which got failed
    int count = 0;
    int retryCount = 1;

    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count < retryCount) {
            count++;
            return true;
        }
        return false;
    }
}
