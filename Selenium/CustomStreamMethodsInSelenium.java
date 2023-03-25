package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomStreamMethodsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(
				"https://shop.stc.com.bh/index.php?route=product/category&path=102&allproducts=1&_ga=2.159099902.558369696.1674980269-724992665.1674980269");

		String Name = "Galaxy S21 FE 5G";

		List<WebElement> deviceNames = driver.findElements(By.className("rvl-title"));

		deviceNames.stream().filter(d -> d.getText().contains(Name)).map(s -> getPrice(s))
				.forEach(s -> System.out.println("Price of " + Name + " is " + s));

		// *[@class='rvl-title']/following-sibling::div[2]/div[@class='rvl-mrc-label']/span[@class='rvl-mrc-integer']
	}

	private static String getPrice(WebElement s) {
		// TODO Auto-generated method stub

		String pricevalue = s
				.findElement(By
						.xpath("following-sibling::div[2]/div[@class='rvl-mrc-label']/span[@class='rvl-mrc-integer']"))
				.getText();

		return pricevalue;
	}

}
