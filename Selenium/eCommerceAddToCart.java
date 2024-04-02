package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eCommerceAddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(3000);
		
		int j= 0;
		
		String[] requiredProducts = {"Brocolli", "Beetroot", "Tomato", "Potato"};
		
		@SuppressWarnings("rawtypes")
		List Products = Arrays.asList(requiredProducts);
		
		List<WebElement> productList = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		
	
		for (int i=0 ; i<productList.size();i++ ) {
		
			String[] name = productList.get(i).getText().split(" ");
			
			String finalName = name[0];	
			
			
		
			if (Products.contains(finalName)) {
				
				j++;
				
				driver.findElements(By.cssSelector("div[class='product-action']")).get(i).click();
				
				if(j==requiredProducts.length) {
					break;
				}
				
				
	
			}
			
			
			driver.findElement(By.cssSelector(".cart-icon")).click();
			
		
			
		}
		
		

	}
}
