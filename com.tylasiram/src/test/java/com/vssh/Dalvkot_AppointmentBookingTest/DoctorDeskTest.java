package com.vssh.Dalvkot_AppointmentBookingTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoctorDeskTest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("srinivasv.k@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("DVT@321");
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
		driver.findElement(By.xpath("//a[text()=' Doctor Desk ']")).click();
		 driver.findElement(By.xpath("//a[text()='Follow Patient List']")).click();
		 driver.findElement(By.xpath("//a[text()='My patient List']")).click();
		driver.findElement(By.xpath(
				"//a[text()='Follow Patient List']/ancestor::ul[@class='nav nav-tabs padding-0']/descendant::a[text()='All Patient List']"))
				.click();
		WebElement hospitalnum = driver.findElement(By.xpath("//*[@id='All']/table/tbody/tr[1]/td[2]/a"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", hospitalnum);
		driver.findElement(By.xpath(
				"//label[text()=' Patient Arrival ']/ancestor::div[@class='col-lg-6 col-md-6 col-sm-12']/descendant::span[@class='switch-label arrived-checked']"))
				.click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		driver.findElement(By.xpath("//a[@id='HIST1']")).click();
        driver.findElement(By.xpath("//a[text()='Visit Details ']/ancestor::div[@class='card m-0']/descendant::a[text()='History ']")).click();
		// scrolll up
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)", "");

		// chief complaint
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("asasdasdaasdasdss");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		//
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("bbbbbbbb");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		//
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("ccccccccccccc");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		//
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("ddddddddddddd");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		//
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("eeeeeeeeeeee");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("ffffffffffff");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("gggggggggggg");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		//
		WebElement drugs = driver.findElement(By.xpath("//table[@class='table table-responsive-md row-border hover']/tbody/tr/td[2]"));
		drugs.sendKeys("injection");
		Actions act = new Actions(driver);
	    act.sendKeys(Keys.DOWN,Keys.DOWN).perform();
	    act.sendKeys(Keys.ENTER).perform();
	    WebElement drugs = driver.findElement(By.xpath("//table[@class='table table-responsive-md row-border hover']/tbody/tr/td[3]"));
	    
		
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("gggggggggg");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
	  //
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("hhhhhhh");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("iiiiiiiiiii");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("jjjjjjjjj");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("kkkkkkkkkk");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("llllllllll");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("mmmmmmmmmm");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		driver.findElement(By.xpath("//*[@id='ckedit']/div[2]/div[2]/div")).sendKeys("nnnnnnnnn");
		driver.findElement(By.xpath(
				"//i[@class='zmdi zmdi-card-sd']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round btn-sm']"))
				.click();
		
		
		
		
		
	}

}
