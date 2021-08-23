package week3.day2homeassignment;

import java.util.List;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class HandleCalendar {
 
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  driver.get("https://www.inviul.com/handling-calendar-webdriver/");
		  
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
		  
		  List<WebElement> list = driver.findElements(By.xpath("//*[@class='ui-datepicker-calendar']//tbody//tr//td"));
		  
		  for(WebElement e : list){
			  String date = e.getText();
			  
			  //Convert String to Integer
			  int dateInt = Integer.parseInt(date);
			  
			  if(dateInt==(18)){
				  e.click();
				  break;
			  }
			  
		  }
	}
 
}