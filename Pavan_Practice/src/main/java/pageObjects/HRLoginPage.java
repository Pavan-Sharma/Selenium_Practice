package pageObjects;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import locators.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testBase.P.TestBase;

	public class HRLoginPage  extends TestBase implements Locators{
//		 public static WebDriver driver;
		
		public HRLoginPage(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	      PageFactory.initElements(driver, this);

		}
		@FindBy(xpath =Locators.HRLoginPageLocators.UserName_LOC)
		//@FindBy(xpath ="//input[@id='username']")
	    private WebElement txtbx_UserName;
		
		//@FindBy(xpath ="//input[@id='password']") 
		@FindBy(xpath =Locators.HRLoginPageLocators.Password_LOC)
	    private WebElement txtbx_Password;
		
		
		//@FindBy(xpath ="//input[@id='password']") 
			@FindBy(xpath =Locators.HRLoginPageLocators.LoginButton_LOC)
		    private WebElement btn_Login;
			
		

			public WebElement getTxtbx_UserName() {
				return txtbx_UserName;
			}
			public WebElement getTxtbx_Password() {
				return txtbx_Password;
			}
			public WebElement getBtn_Login() {
				return btn_Login;
			}
			public WebElement getTxt_ErrorMessage() {
				return txt_ErrorMessage;
			}
			
			
			public void setTxtbx_UserName(WebElement txtbx_UserName) {
				this.txtbx_UserName = txtbx_UserName;
			}
			public void setTxtbx_Password(WebElement txtbx_Password) {
				this.txtbx_Password = txtbx_Password;
			}
			public void setBtn_Login(WebElement btn_Login) {
				this.btn_Login = btn_Login;
			}
			public void setTxt_ErrorMessage(WebElement txt_ErrorMessage) {
				this.txt_ErrorMessage = txt_ErrorMessage;
			}
	//@FindBy(xpath ="//span[@id='errorMessage']") 
	   @FindBy(xpath =Locators.HRLoginPageLocators.LoginError_LOC)
	    private WebElement txt_ErrorMessage;
		
	   public void openBrowser(){
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\Driver\\chromedriver.exe");
			TestBase.driver= new ChromeDriver();
			TestBase.driver.get("https://cygnet.hrinnova.com/");
			TestBase.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			System.out.println("Navigate to Login page");
		}
		public void LoginToApplication(String UserName, String Password){
		HRLoginPage HRLoginPage=new HRLoginPage(TestBase.driver);
		//	HRLoginPage HRLoginPage= new HRLoginPage();
			TestBase.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
			HRLoginPage.getTxtbx_UserName().sendKeys(UserName);
			HRLoginPage.getTxtbx_Password().sendKeys(Password);
			HRLoginPage.getBtn_Login().click();
//			txtbx_UserName.sendKeys(UserName);
//			txtbx_Password.sendKeys(Password);
//			btn_Login.click();
//			
			//if(txt_ErrorMessage.isDisplayed()){
			//assertEquals("Invalid user name or password.", txt_ErrorMessage.getText());
			if(HRLoginPage.txt_ErrorMessage.isDisplayed()){
			assertEquals("Invalid user name or password.", HRLoginPage.txt_ErrorMessage.getText());
				
			}
			else{
			System.out.println("login successsfully");
			
	 
		}

		}
	}

		


	

