package rahulShettytraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//How to find the list is in sorted order?
		
		//Sorted the WebElements so the O/P should be TRUE
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements into a list - list (original list) 
		List<WebElement> list = driver.findElements(By.xpath("//tr/td[1]"));
		
		//get the webelements name (capture text) into a new list - newlist
		List<String> newList = list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the newlist - sorted list
		List<String> sortedList = newList.stream().sorted().collect(Collectors.toList());
		
		
		//compare sorted list vs original list and find of the order is in sorted order or not
		Assert.assertTrue(newList.equals(sortedList));
		
		
		List<String> price;
		
		//Get the price of all the vegies from the table
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getPriceofVegie(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println("Rice Price =" + " " + a));
		if(price.size()<1)
		{
			driver.findElement(By.cssSelector("[aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	
	private static String getPriceofVegie(WebElement s) {
		// TODO Auto-generated method stub
		
		String newPrice = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return newPrice;
	}

	
}
