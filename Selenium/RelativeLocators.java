package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement emailtext = driver.findElement(By.xpath("//label[text()='Email']"));
		
		driver.findElement(with(By.xpath("(//*[@name='name'])[1]")).above(emailtext)).sendKeys("Test Above");
		
		driver.findElement(with(By.cssSelector("[name='email']")).below(emailtext)).sendKeys("below@gmail.com");
		
		WebElement iceCreams = driver.findElement(By.cssSelector("[for='exampleCheck1']"));
		
		driver.findElement(with(By.id("exampleCheck1")).toLeftOf(iceCreams)).click();
		
		WebElement radio = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
		
		driver.findElement(with(By.id("inlineRadio1")).toRightOf(radio)).click();
		
		
	}

}
