package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

// I have called the Interface (SetInterface) via implement keyword to this class called ImpSetInterface
// Here I can use those methods or functions created in Interface within which I can write my codes

public class ImpSetInterface implements SetInterface {

	//super class
	public  RemoteWebDriver driver;
	
	//from interface
	public void Cbrowser(String browser) {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "./drivers/Geckodriver/geckodriver_32 bit.exe");
			FirefoxDriver driver = new FirefoxDriver();
		}
		
		
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	@Override
	public void enterValue(String localvalue, String data) {
	
		driver.findElementById(localvalue).sendKeys(data);
	}



}


