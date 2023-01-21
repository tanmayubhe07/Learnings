package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("http://google.com");
//		driver.navigate().to("https://rahulshettyacademy.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		
		
		
		
		//Windows switching from Parent to child
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator <String> it =window.iterator();
		String parentId= it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		
		
		
	}

}
