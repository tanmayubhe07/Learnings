package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dd = new Select(dropdown);
		dd.selectByIndex(3);
		System.out.println("Selection by Index is " + dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("INR");
		System.out.println("Selection by Visible Text is " + dd.getFirstSelectedOption().getText());
		dd.selectByValue("AED");
		System.out.println("Selection by value is " + dd.getFirstSelectedOption().getText());
		driver.quit();
	}

}
