package week2day2classassignment;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindleadANDupdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver Whistle = new ChromeDriver();
		
		Whistle.get("http://leaftaps.com/opentaps/control/main/");
		Whistle.manage().window().maximize();
		Whistle.findElementById("username").sendKeys("demosalesmanager");
		Whistle.findElementById("password").sendKeys("crmsfa");
		Whistle.findElementByClassName("decorativeSubmit").click();
		Whistle.findElementByLinkText("CRM/SFA").click();
		Whistle.findElementByLinkText("Leads").click();
		Whistle.findElementByLinkText("Find Leads").click();
		Whistle.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Sivanesh");
		Whistle.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
		
		WebDriverWait time = new WebDriverWait(Whistle, 20);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		time.until(ExpectedConditions.elementToBeClickable(Whistle.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[3]/a"))).click();
				
		Whistle.findElementByLinkText("Edit").click();
		Whistle.findElementByXPath("(//input[@class='inputBox'])[3]").clear();
		Whistle.findElementByXPath("(//input[@class='inputBox'])[3]").sendKeys("Dhilip");
		Whistle.findElementByXPath("(//input[@name='submitButton'])[1]").click();
		WebElement name = Whistle.findElementByXPath("(//span[@class='tabletext'])[4]");
		System.out.println(name.getText());
		
		Whistle.close();
		
	}

}
