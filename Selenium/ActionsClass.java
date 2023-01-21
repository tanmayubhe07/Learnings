package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement login = driver.findElement(By.cssSelector("a[id='nav-link-accountList']")); 
		
		//Actions Class
		Actions a = new Actions(driver);
		a.moveToElement(login).build().perform();
		
		
		// Handling composite operations with Action class
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(text).click().keyDown(Keys.SHIFT).sendKeys("hanuman").doubleClick().build().perform();

	}

}
