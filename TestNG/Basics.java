package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basics {
	
	@Parameters("URL")
	@Test
	public void test1(String url) {
		System.out.println("This is test 1");
		System.out.println(url);
	}
	
	@Test
	public void test2() {
		System.out.println("This is test 2");
	}

}
