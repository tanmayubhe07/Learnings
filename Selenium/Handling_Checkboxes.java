package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");		
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());

	}

}
