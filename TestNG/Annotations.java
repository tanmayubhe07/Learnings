package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {	
	
//@Test >> It represents the test case in the class/module
//@BeforeTest >> The code under it executes before executing all tests in the class. The scope of Before test depends upon the test folder mentioned in the XML
//@AfterTest >> The code under it executes After executing all tests in the class
//@BeforeMethod >> Executes before each and every method block, scope is only upto that class
//@AfterMethod >> Executes before each and every method block	
//BeforeSuite >> Executes before the whole suite is executes
//AfterSuite >> Executes after the whole suite is executes
	
	
@BeforeTest
public void beforTest() {
		System.out.println("I am before test");
	}
	
@BeforeSuite
public void beforeSuite() {
	System.out.println("I am before Suite");
}



@AfterSuite
public void afterSuite() {
System.out.println("I am after Suite");
}

@Test(groups= {"Sanity"})
public void Test() {
	System.out.println("I am the test");
}


@Test
public void Test2() {
	System.out.println("I am the test 2");
}

@AfterTest
public void afterTest() {
	System.out.println("I am After test");
}

@BeforeMethod
public void beforMethod() {
	System.out.println("I am Before Method");
}

@AfterMethod
public void afterMethod() {
	System.out.println("I am After Method");
}

}
