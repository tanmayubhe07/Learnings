package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		//By Id
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		//By name
		driver.findElement(By.name("inputPassword")).sendKeys("wrongpassword");
		//By Class name
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		//By Link text
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//By xpath 
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("test@gmail.com");
		//By CSS Selector
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//form/div/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());
		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());
		
		//By Tag name
		System.out.println(driver.findElement(By.tagName("p")).getText());     			
		driver.findElement(By.className("logout-btn")).click();
		driver.quit();
		
	}

}
