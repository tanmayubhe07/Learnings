package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LimitingWebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.stc.com.bh/");
		
		// get all the links present in the webpage
		
		System.out.println("Full webpage links: "+driver.findElements(By.tagName("a")).size());
		
		
		// get the links only in the footer section
		
		WebElement footerSection = driver.findElement(By.className("footer"));
		
		System.out.println("Footer links: "+footerSection.findElements(By.tagName("a")).size());

		
		// get the links present in first column of footer section
		
		WebElement firstFooterColumn = driver.findElement(By.xpath("(//div[@class='footer-col'])[1]"));
		
		System.out.println("Footer first column links: "+firstFooterColumn.findElements(By.tagName("a")).size());
		
		
		
		//Open all the footer first column links in new tabs
		
		for (int i=0;i<firstFooterColumn.findElements(By.tagName("a")).size();i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			firstFooterColumn.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			
		}
		
		//To get the title of each tab opened.
		
		Set<String> tabs = driver.getWindowHandles();
		Iterator <String> it = tabs.iterator();
		int i = 0;
		String parentTab= it.next();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		
		
		
//		driver.close();
	}

}
