package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import locators.Locators;
import testBase.P.TestBase;

public class NewTimesheetEntryPage extends TestBase implements Locators {
	
	public NewTimesheetEntryPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Locators.NewTimeSheetEntry.BTN_Add_Timesheet_LOC)
	private WebElement BTN_Add_Timesheet;
	

	@FindBy(xpath=Locators.NewTimeSheetEntry.PickList_Date_LOC)
	private WebElement PickList_Date;

	@FindBy(xpath=Locators.NewTimeSheetEntry.DDL_ProjectDropdownList_LOC)
	private WebElement DDL_ProjectDropdownList;

	@FindBy(xpath=Locators.NewTimeSheetEntry.CHKBX_TimesheetTask_LOC)
	private WebElement CHKBX_TimesheetTask;

	public WebElement getBTN_Add_Timesheet() {
		return BTN_Add_Timesheet;
	}
	@FindBy(xpath=Locators.NewTimeSheetEntry.DDL_Hours_LOC)
	private WebElement DDL_Hours;
    @FindBy(xpath=Locators.NewTimeSheetEntry.DDL_Minuts_LOC)
	private WebElement DDL_Minuts;
    @FindBy(xpath=Locators.NewTimeSheetEntry.TxtArea_WorkDescription_LOC)
	private WebElement TxtArea_WorkDescription;
    
    @FindBy(xpath=Locators.NewTimeSheetEntry.BTN_Save_LOC)
	private WebElement BTN_Save;


	public void setBTN_Add_Timesheet(WebElement bTN_Add_Timesheet) {
		BTN_Add_Timesheet = bTN_Add_Timesheet;
	}

	public WebElement getPickList_Date() {
		return PickList_Date;
	}

	public void setPickList_Date(WebElement pickList_Date) {
		PickList_Date = pickList_Date;
	}

	public WebElement getDDL_ProjectDropdownList() {
		return DDL_ProjectDropdownList;
	}

	public void setDDL_ProjectDropdownList(WebElement dDL_ProjectDropdownList) {
		DDL_ProjectDropdownList = dDL_ProjectDropdownList;
	}

	public WebElement getCHKBX_TimesheetTask() {
		return CHKBX_TimesheetTask;
	}

	public void setCHKBX_TimesheetTask(WebElement cHKBX_TimesheetTask) {
		CHKBX_TimesheetTask = cHKBX_TimesheetTask;
	}

	public WebElement getDDL_Hours() {
		return DDL_Hours;
	}

	public void setDDL_Hours(WebElement dDL_Hours) {
		DDL_Hours = dDL_Hours;
	}

	public WebElement getDDL_Minuts() {
		return DDL_Minuts;
	}

	public void setDDL_Minuts(WebElement dDL_Minuts) {
		DDL_Minuts = dDL_Minuts;
	}

	public WebElement getTxtArea_WorkDescription() {
		return TxtArea_WorkDescription;
	}

	public void setTxtArea_WorkDescription(WebElement txtArea_WorkDescription) {
		TxtArea_WorkDescription = txtArea_WorkDescription;
	}

	public WebElement getBTN_Save() {
		return BTN_Save;
	}

	public void setBTN_Save(WebElement bTN_Save) {
		BTN_Save = bTN_Save;
	}

	//Fill new timesheet entry for past day.
	public void fillTimesheetEntry(){
		NewTimesheetEntryPage nt=new NewTimesheetEntryPage(TestBase.driver);
		TestBase.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		nt.BTN_Save.click();
		TestBase.driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		System.out.println("After click on Add Timesheet");
		
	}
	
	
}
