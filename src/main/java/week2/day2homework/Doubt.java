package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;

public class Doubt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver number = new ChromeDriver();
		
		number.get("http://leaftaps.com/opentaps/control/main/");
		number.manage().window().maximize();
		number.findElementById("username").sendKeys("demosalesmanager");
		number.findElementById("password").sendKeys("crmsfa");
		number.findElementByClassName("decorativeSubmit").click();
		number.findElementByLinkText("CRM/SFA").click();
		number.get("http://leaftaps.com/crmsfa/control/viewLead?partyId=10127");
		String rename = number.findElementByXPath("(//span[@class='tabletext'])[4]").getText();
		System.out.println(rename);
	}

}
