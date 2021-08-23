package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteLead {
	
		//public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
		ChromeDriver number;
		
		//LOGIN
		@BeforeMethod 
		public void loginLeaftaps() {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			number = new ChromeDriver();
		number.get("http://leaftaps.com/opentaps/control/main/");
		number.manage().window().maximize();
		number.findElementById("username").sendKeys("demosalesmanager");
		number.findElementById("password").sendKeys("crmsfa");
		number.findElementByClassName("decorativeSubmit").click();
		number.findElementByLinkText("CRM/SFA").click();
		number.findElementByLinkText("Leads").click();
		}
		
		//Create a Lead
		@Test
		public void launchTesting() throws InterruptedException {
		number.findElementByLinkText("Create Lead").click();
		number.findElementById("createLeadForm_companyName").sendKeys("Google");
		number.findElementById("createLeadForm_firstName").sendKeys("Sivanesh");
		number.findElementById("createLeadForm_lastName").sendKeys("Lakshmanan");
		number.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		number.findElementByXPath("//input[@name='submitButton']").click();
		
		//Find a lead
		number.findElementByLinkText("Find Leads").click();
		number.findElementByLinkText("Phone").click();
		number.findElementByName("phoneNumber").sendKeys("1234567890");
		number.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String name = number.findElementByXPath("(//div[@unselectable='on'])[24]/a").getText();
		System.out.println(name);
		
		number.findElementByXPath("(//div[@unselectable='on'])[24]/a").click();
		
		//Delete a lead
		number.findElementByLinkText("Delete").click();
		number.findElementByLinkText("Find Leads").click();
		
		//Find lead again
		number.findElementByName("id").sendKeys(name);
		number.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String display = number.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(display);
		}
		
		@AfterMethod
		public void closeBrowser() {
		number.close();
		}
		
	}

