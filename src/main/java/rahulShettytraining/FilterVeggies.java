package rahulShettytraining;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterVeggies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//search for Rice - result is only 1 item
		driver.findElement(By.cssSelector("#search-field")).sendKeys("Rice");
		
		//now grab all the items present in veggies page #1 items is shown (since the previous step is filter woth Rice only)
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//now filter the veggies list with "Rice" so only 1 result is shown 
		List<WebElement> filteredlist = veggies.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		//compare both
		Assert.assertEquals(veggies.size(), filteredlist.size());
		
		
		
		
	}

}
