package rahulShettytraining;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practiselinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		List<WebElement> columnlinks = columndriver.findElements(By.tagName("a"));
		
		for(int i=1;i<columnlinks.size();i++)
		{
			/*
			String columnlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnlinks.get(i).sendKeys(columnlinkTab);
			*/
			
			// OR //
			
			Actions a = new Actions(driver);
			a.keyDown(Keys.CONTROL).click(columnlinks.get(i)).build().perform();
			
			
				
			}
			
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) //hasNext() is a boolean will say if window o is present, then goes in
		{
			driver.switchTo().window(it.next());  //next() will switch to next window
			System.out.println(driver.getTitle());
		}
	
			// bad way of writing code
			/*
			String parent = it.next();
			System.out.println(driver.switchTo().window(parent).getTitle());
			
			String restApi = it.next();
			System.out.println(driver.switchTo().window(restApi).getTitle());
			
			String soupUi = it.next();
			System.out.println(driver.switchTo().window(soupUi).getTitle());
			
			String appium = it.next();
			System.out.println(driver.switchTo().window(appium).getTitle());
			
			String jmeter = it.next();
			System.out.println(driver.switchTo().window(jmeter).getTitle());
			*/
		
		
		
	}

}
