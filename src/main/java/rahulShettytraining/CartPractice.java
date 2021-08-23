package rahulShettytraining;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//mention the items required by the user
		String[] items =  {"Carrot","Tomato","Beans","Brinjal"};
		
		Thread.sleep(3000);
		
		//get the products in the site and list them
		List<WebElement> products = driver.findElementsByCssSelector(".product-name");
		
		//get the count of the products in the list via size() method
		for(int i=0; i<products.size();i++)
		{
			//get the names of the products where we alread know the count and split the name of the product into 2
			String[] allproducts = products.get(i).getText().split("-");
			// get the first name of the poduct by using the index and trim() methods and store them as String of list
			String alltheproducts = allproducts[0].trim();
			
			// COnvert the string[] items into list of items and store them
			List<String> allitems = Arrays.asList(items);
			
			// comaore the requirement from user and items in the website
			if(allitems.contains(alltheproducts))
			{
				int j=0;
				j++;
				//click the product
				driver.findElementsByXPath("//div[@class='product-action']/button").get(i).click();
				
				//once the list of user defined items are clicked the break
				if (j==items.length)
				{
					break;
				}
				
			}
			
		}
		
		
	}

}
