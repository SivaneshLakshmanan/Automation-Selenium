package rahulShettytraining;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("departureCalendar")).click();
		
		//July 11, 2021 
		
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("July"))
		{
			driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Day']"));
		
		for(int i=0;i<dates.size();i++)
		{
			String text = driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Day']")).get(i).getText();
			
			if(text.equalsIgnoreCase("11"))
			{
				driver.findElements(By.cssSelector("[class='DayPicker-Body'] [class='DayPicker-Day']")).get(i).click();
				break;
			}
		}
		
	}

}
