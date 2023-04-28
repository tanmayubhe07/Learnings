package TestNG;

import org.testng.annotations.Test;

public class helperAttributes {
	
	
	
	@Test(groups="sanity")
	public void Provide() {
		System.out.println("Provide order");
	}
	

	@Test(groups="sanity")
	public void Modify() {
		System.out.println("Modify order");
	}
	

	@Test(groups="regression",dependsOnMethods="Modify")
	public void Migration() {
		System.out.println("Migration order");
	}
	

	@Test(groups="regression", enabled=false)
	public void Suspend() {
		System.out.println("Suspend order");
	}
	
	

}
