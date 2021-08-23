package rahulShettytraining;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Gridconcept {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setBrowserName("chrome"); //lowecase sensitive
		ds.setPlatform(Platform.WINDOWS); 
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.225.221:4444/wd/hub"), ds);
		driver.get("www.google.com");
	}

}
