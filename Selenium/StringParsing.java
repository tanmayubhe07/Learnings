package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StringParsing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver);
		driver.findElement(By.id("inputUsername")).sendKeys("Test");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("submit")).click();
		driver.findElement(By.className("logout-btn")).click();
		driver.quit();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passArr = passwordText.split("'");
		//0th index: Please use temporary password 
		//1st index: rahulshettyacademy' to Login.
		String[] passwordArray2 = passArr[1].split("'");
		String password = passwordArray2[0];
		driver.findElement(By.xpath("//form/div/button[1]")).click();
		Thread.sleep(1000);
		return password;
	}

}
