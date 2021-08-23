package rahulShettytraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//to delete all cookies
		driver.manage().deleteAllCookies();
		//to delete particular cookie
		driver.manage().deleteCookieNamed("asdf");
		
		
		
		
	}

}
