package week2day1assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Whistle = new ChromeDriver();
		
		Whistle.get("http://leaftaps.com/opentaps/control/main");
		Whistle.manage().window().maximize();
		Whistle.findElementById("username").sendKeys("demosalesmanager");
		Whistle.findElementById("password").sendKeys("crmsfa");
		Whistle.findElementByClassName("decorativeSubmit").click();
		Whistle.findElementByLinkText("CRM/SFA").click();
		Whistle.findElementByLinkText("Accounts").click();
		Whistle.findElementByLinkText("Find Accounts").click();
		//Whistle.findElementByXPath("//input[@id='ext-gen']").sendKeys("Sivanesh Limited Account");
		//Whistle.findElementByXPath("//input[@class='x-btn-text']").click();
		
	}

}
