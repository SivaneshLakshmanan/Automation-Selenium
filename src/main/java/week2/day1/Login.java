package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".drivers/Chromedriver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Mannaran");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sivanesh");
		driver.findElementById("createLeadForm_lastName").sendKeys("Lakshmanan");
		
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(source);
		dropDown.selectByVisibleText("Employee");
		
		/*WebElement marketing = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown2 = new Select(marketing);
		dropDown2.selectByValue("9001");
		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select dropDown3 = new Select(industry);
		dropDown3.selectByValue("IND_TELECOM");
		List<WebElement> listtotaloption = dropDown3.getOptions();
		System.out.println(listtotaloption.size());
		dropDown3.selectByIndex(listtotaloption.size()-2);
		
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		
	    Select dropDown4 = new Select(ownership);
	    dropDown4.selectByIndex(5);
	    
	    WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
	    Select dropDown5 = new Select(country);
	    dropDown5.selectByVisibleText("India");
	    
	    driver.findElementByName("submitButton").click();
	    //System.out.println(driver.get);
	    
		
		*/
		
		
		
		
		

		
		
		
		
		
	}

}
