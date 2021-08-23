package week4.day1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.HashAttributeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/trains-between-stations/mgr-chennai-ctr-MAS/mumbai-cst-CSTM");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Map<String, String> map = new HashMap<String, String>();
		
		WebElement table = driver.findElementByClassName("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		
		for (WebElement eachRows : allrows) {
			eachRows.find
			
			
		}
		
		
		

	}

}
