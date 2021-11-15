package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class CrossBrowser {

	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\LTISelenium\\BrowserDriver\\chromedriver.exe");
	        driver=new ChromeDriver();
			
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\LTISelenium\\BrowserDriver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
	else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\LTISelenium\\BrowserDriver\\IEDriverServer.exe");
	        driver=new InternetExplorerDriver();
	}
		
		else 
		{
			throw new Exception("Browser is not correct");
		}
	
	}
	
	@Test
	public void demo() throws InterruptedException {
		driver.get("https://petstore.octoperf.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Enter the Store")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[starts-with(@id,'strip')]")).sendKeys("j2ee");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("j2ee");
	    Thread.sleep(3000);
	    driver.findElement(By.name("signon")).click();
	    Thread.sleep(3000); 
	    //driver.quit();
	    driver.close();
	}
}