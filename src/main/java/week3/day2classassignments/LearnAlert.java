package week3.day2classassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver ushaar = new ChromeDriver();
		
		ushaar.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		ushaar.manage().window().maximize();
		ushaar.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ushaar.switchTo().frame("iframeResult");
		
		ushaar.findElementByXPath("//button[text()='Try it']").click();
		
		Alert x = ushaar.switchTo().alert();
		x.sendKeys("Siva");
		x.accept();
		
		
		
		String name = ushaar.findElementById("demo").getText();
		//System.out.println(name);
		
		//if (name.equalsIgnoreCase("Hello/t"+name+"! How are you today?")) {
		
		if (name.contains("Siva")) {
		
			 System.out.println("Is Present");
		}
		 else {
			 
			 System.out.println("Not Present");
	}
		 
		ushaar.close();
		
		
	}
	
}
