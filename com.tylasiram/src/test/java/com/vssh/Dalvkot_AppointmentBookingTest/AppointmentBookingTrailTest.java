package com.vssh.Dalvkot_AppointmentBookingTest;

import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Dalvkot.vsshhms_GenericUtility.BaseClass;
import com.Dalvkot.vsshhms_GenericUtility.ExcelUtility;
import com.Dalvkot.vsshhms_GenericUtility.FileUtility;
import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners(com.Dalvkot.vsshhms_GenericUtility.ListenerImp.class)
public class AppointmentBookingTrailTest extends BaseClass {
	
	@Test
	public void get() throws Throwable {

		String telephonic = eutil.getDataFromTheExcel("Sheet3", 1, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 1, 2);
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 1, 3);
		String name = eutil.getDataFromTheExcel("Sheet3", 1, 4);
		String gender = eutil.getDataFromTheExcel("Sheet3", 1, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 1, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 1, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 1, 8);
		String department = eutil.getDataFromTheExcel("Sheet3", 1, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 1, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();

		// Appointment Type
		WebElement drop = driver.findElement(By.xpath(
				"//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel = new Select(drop);
		sel.selectByVisibleText(telephonic);

		// booking date
		WebElement bookingd = driver.findElement(By.xpath(
				"//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		bookingd.sendKeys(bookingdate);

		// Booking Time
		WebElement time = driver.findElement(By.xpath(
				"//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		time.click();
		time.sendKeys(bookingtime);

		// Patient Name
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);

		// Gender Drop down
		WebElement select1 = driver.findElement(By.xpath(
				"//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel2 = new Select(select1);
		sel2.selectByVisibleText(gender);

		// Date of Birth
		WebElement dateOfBirth = driver.findElement(By.xpath(
				"//label[text()='Date Of Birth']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		dateOfBirth.click();
		dateOfBirth.sendKeys(dateofbirth);

		// PhoneNumber
		driver.findElement(By.xpath("//input[@formcontrolname='phoneNo']")).sendKeys(phonenumber);

		// Email
		driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys(email);

		// department

		driver.findElement(By.xpath(
				"//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']"))
				.click();
		WebElement dep = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions act = new Actions(driver);
		act.moveToElement(dep).sendKeys("ENT", Keys.ENTER).build().perform();
		Thread.sleep(3000);
		for (int i = 0; i <= 2; i++) {
			try {
				driver.findElement(By.xpath(
						"//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']"))
						.click();
				break;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}

		WebElement doc = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(doc).sendKeys("JAYARAM", Keys.ENTER).build().perform();
		
		// BookNow Button
		driver.findElement(By.xpath(
				"//button[@class='btn btn-primary btn-round btn-simple']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round']"))
				.click();
		WebElement okpopup = driver.findElement(By.xpath("//button[text()='OK']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(okpopup).perform();
		WebElement mobile = driver.findElement(By
				.xpath("//table[@class='table table-responsive-md table-striped row-border hover']/tbody/tr[1]/td[6]"));
                  String mobilenum = mobile.getText();
		Assert.assertEquals(mobilenum, phonenumber);
		System.out.println("created");
	}
}

