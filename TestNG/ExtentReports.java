package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;



public class ExtentReports {
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void config() {

		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("UAT || Test Results");
		reporter.config().setReportName("Web Automation Test");
	}

	@Test
	public void invokeYouTube() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.getTitle();
	}

	@Test
	public void invokeCricbuzz() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.getTitle();
	}

}
