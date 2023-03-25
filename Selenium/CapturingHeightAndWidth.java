package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CapturingHeightAndWidth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Test Screenshot");
		
		WebElement element = driver.findElement(By.cssSelector("input[name='name']"));

		System.out.println(element.getRect().getDimension().getHeight());
		
		System.out.println(element.getRect().getDimension().getWidth());
	}

}
