package week2day2classassignment;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver conductor = new ChromeDriver();
		
		conductor.get("https://www.amazon.in/");
		conductor.manage().window().maximize();
		conductor.findElementById("twotabsearchtextbox").sendKeys("USI punching bag",Keys.ENTER);
		conductor.findElementByXPath("(//i[@class='a-icon a-icon-checkbox'])[4]").click();
		List<WebElement> bags = conductor.findElementsByXPath("//span[@class='a-size-base-plus a-color-base a-text-normal']");
		
		for (WebElement each : bags) {
			System.out.println(each.getText());	
			System.out.println(bags.size());
		}
	
		
		conductor.close();
		
	}
	

}
