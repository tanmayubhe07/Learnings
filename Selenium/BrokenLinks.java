package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String url = driver.findElement(By.linkText("Broken Link")).getAttribute("href");
		
		HttpURLConnection conn= (HttpURLConnection) new URL(url).openConnection();
		
		//URL is the class and openConnection is the method  
		
		
		conn.setRequestMethod("HEAD");
		conn.connect();  // connects with that URL 
		int statusCode = conn.getResponseCode();
		System.out.println(statusCode);

		
		
		

	}

}
