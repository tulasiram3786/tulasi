package com.vssh.Dalvkot_AppointmentBookingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PatientAdmission {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("tojohog699@galotv.com");
	driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("dalvkot@123");
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']")).click();
	
	HomePage hp=new HomePage(driver);
	hp.homeBtn(driver);
	WebElement webElement = driver.findElement(By.xpath("//a[text()=' Patient Admission ']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", webElement);
	driver.findElement(By.xpath("//input[@placeholder='Hospital No']")).sendKeys("103527");
	
		
	}

}
