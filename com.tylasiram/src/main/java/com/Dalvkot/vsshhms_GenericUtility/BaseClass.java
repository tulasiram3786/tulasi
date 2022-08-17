package com.Dalvkot.vsshhms_GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;
import com.Dalvkot.vsshhms_ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver=null;
	public static WebDriver sdriver;
	public FileUtility futil=new FileUtility();
	public ExcelUtility eutil=new ExcelUtility();
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	
	@BeforeSuite
	public void bsuite()
	{
	
	}
	
	@BeforeTest
	public void btest()
	{
		
	}
	
	@BeforeClass
	public void bclass() throws Throwable 
	{
		String browserName = futil.getProperyKeyValue("browser");
		String url = futil.getProperyKeyValue("url");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			System.out.println("launch browser is "+browserName);
			
		}else {
			System.out.println("Specify Valid broswer");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		WebDriverWait wait =new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		sdriver=driver;
	}
	
	@BeforeMethod
	public void bmethod() throws Throwable
	{
	  String username = futil.getProperyKeyValue("username");
	  String password = futil.getProperyKeyValue("password");
	  LoginPage page=new LoginPage(driver);
	  page.loginToApplication(username, password);
	}
	
	@AfterMethod
	public void amethod()
	{
		 WebElement loghead = driver.findElement(By.xpath("//b[text()='sudarshan']"));
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        Actions act1=new Actions(driver);
	        act1.moveToElement(loghead).perform();
	        act1.doubleClick(loghead).perform();
	        driver.findElement(By.xpath("//i[@class='zmdi zmdi-power']")).click();
	}
	
	@AfterClass
	public void aclass()
	{
		
		driver.quit();
		System.out.println("Close the Browser");
	}
	
	@AfterTest
	public void atest()
	{
		
	}
	@AfterSuite
	public void asuite()
	{
		
	}

}













