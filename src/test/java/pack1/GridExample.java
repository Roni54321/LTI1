package pack1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridExample {
	@Test
	public void mailTest() throws MalformedURLException{
	DesiredCapabilities dr=null;
	dr=DesiredCapabilities.chrome();
	dr.setBrowserName("chrome");
	dr.setPlatform(Platform.WINDOWS);
	RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
	driver.navigate().to("https://blazedemo.com/");
//	Thread.sleep(5000);
	driver.close();
	}
}