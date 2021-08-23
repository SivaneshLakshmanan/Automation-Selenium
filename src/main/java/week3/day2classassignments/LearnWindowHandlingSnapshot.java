package week3.day2classassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandlingSnapshot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver Train = new ChromeDriver();
		Train.get("https://www.irctc.co.in/eticketing/errors.html");
		Train.manage().window().maximize();
		Train.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Train.executeScript("document.body.style.zoom = \"80%\" ");
		Train.findElementByLinkText("Contact Us").click();
		Set<String> window = Train.getWindowHandles();
		System.out.println(window.size());
		List<String> list = new ArrayList<String> (window);
		String qwerty = list.get(1);
		Train.switchTo().window(list.get(1));
		System.out.println(Train.getTitle());
		
		
		
		
		
		
		
		
		
	}
	
}
