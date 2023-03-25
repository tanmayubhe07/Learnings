package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_updatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		// add adult
		driver.findElement(By.id("hrefIncAdt")).click();
		// add child
		driver.findElement(By.id("hrefIncChd")).click();
		// add infant
		driver.findElement(By.id("hrefIncInf")).click();
		// click on done
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		

//		Now adding multiple adults, childs & infants

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		// add 5 more adults
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}

		// add 3 more childs
		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}

		// add one more infant
		for (int i = 1; i < 2; i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
