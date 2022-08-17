package com.vssh.Dalvkot_AppointmentBookingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifythePhoneNumberTextFiledTest {

	@Test(dataProvider = "dataproviderforLoginPage")
	public void ApponitmnetBooking(String bookingdate, String bookingtime, String name, String dateofbirth,
			String phonenumber, String email) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("tojohog699@galotv.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("dalvkot@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']")).click();
		for (int i = 0; i <= 2; i++) {
			try {
				driver.findElement(By.xpath(
						"//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']"))
						.click();
				break;
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
		}

		driver.findElement(By.xpath("//a[text()=' Appointment Booking ']")).click();
		WebElement drop = driver.findElement(By.xpath(
				"//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel = new Select(drop);
		sel.selectByVisibleText("Telephonic");

		WebElement date = driver.findElement(By.xpath(
				"//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		date.sendKeys(bookingdate);
		WebElement time = driver.findElement(By.xpath(
				"//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		time.click();
		time.sendKeys(bookingtime);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);

		WebElement select1 = driver.findElement(By.xpath(
				"//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel2 = new Select(select1);
		sel2.selectByVisibleText("MALE");

		WebElement date1 = driver.findElement(By.xpath(
				"//label[text()='Date Of Birth']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input"));
		date1.click();
		date1.sendKeys(dateofbirth);

		driver.findElement(By.xpath("//input[@formcontrolname='phoneNo']")).sendKeys(phonenumber);

		driver.findElement(By.xpath("//input[@placeholder='Email Id']")).sendKeys(email);
		driver.findElement(By.xpath(
				"//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']"))
				.click();
		WebElement dept = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions act = new Actions(driver);
		act.moveToElement(dept).sendKeys("anesthesia", Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath(
				"//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']"))
				.click();
		WebElement doct = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(doct).sendKeys("vinay kumar", Keys.ENTER).build().perform();

		driver.findElement(By.xpath(
				"//button[@class='btn btn-primary btn-round']/ancestor::div[@class='col-lg-12 text-right']/button[1]"))
				.click();
		WebElement loghead = driver.findElement(By.xpath("//b[text()='SUDH']"));
		Actions act2 = new Actions(driver);
		act2.doubleClick(loghead).perform();
		driver.findElement(By.xpath("//i[@class='zmdi zmdi-power']")).click();
		driver.close();
		
	}

	@DataProvider
	public Object[][] dataproviderforLoginPage() {
		Object[][] obj = new Object[4][6];

		// 1. Enter the numbers and special characters in phone Number TextFiled the
		// text field.
		obj[0][0] = "05082022";
		obj[0][1] = "1240";
		obj[0][2] = "guru";
		obj[0][3] = "12081991";
		obj[0][4] = "112@@#11$$";
		obj[0][5] = "gd@gmail.com";

		// 2.Enter the negative integers in the Phone number text fields.
		obj[1][0] = "04082022";
		obj[1][1] = "140";
		obj[1][2] = "guru";
		obj[1][3] = "13081997";
		obj[1][4] = "-6-3023344";
		obj[1][5] = "gt@gmail.com";

		// 3.System should not accept to select less than the current Time.
		obj[2][0] = "05082022";
		// Time Filed
		obj[2][1] = "630";
		obj[2][2] = "guru";
		obj[2][3] = "13081997";
		obj[2][4] = "63023 3454";
		obj[2][5] = "gt@gmail.com";

		// 3. Enter the Alphabits and special charecters in the phone number textfeild.
		obj[3][0] = "05082022";
		obj[3][1] = "130";
		obj[3][2] = "guru";
		obj[3][3] = "13081997";
		obj[3][4] = "QQaa@@@###";
		obj[3][5] = "gt@gmail.com";
		
		return obj;

	}
}
