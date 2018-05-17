package locators;

public interface Locators {
	
	
	public interface HRLoginPageLocators{
		 public static final String UserName_LOC="//input[@id='username']";
		 public static final String Password_LOC="//input[@id='password']";
		 public static final String LoginButton_LOC="//button[text()='LOGIN']";
		 public static final String LoginError_LOC="//span[@id='errorMessage']";
		
	}

	
	public interface NewTimeSheetEntry{
		
		public static final String BTN_Add_Timesheet_LOC="//*[@id='MainContent_UcViewDataEntry1_lnkAddNewEntry']";	
		 public static final String PickList_Date_LOC=".//*[@id='MainContent_UcAddDataEntry1_ucFromDate_ImgToEventDate']/span";
		 	 
		 public static final String DDL_ProjectDropdownList_LOC=".//*[@id='MainContent_UcAddDataEntry1_ddlProject_chosen']/a/div/b";
		 public static final String CHKBX_TimesheetTask_LOC="//*[@id='tViewParentTask']/table[3]/tbody/tr/td[2]/div/label";
		 public static final String DDL_Hours_LOC="//*[@id='cboHours_chosen']/a/span";
		 public static final String DDL_Minuts_LOC="//*[@id='cboMinutes_chosen']/a/span";
		 public static final String TxtArea_WorkDescription_LOC="//*[@id='MainContent_UcAddDataEntry1_txtDesc']";
		 public static final String BTN_Save_LOC="//*[@id='btnSubmit']/i";
		
	}

}
