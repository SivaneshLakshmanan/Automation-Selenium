package week2.day2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Playwithbuttons {

	public static void main(String[] siva) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Testlove = new ChromeDriver();
		
		Testlove.get("http://leafground.com/pages/Link.html");
		Testlove.manage().window().maximize();
		Testlove.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//To get Title
		//String x = Testlove.getTitle();
		//System.out.println(x);
		//or
		System.out.println(Testlove.getTitle());
		
		//To click a button
		//Testlove.findElementByXPath("//button[text()='Go to Home Page']").click();
		
		//To get Url
		//System.out.println(Testlove.getCurrentUrl());
		
		//Find position of x,y
		//System.out.println(Testlove.getPageSource());
		
		//to get the value using getattribute
		//System.out.println(Testlove.findElementByXPath("(//a[text()='Go to Home Page'])[1]").getAttribute("href"));
		
		//To know thw color
		//System.out.println(Testlove.findElementByLinkText("Find where am supposed to go without clicking me?").getCssValue("color"));
		
		//To get the location of the text or tag name
		System.out.println(Testlove.findElementByLinkText("Find where am supposed to go without clicking me?").getLocation());
		
		
		//To close window
		Testlove.close();
		
		
	}

}
