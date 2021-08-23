package rahulShettytraining;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Music#Etymology");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.xpath("(//a[@title='Sound'])[2]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(link).keyDown(Keys.CONTROL).click().build().perform();
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child); 
		
		System.out.println(driver.findElement(By.cssSelector("h1[id='firstHeading']")).getText());
		
		driver.switchTo().window(parent);
		
		System.out.println(driver.findElement(By.cssSelector("h1[id='firstHeading']")).getText());
		
		
	}

}
