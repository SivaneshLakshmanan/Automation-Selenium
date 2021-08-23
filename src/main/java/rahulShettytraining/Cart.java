package rahulShettytraining;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String[] veggies = {"Almonds","Mango","Banana","Orange"};
		
		CartItems(driver, veggies);
		
			 
	
	}

	
	public static void CartItems(RemoteWebDriver driver, String[] veggies)
	
		{
		
		int j=0;
		
		//Thread.sleep(3000);
		List<WebElement> products = driver.findElementsByCssSelector(".product-name");
	
		for(int i=0;i<products.size();i++)
	
		{
		String[] names = products.get(i).getText().split("-");
		String finalNames = names[0].trim();
		
		List<String> veggiesNeeded = Arrays.asList(veggies);
		
		if (veggiesNeeded.contains(finalNames))
		{
			j++;
		
			driver.findElementsByXPath("//div[@class='product-action']/button").get(i).click();
			
			if(j==veggies.length)
			{
				break;
			}
			
		}
			
		}
	
		}
	
	
}
