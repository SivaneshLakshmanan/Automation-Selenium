package week3.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		driver.findElementById("Click").click();
		System.out.println("Clicked");
		driver.findElementById("Click").click();
		System.out.println("Re-Clicked");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		driver.findElementByXPath("(//button[@id='Click1'])[2]").click();
		System.out.println("2ND  Click done");
		driver.findElementByXPath("(//button[@id='Click1'])[2]").click();
		System.out.println("2ND Re-Click done");
		
		
	}

}
