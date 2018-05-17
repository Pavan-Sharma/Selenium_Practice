package testBase.P;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
//import org.openqa.selenium.firefox.FirefoxProfile;

public abstract class TestBase {

public static WebDriver driver;	
		
		//@BeforeClass
 @BeforeSuite
		public void setupApplication()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Practice\\Drivers\\chromedriver.exe");
			Reporter.log("=====Browser Session Started=====", true);
			
	               driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			//driver.get("https://www.google.com/");
			driver.get("https://cygnet.hrinnova.com/admin/adddataentry.aspx/");
			//driver.get("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
			
			Reporter.log("=====Application Started=====", true);
		}
		
		
		//@AfterClass
		@AfterSuite
		public void closeApplication()
		{
			driver.quit();
			Reporter.log("=====Browser Session End=====", true);
			
		}
	
/*	
	public static WebDriver driver = null;

	@BeforeSuite
	public void openDriver() {

		// for Gecko driver code more than 
		  System.setProperty("webdriver.gecko.driver","D:\\Driver\\GeckoDriver\\geckodriver.exe");
		  driver = new FirefoxDriver();           
		 
		
	//	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver_win32\\chromedriver.exe");
	//	driver = new ChromeDriver();

		// "D:\chrome\selenium-chrome-driver-3.11.0.jar"
	//}

	//public void openWebsite() {
		// for Gecko driver
		// FirefoxProfile f= new FirefoxProfile();
		// f.setPreference("webdriver.log.file", "/tmp/firefox_console");
		driver.get("http://cygnet.hrinnova.com/Login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// System.setProperty("webdriver.gecko.driver", "path of gecko driver");

	}
	//@AfterSuite
	public void closeBrowser() {
		// if(!(driver=null)
		driver.close();
	}
 */
}
