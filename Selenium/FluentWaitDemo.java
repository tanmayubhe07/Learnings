package selenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		Wait<WebDriver> wait =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		@SuppressWarnings("unused")
		WebElement text = wait.until(new Function <WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
				return 	driver.findElement(By.cssSelector("[id='finish'] h4"));
				}
				else 
					return null;
			}
		});
		
		System.out.println(driver.findElement(By.cssSelector("[id='finish'] h4")).getText());

	}

}
