package selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScanningProducts_Practise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] UserInput = { "Galaxy S22 Ultra 5G" };

		List newL = Arrays.asList(UserInput);  		// converting above array to arrayList so as to parse it

	
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://shop.stc.com.bh/index.php?route=product/category&path=102&allproducts=1&_ga=2.83968217.154977021.1673765278-985478580.1668764196");

		List<WebElement> productsListed = driver.findElements(By.cssSelector(".rvl-title"));

		for (int i = 0; i < productsListed.size(); i++) {

			if (newL.contains(productsListed.get(i).getText())) {

				driver.findElements(By.xpath("//button[text()='Buy this device']")).get(i).click();
				break;
			}
		}

		

	}
}
