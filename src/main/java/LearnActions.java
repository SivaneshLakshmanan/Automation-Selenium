import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='✕']").click();
		
		WebElement ele = driver.findElementByXPath("//span[text()='TVs & Appliances']");
		WebElement thomson = driver.findElementByXPath("//a[text()='Thomson']");
		
		Actions mouseover = new Actions(driver);
		mouseover.moveToElement(ele).perform();
		Thread.sleep(2000);
		mouseover.click(thomson).perform();
		
		
	
		

	}

}
