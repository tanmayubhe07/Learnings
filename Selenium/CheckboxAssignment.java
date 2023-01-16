package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
		
		//Assignment 1
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/angularpractice/");
//		
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		driver.findElement(By.id("checkBoxOption1")).click();
//		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		List<WebElement> chkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
//		System.out.println("Number of checkboxes present on the page are "+chkboxes.size());
		
		
		
		//Assignment 2
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Test Assignment");
		
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("test@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dd = new Select(dropdown);
		
		dd.selectByVisibleText("Female");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='inlineRadio1']")).click();
		
		driver.findElement(By.name("bday")).sendKeys("07-10-1999");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']")).getText());
		
		
	}
	
	

	
	
	
	
	
	

}
