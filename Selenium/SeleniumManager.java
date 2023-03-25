package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Newer version of selenium has came up with the update where we can ignore the below line ofcodeto find andinvoke the broweser
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanmay Ubhe\\eclipse-workspace\\Training\\Drivers\\chromedriver.exe");

//		we can directly skip to object instantiation of particular driver class
		//seleniumManager
		
		// Object instantiation with WebDriver Interface
				WebDriver driver = new ChromeDriver();
				
				// accessing the ChromeDriver class methods
				driver.get("https://www.stc.com.bh/");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
				driver.quit();  //closes all associated windows/tabs
		
	}

}
