package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageObjects.NewTimesheetEntryPage;
import testBase.P.TestBase;

public class NewTimeSheetEntryTest extends TestBase{
	NewTimesheetEntryPage nw=new NewTimesheetEntryPage(TestBase.driver);
	
	@Test
	public void newTimesheetEntry(){
		//TestBase.driver.manage().timeouts().implicitlyWait(50000, TimeUnit.SECONDS);
		nw.fillTimesheetEntry();
		//TestBase.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
}

	
	

}
