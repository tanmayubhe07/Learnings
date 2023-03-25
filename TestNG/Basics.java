package TestNG;

import org.testng.annotations.Test;

public class Basics {
	
	@Test(groups= {"Sanity"})
	public void test1() {
		System.out.println("This is test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}

}
