package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void test3() {
		System.out.println("This is test 3");
	}
	@Parameters("URL")
	@Test()
	public void test4(String name) {
		System.out.println("This is test 4");
		System.out.println(name);
	}
	
	@Test
	public void test5() {
		System.out.println("This is test 5");
	}
	
	@Test
	public void test6() {
		System.out.println("This is test 6");
	}
}
