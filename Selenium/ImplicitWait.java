package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] requiredProducts = { "Brocolli", "Tomato", "Apple" };

		List<WebElement> fetchedProducts = driver.findElements(By.cssSelector("h4.product-name"));

		@SuppressWarnings("rawtypes")
		List reproducts = Arrays.asList(requiredProducts);

		for (int i = 0; i < fetchedProducts.size(); i++) {

			String[] p = fetchedProducts.get(i).getText().split(" ");
			String product = p[0];

			if (reproducts.contains(product)) {
				driver.findElements(By.xpath("//div[@class='product-action'] //button")).get(i).click();
			}

		}		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		driver.close();
		

	}

}
