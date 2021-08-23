package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver number = new ChromeDriver();


		//LOGIN
		number.get("http://leaftaps.com/opentaps/control/main/");
		number.manage().window().maximize();
		number.findElementById("username").sendKeys("demosalesmanager");
		number.findElementById("password").sendKeys("crmsfa");
		number.findElementByClassName("decorativeSubmit").click();
		number.findElementByLinkText("CRM/SFA").click();
		number.findElementByLinkText("Leads").click();

		//Create a Lead
		number.findElementByLinkText("Create Lead").click();
		number.findElementById("createLeadForm_companyName").sendKeys("Google");
		number.findElementById("createLeadForm_firstName").sendKeys("Sivanesh");
		number.findElementById("createLeadForm_lastName").sendKeys("Lakshmanan");
		number.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("1234567890");
		number.findElementById("createLeadForm_primaryEmail").sendKeys("sivanesh1999@gmail.com");
		number.findElementByXPath("//input[@name='submitButton']").click();

		number.findElementByLinkText("Find Leads").click();
		number.findElementByLinkText("Email").click();
		number.findElementByName("emailAddress").sendKeys("sivanesh1999@gmail.com");
		number.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);
		//String name = number.findElementByXPath("(//div[@unselectable='on'])[24]/a").getText();
		String name = number.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a").getText();
		System.out.println(name);


		number.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a").click();
		number.findElementByLinkText("Duplicate Lead").click();

		/*
		number.get("http://leaftaps.com/opentaps/control/main/");
		number.manage().window().maximize();
		number.findElementById("username").sendKeys("demosalesmanager");
		number.findElementById("password").sendKeys("crmsfa");
		number.findElementByClassName("decorativeSubmit").click();
		number.findElementByLinkText("CRM/SFA").click();
		number.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10117");
		 */

		String heading = number.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println(heading);
		number.findElementByXPath("//input[@name='submitButton']").click();

		String rename = number.findElementByXPath("//span[text()='Sivanesh']").getText();
		//System.out.println(rename);


		if (name.equals(rename)) {

			System.out.println("Same name" +" : " +rename);
		} else {

			System.out.println("Different name");

		}

		number.close();

	}

}
