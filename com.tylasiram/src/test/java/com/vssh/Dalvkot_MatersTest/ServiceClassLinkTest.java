package com.vssh.Dalvkot_MatersTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceClassLinkTest {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://111.93.140.107/vsshhms-demo/settings/permission");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='Enter Email Id'][1]")).sendKeys("tojohog699@galotv.com");
		driver.findElement(By.xpath("//input[@placeholder='Password'][1]")).sendKeys("dalvkot@123");
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-lg btn-block']")).click();
		for (int i = 0; i <= 2; i++)
		{
			try {
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
	  			     break;
	  			  }
	   			  catch(Exception e)
	  		      {
	  			   System.out.print(e.getMessage());
	  			  }
	  		}
		
		WebElement webelement = driver.findElement(By.xpath("//a[text()=' Service Class Link ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", webelement);
		driver.findElement(By.xpath("//i[@class='zmdi zmdi-plus-circle']")).click();
		WebElement servicetype = driver.findElement(By.xpath("//label[text()='Service Type']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-3 col-xs-12 p-0']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel=new Select(servicetype);
		sel.selectByVisibleText("");
		
		
}
}