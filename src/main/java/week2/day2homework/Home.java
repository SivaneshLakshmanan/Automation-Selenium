package week2.day2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to go to chrome
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver button = new ChromeDriver();
		
		//for link
		button.get("http://leafground.com/pages/Button.html");
		
		button.manage().window().maximize();
		button.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String x = button.getTitle();
		System.out.println(x);

		button.findElementByXPath("//button[text()='Go to Home Page']").click();
		
		
		
		//button.close();
		
	}

}
