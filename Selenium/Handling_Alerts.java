package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Accepting the alert
		driver.findElement(By.id("name")).sendKeys("Tanmay");
		
		driver.findElement(By.id("alertbtn")).click();
		
		//switching to alert window
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Confirm alert pop up
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().dismiss();
		driver.quit();
	
		

	}

}
