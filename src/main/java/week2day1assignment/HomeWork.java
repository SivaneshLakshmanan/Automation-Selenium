package week2day1assignment;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver conductor = new ChromeDriver();
		
		conductor.get("http://leaftaps.com/opentaps/control/main");
		conductor.manage().window().maximize();
		conductor.findElementById("username").sendKeys("demosalesmanager");
		conductor.findElementById("password").sendKeys("crmsfa");
		conductor.findElementByClassName("decorativeSubmit").click();
		conductor.findElementByLinkText("CRM/SFA").click();
		conductor.findElementByLinkText("Accounts").click();
		conductor.findElementByLinkText("Create Account").click();
		conductor.findElementById("accountName").sendKeys("Sivanesh Limited Account");
		conductor.findElementByName("description").sendKeys("\"Selenium Automation Tester\"");
		conductor.findElementByXPath("//*[@id='groupNameLocal']").sendKeys("Chennai");
		conductor.findElementByXPath("//*[@id='officeSiteName']").sendKeys("Thiruvanmiyur");
		conductor.findElementByXPath("//input[@id='annualRevenue']").sendKeys("10000");
		
		WebElement industry = conductor.findElementByName("industryEnumId");
		Select dropdown1 = new Select(industry);
		dropdown1.selectByVisibleText("Computer Software");
		
		WebElement source = conductor.findElementByName("dataSourceId");
		Select dropdown2 = new Select(source);
		dropdown2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement ownership = conductor.findElementByName("ownershipEnumId");
		Select dropdown3 = new Select(ownership);
		dropdown3.selectByValue("OWN_SCORP");
		
		WebElement marketing = conductor.findElementByXPath("//*[@id='marketingCampaignId']");
		Select dropdown4 = new Select(marketing);
		dropdown4.selectByIndex(6);
	
		WebElement state = conductor.findElementByXPath("//*[@id='generalStateProvinceGeoId']");
		Select dropdown5= new Select(state);
		dropdown5.selectByValue("TX");
		
		conductor.findElementByXPath(".//input[@value='Create Account']").click();
	}

}
