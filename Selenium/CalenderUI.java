package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");

		driver.findElement(By.cssSelector("label[for='departure']")).click();

		String userDate = "7";
		String userMonth = "February";

		List<WebElement> date = driver.findElements(By.cssSelector("div[class='DayPicker-Day']"));

		WebElement month = driver.findElement(By.cssSelector(".DayPicker-Caption"));
		
		
		String monthexpected = month.getText();
		
		
		System.out.println(monthexpected);
		
//		while(!month.get(i).getText().equalsIgnoreCase(userMonth)) {
//		
//			driver.findElement(By.cssSelector("span[aria-label='Next Month']")).click();
//		}
//		
//		driver.findElement(By.cssSelector("[data-handler='next']")).click();
//		driver.findElement(By.cssSelector("[data-handler='next']")).click();
//		for (int i = 0; i < date.size(); i++) {
//
//			String d = date.get(i).getText();
//			if (d.equalsIgnoreCase(userDate)) {
//				date.get(i).click();
//				break;
//			}
//		}
	}
}
