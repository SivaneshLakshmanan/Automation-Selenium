package week3.day2homeassignment;

import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {


	public static void main(String[] args) {

		//To cancel the notification 
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Whistle = new ChromeDriver(options);
		
		Whistle.get("https://www.cleartrip.com/");
		Whistle.manage().window().maximize();
		Whistle.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Whistle.findElementById("RoundTrip").click();
		Whistle.findElementById("FromTag").sendKeys("Chennai");
		Whistle.findElementById("ToTag").sendKeys("Mumbai");
		Whistle.findElementById("DepartDate").click();
		
		WebElement eleTable1 = Whistle.findElementByXPath("//div[@class='monthBlock first']/table");
		List<WebElement> rows1 = eleTable1.findElements(By.tagName("tr"));
		System.out.println(rows1.size());
		System.out.println(rows1.get(3).getText());
		WebElement thirdRow = rows1.get(3);
		List<WebElement> result1 = thirdRow.findElements(By.tagName("td"));
		result1.get(5).click();
		
		System.out.println("---------------------");
		
		Whistle.findElementById("ReturnDate").click();
		
		WebElement eleTable2 = Whistle.findElementByXPath("//div[@class='monthBlock first']/table");
		List<WebElement> rows2 = eleTable2.findElements(By.tagName("tr"));
		System.out.println(rows2.size());
		System.out.println(rows2.get(4).getText());
		WebElement fourthRow = rows2.get(4);
		List<WebElement> result2 = fourthRow.findElements(By.tagName("td"));
		result2.get(1).click();
		
		
		
		
	
		
		
		/*Whistle.findElementByXPath("(((//table[@class='calendar'])[1]//tr)[4]/td)[5]").click();
		Whistle.findElementById("ReturnDate").click();
		Whistle.findElementByXPath("(((//table[@class='calendar'])[1]//tr)[4]/td)[6]").click();*/
		
		WebElement Adults = Whistle.findElementById("Adults");
		Select x = new Select(Adults);
		x.selectByVisibleText("2");
		
		WebElement Children = Whistle.findElementById("Childrens");
		Select y = new Select(Children);
		y.selectByVisibleText("1");
		
		
		WebElement Infants = Whistle.findElementById("Infants");
		Select z = new Select(Infants);
		z.selectByVisibleText("1");
		
		Whistle.findElementById("MoreOptionsLink").click();
		WebElement Class = Whistle.findElementById("Class");
		Select a = new Select(Class);
		a.selectByVisibleText("Economy");
		
		WebElement Airlines = Whistle.findElementById("AirlineAutocomplete");
		Airlines.sendKeys("IndiGo");
		Actions qwerty = new Actions(Whistle);
		qwerty.sendKeys(Keys.TAB).build().perform();
		qwerty.sendKeys(Keys.RETURN).build().perform();
		
		Whistle.findElementById("SearchBtn").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


	
}
