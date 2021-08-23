package week2.day2homework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CreateLead {
	  ChromeDriver number;
	
	@Parameters({"url","username","password"})
	@ BeforeMethod
	public void launchBrowser(String url,String username,String password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 number = new ChromeDriver();

		//LOGIN
		number.get(url);
		number.manage().window().maximize();
		number.findElementById("username").sendKeys(username);
		number.findElementById("password").sendKeys(password);
		number.findElementByClassName("decorativeSubmit").click();
		number.findElementByLinkText("CRM/SFA").click();
	}
	
	@Test(dataProvider="data")
		public void createLeadMethod(String a,String b,String c,String d, String e) {
		number.findElementByLinkText("Leads").click();

		//Create a Lead
		number.findElementByLinkText("Create Lead").click();
		number.findElementById("createLeadForm_companyName").sendKeys(a);
		number.findElementById("createLeadForm_firstName").sendKeys(b);
		number.findElementById("createLeadForm_lastName").sendKeys(c);
		number.findElementById("createLeadForm_primaryPhoneNumber").sendKeys(d);
		number.findElementById("createLeadForm_primaryEmail").sendKeys(e);
		number.findElementByXPath("//input[@name='submitButton']").click();
		
		
		
//	number.close();
	}
	
	
	@DataProvider(name="data",parallel=true)
	public String[][] dataSender()
	{
		String[][] data= new String[2][5];
		
		data[0][0]="Google";
		data[0][1]="Sivanesh";
		data[0][2]="Laksh";
		data[0][3]="8786535161";
		data[0][4]="Google@gmail.com";
		
		data[1][0]="Amazon";
		data[1][1]="Abdul";
		data[1][2]="Laksh";
		data[1][3]="8786535161";
		data[1][4]="Google@gmail.com";
		
		

		
//		data[0][0]="sivanesh";
//		data[0][1]="Amazon";
//		data[0][2]="";
//		data[1][0]="";
//		data[1][1]="";
//		data[1][2]="";
//		data[2][0]="";
//		data[2][1]="";
//		data[2][2]="";
		
		return data;
		
		
		
	}
		
		@AfterMethod
		public Void closeBrowser()
		{
			number.close();
			return null;
		}
	
}
