package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Give a key value of the Browser details and its path so as to invoke the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanmay Ubhe\\eclipse-workspace\\Training\\Drivers\\chromedriver.exe");
		
		// Object instantiation with WebDriver Interface
		WebDriver driver = new ChromeDriver();
		
		// accessing the ChromeDriver class methods
		driver.get("https://www.stc.com.bh/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();  // closes only initially invoked browser and not all associated windows.
		
		driver.quit();  //closes all associated windows/tabs

	}

}
