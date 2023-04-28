package TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("I am Listener on Test Success 😀😀😀");
	  }
	
	public void onTestFailure(ITestResult result) {
	    // not implemented
	  }

	
	

}
