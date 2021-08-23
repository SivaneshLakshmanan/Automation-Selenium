package projectday;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SimpleTestCase {

	private static WebElement findElementByXPath;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver easy = new ChromeDriver();
		
		easy.get("https://acme-test.uipath.com/account/Login");
		easy.manage().window().maximize();
		easy.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		easy.findElementById("email").sendKeys("kumar.testleaf@gmail.com");		
		easy.findElementById("password").sendKeys("leaf@12");
		easy.findElementById("buttonLogin").click();
		WebElement action = easy.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]");
		WebElement vendor = easy.findElementByXPath("(//ul[@class='dropdown-menu dropdown-content rightMenu'])[4]/li");
		
		
		Actions mouseover = new Actions(easy);
		mouseover.moveToElement(action).perform();
		Thread.sleep(2000);
		mouseover.click(vendor).perform();
		
		easy.findElementById("vendorName").sendKeys("Blue Lagoon");
		easy.findElementById("buttonSearch").click();
		
		WebElement eleTable = easy.findElementByClassName("table");
		List<WebElement> tableRow = eleTable.findElements(By.tagName("tr"));
		System.out.println(tableRow.size());
		WebElement data = tableRow.get(1);
		List<WebElement> tabledata = data.findElements(By.tagName("td"));
		System.out.println(tabledata.get(4).getText());
		
		
		easy.findElementByLinkText("Log Out").click();
		
		/*WebElement dropdown = easy.findElementByClassName("navbar-toggle");
		Select logout = new Select(dropdown);
		logout.selectByVisibleText("Log Out");*/
		
		easy.close();
		
	}

}
