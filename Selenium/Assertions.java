package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
			

	}
}
