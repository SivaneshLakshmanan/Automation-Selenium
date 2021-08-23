package projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MediumTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver medium = new ChromeDriver();
		
		medium.get("https://www.amazon.in");
		medium.manage().window().maximize();
		medium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		medium.findElementById("twotabsearchtextbox").sendKeys("oneplus 7 pro mobiles");
		medium.findElementByClassName("nav-input").click();
		WebElement price = medium.findElementByClassName("a-price-whole");
		System.out.println("Price of the first resulting mobile is"+"    "+price.getText());
		
		medium.findElementByXPath("(//img[@class='s-image'])[1]").click();
		
		Set<String> allWindows = medium.getWindowHandles();
		List<String> seeWindow = new ArrayList<String>(allWindows);
		medium.switchTo().window(seeWindow.get(1));

		
		WebElement rating = medium.findElementById("acrCustomerReviewText");
		System.out.println(rating.getText());
		
		medium.findElementById("add-to-cart-button").click();
		Thread.sleep(2000);
		WebElement neededtext = medium.findElementByXPath("(//div[@class='a-box-inner a-alert-container'])[5]/h4");
		System.out.println(neededtext.getText());
		
		/*if (ContainsText {
			System.out.println(message.getText());
		} else
			System.out.println("Not added to Cart");
		
		//System.out.println(message.getText());*/
		
		medium.findElementByXPath("(//input[@class='a-button-input'])[4]").click();
		
		System.out.println(medium.getTitle());
		
		medium.findElementById("continue").click();
		WebElement message = medium.findElementByXPath("(//div[@class='a-box-inner a-alert-container'])[2]/div");
		System.out.println(message.getText());	
		
		
		/*
		if(ContainsText) {
			
		}
		
		
	*/
		
		
		medium.quit();
		
		
		
		
	}

}
