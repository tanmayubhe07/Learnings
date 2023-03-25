package selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String Name = "Rice";

		List<WebElement> filteredList;

		driver.findElement(By.xpath("//tr/th[1]")).click();

		do {

			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			filteredList = rows.stream().filter(s -> s.getText().contains(Name)).collect(Collectors.toList());
			filteredList.forEach(s -> System.out.println(s.getText()));
			if (filteredList.size() < 1) {
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			}

		} while (filteredList.size() < 1);

		
		
	}
}
