package week2.day2homework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EditLead {
	
		ChromeDriver Feb;
		/*public void newEdit() throws InterruptedException {
		// TODO Auto-generated method stub*/
		
		@Parameters({"url","username","password"})
		@BeforeMethod
		
		public void launchBrowser(String url,String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		Feb = new ChromeDriver();
		Feb.get(url);
		Feb.manage().window().maximize();
		Feb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Feb.findElementById("username").sendKeys(username);
		Feb.findElementByName("PASSWORD").sendKeys(password);
		Feb.findElementByClassName("decorativeSubmit").click();
		Feb.findElementByLinkText("CRM/SFA").click();
		}
		
		@Test(dataProvider="data")
		public void executeCode(String fn,String update)throws InterruptedException {
		Feb.findElementByLinkText("Leads").click();
		Feb.findElementByLinkText("Find Leads").click();
		Feb.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(fn);
		Feb.findElementByXPath("//button[text()='Find Leads']").click();
		
		WebDriverWait wait = new WebDriverWait(Feb, 30);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Feb.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))).click();
		System.out.println(Feb.getTitle());
		Feb.findElementByLinkText("Edit").click();
		Feb.findElementById("updateLeadForm_companyName").clear();
		Feb.findElementById("updateLeadForm_companyName").sendKeys(update);
		Feb.findElementByXPath("//input[@class='smallSubmit']").click();
		System.out.println(Feb.findElementById("viewLead_companyName_sp").getText());
		}
		
		@DataProvider(name="data")
		public String[][] dataSender()
		{
			String[][] data= new String[1][2];
			
			data[0][0]="sivanesh";
			data[0][1]="Siva_&_Co";
			
//			data[0][0]="sivanesh";
//			data[0][1]="Amazon";
//			data[0][2]="";
//			data[1][0]="";
//			data[1][1]="";
//			data[1][2]="";
//			data[2][0]="";
//			data[2][1]="";
//			data[2][2]="";
			
			return data;
			
			
			
		}
			
		@AfterMethod
		public void quitBrowser() {
		Feb.close();	
		}
	
		
}


