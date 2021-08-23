import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Punchin {

	public static void main(String[] args) throws InterruptedException {

		
		/*System.setProperty("webdriver.gecko.driver", "./drivers/Geckodriver/geckodriver_32 bit.exe");
		FirefoxDriver Login = new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver Login = new ChromeDriver();
		
		Login.manage().window().maximize();
		Login.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Login.get("https://sivanel:Pattu@123@mytime-lite.aka.corp.amazon.com/wfc/applications/suitenav/navigation.do?ESS=true?redirect=/wfc/applications/wtk/html/ess/timestamp.jsp");
		Login.findElementByPartialLinkText("< Home").click();
		
		Login.switchTo().frame("contentPane");
		
		List<String> x = new ArrayList<String>();
		WebElement table = Login.findElementByXPath("//table[@class='first-child ContentPanel ActionList ControlLayout']");
		WebElement rows = table.findElement(By.tagName("tr"));
		//System.out.println(row.size());
		
		
		
		
		
		
	}

}
