package com.vssh.Dalvkot_LoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Dalvkot.vsshhms_GenericUtility.ExcelUtility;
import com.Dalvkot.vsshhms_GenericUtility.FileUtility;
import com.Dalvkot.vsshhms_GenericUtility.WebDriverUtility;
import com.Dalvkot.vsshhms_ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderForLoginPageTest extends ExcelUtility {
	@Test(dataProvider = "dataProviderForLoginPage")
	public void loginPage(String username, String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    LoginPage lp=new LoginPage(driver);
	    lp.loginToApplication(username, password);
		driver.close();
	}

	@DataProvider
	public Object[][] dataProviderForLoginPage() throws Throwable {
		Object[][] obj = new Object[1][2];
		ExcelUtility eutil=new ExcelUtility();
		String usernametext = eutil.getDataFromTheExcel("Sheet1", 1, 1);
		String pwd = eutil.getDataFromTheExcel("Sheet1", 1, 2);

		// Verify by Giving invalid username and valid password
		obj[0][0] = usernametext;
		obj[0][1] = pwd;
//
//		// Verify by Givivng Valid username and invalid password
//		obj[1][0] = "tojohog@galotv.com";
//		obj[1][1] = "dalvkot";
//
//		// Verify by Giving invalid username and invalid password
//		obj[2][0] = "tojohog@galotv.com";
//		obj[2][1] = "dalvko";
//
//		// Verify the Case sensitive of Username
//		obj[3][0] = "TOjoHOG699@galotv.com";
//		obj[3][1] = "dalvkot@123";
//
//		// without Entering username and password
//		obj[4][0] = "";
//		obj[4][1] = "";
//
//		// With username and without password
//		obj[5][0] = "tojohog699@galotv.com";
//		obj[5][1] = "";
//
//		// Without username and with password
//		obj[6][0] = "";
//		obj[6][1] = "dalvkot@123";
//
//		// Verify by Giving valid username and valid password
//		obj[7][0] = "tojohog699@galotv.com";
//		obj[7][1] = "dalvkot@123";
//
//		return obj;
//
//	}

}
}

