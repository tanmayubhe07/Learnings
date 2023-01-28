package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,500)");
		
		List <WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead'] //td[4]"));
		
		int sum = 0;
		
		for (int i=0; i<amount.size();i++) {
			
			sum = sum + Integer.parseInt(amount.get(i).getText());
			
		}
		
		String text = driver.findElement(By.cssSelector(".totalAmount")).getText();
		
		String sptext = text.split(":")[1].trim();
		
		Integer.parseInt(sptext);
		
		Assert.assertEquals(sum, sptext);
		
		
	}

}
