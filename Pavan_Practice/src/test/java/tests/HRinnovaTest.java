package tests;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.HRLoginPage;
import testBase.P.TestBase;

public class HRinnovaTest  extends TestBase  {
HRLoginPage loginPage= new HRLoginPage(TestBase.driver);

		
		@Test(priority=0)
		public void openBrowserTest(){

		//	loginPage.openBrowser();
			
			loginPage.LoginToApplication("pssharma", "Admin@1234");
		
		}
		
		
	}



