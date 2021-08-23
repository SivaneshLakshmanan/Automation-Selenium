package projectday;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.ContainsOwnText;
import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver hard = new ChromeDriver();
		
		hard.get("https://www.zoomcar.com/chennai");
		hard.manage().window().maximize();
		hard.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//First page
		hard.findElementByClassName("search").click();
		
		//Thoraipakkam place
		WebElement Tuesday1 = hard.findElementByXPath("//div[@class='items']");
		Tuesday1.click();
		hard.findElementByClassName("proceed").click();
		
		//Start date and get the text
		WebElement Tuesday2 = hard.findElementByXPath("(//div[@class='day low-price'])[1]");
		Tuesday2.click();
		hard.findElementByClassName("proceed").click();
		WebElement done = hard.findElementByXPath("//button[@class='proceed']");
		System.out.println(Tuesday1.getText());
		done.click();
		
		//Get start and end date confirmation
		/*WebElement Tuesday1 = hard.findElementByXPath("//div[@class='label time-label']");
		System.out.println(Tuesday1.getText());
		WebElement Tuesday2 = hard.findElementByXPath("(//div[@class='label time-label'])[2]");
		System.out.println(Tuesday2.getText());*/
		
		/*if(Tuesday1 == Tuesday2) {
			hard.close();
		} else 
			done.click();*/
		
		List<WebElement> carNames = hard.findElementsByXPath("//div[@class='details']");
		
		List<String> names = new ArrayList<>();
		
		for (WebElement eachName :carNames) {
			String text = eachName.getText();
			names.add(text);
		}
			
		for (String xyz : names) {
			System.out.println(xyz);
		}
	
		
		//hard.close();
	}
	

	
	}

