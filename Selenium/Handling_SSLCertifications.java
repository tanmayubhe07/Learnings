package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_SSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();

		options.setAcceptInsecureCerts(true); // This should always be written before declaring driver object

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://expired.badssl.com/");

	}

}
