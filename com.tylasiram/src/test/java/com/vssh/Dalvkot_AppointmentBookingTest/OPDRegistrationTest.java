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
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;
@Listeners(com.Dalvkot.vsshhms_GenericUtility.ListenerImp.class)
public class OPDRegistrationTest {
	public static void main(String[] args) throws Throwable {
		
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
		         driver.findElement(By.xpath("//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")).click();
	  			     break;
	  			  }
	   			  catch(Exception e)
	  		      {
	  			   System.out.print(e.getMessage());
	  			  }
	  		}
//	    
	    //click on opd registration
	    driver.findElement(By.xpath("//a[text()=' OPD Registration ']")).click();
	   
	    //scrolll up
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,-350)", "");
		
		//Regsitration type drop down
		WebElement drop = driver.findElement(By.xpath("//label[text()='Registration Type ']/ancestor::div[@class='form-group col-lg-4 col-md-4 col-xl-4 col-sm-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("EMERGENCY");
       
		//Patient type dropdown
        WebElement drop1 = driver.findElement(By.xpath("//label[text()='Patient Type ']/ancestor::div[@class='form-group col-lg-4 col-md-4 col-xl-4 col-sm-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel1=new Select(drop1);
		sel1.selectByIndex(0);
		
		//Patient category dropdown
		WebElement drop2 = driver.findElement(By.xpath("//label[text()='Patient Category ']/ancestor::div[@class='form-group col-lg-4 col-md-4 col-xl-4 col-sm-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
		Select sel2=new Select(drop2);
		sel2.selectByVisibleText("COVID");
	
		driver.findElement(By.xpath("//input[@id='firstNameValueNew']")).sendKeys("suda");
        driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("23");
        driver.findElement(By.xpath("//input[@placeholder='Father Name']")).sendKeys("abc");
       driver.findElement(By.xpath("//label[text()='Mobile Number ']/ancestor::div[@class='form-group col-lg-8 col-xl-8 col-sm-3 col-md-3 col-xs-12']/descendant::input[@placeholder='Mobile Number']")).sendKeys("9999999999");
     
//        //Occupation Dropdown
//        WebElement occupationdropdown = driver.findElement(By.xpath("//label[text()='Occupation ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
//        Select sel3=new Select(occupationdropdown);
//        sel3.selectByVisibleText("FARMER");
       
      //  driver.findElement(By.xpath("//input[@id='validatemail']")).sendKeys("pk@gmail.com");
       
        //scroll Down
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,450)", "");
        
//        
//        //Address
//        WebElement address = driver.findElement(By.xpath("//label[text()='Address '][1]/ancestor::div[@class='form-group col-lg-12 col-xl-12 col-sm-12 col-md-12 col-xs-12']/descendant::textarea[@class='form-control address ng-pristine ng-invalid ng-touched']"));  
//		address.sendKeys("BANGALORE");
//	
//       
//        //Pincode
//        driver.findElement(By.xpath("//input[@placeholder='Pincode' and @class='form-control pinCodeValue ng-pristine ng-valid ng-touched']")).sendKeys("560037");
      
//        //Post office Drop down select
//        WebElement postOfficeDrop = driver.findElement(By.xpath("//label[text()='Post Office']/ancestor::div[@class='form-group col-lg-4 col-xl-4 col-sm-4 col-md-4 col-xs-12']/descendant::select[1]"));
//        Select sel4=new Select(postOfficeDrop);
//        sel4.selectByVisibleText("MARATHAHALLI COLONY S.O");
        
        js2.executeScript("window.scrollBy(0,450)", "");
        
//        //MLC dropdown
//        WebElement MLCdrop = driver.findElement(By.xpath("//label[text()=' MLC ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
//        Select sel5=new Select(MLCdrop);
//        sel5.selectByVisibleText("ACCIDENT");
        
        js2.executeScript("window.scrollBy(0,450)", "");
        
//        //Clinic name Drop down
//        WebElement clinicname = driver.findElement(By.xpath("//label[text()=' Clinic Name ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
//        Select sel6=new Select(clinicname);
//        sel6.selectByIndex(1);
////        
//        //Doctor dropdown
//        WebElement doctordropdown = driver.findElement(By.xpath("//label[text()=' Doctor ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
//        Select sel7=new Select(doctordropdown);
//        sel7.selectByVisibleText("VIDYASAGAR");
        
        //Department dropdown
//     
//  	    WebElement deptdropdown = driver.findElement(By.xpath("//label[text()=' Department ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[@class='select2-hidden-accessible']"));
//  		Select sel8=new Select(deptdropdown);
//  		sel8.selectByIndex(0);
  		         
//        //Room number []
//        WebElement roomndropdown = driver.findElement(By.xpath("//label[text()='Room Number']/ancestor::div[@class='col-xl-3 col-lg-3 col-sm-4 col-md-4 col-xs-12']/descendant::select[1]"));
//        Select sel9=new Select(roomndropdown);
//        sel9.selectByVisibleText("G01");
        
        //clicnic name
       // driver.findElement(By.xpath("//label[text()=' Clinic Name ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")).click();
       //
        driver.findElement(By.xpath("//label[text()=' Doctor ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")).click();
        WebElement doctordrop = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        Actions a=new Actions(driver);
        a.moveToElement(doctordrop).sendKeys("sathya narayana",Keys.ENTER).build().perform();
        
        for (int i = 0; i <= 2; i++) {
			try {
		         driver.findElement(By.xpath("//label[text()=' Department ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")).click();
	  			     break;
	  			  }
	   			  catch(Exception e)
	  		      {
	  			   System.out.print(e.getMessage());
	  			  }
	  		}

        WebElement dept = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
        Actions ac=new Actions(driver);
        ac.moveToElement(dept).sendKeys("ANAESTHESIA",Keys.ENTER).build().perform();
        
        
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-round btn-simple']/ancestor::div[@class='col-sm-12']/descendant::i[@class='zmdi zmdi-card-sd'][1]")).click();
        
       
        WebElement loghead = driver.findElement(By.xpath("//b[text()='sudarshan']"));
        Actions act1=new Actions(driver);
        act1.doubleClick(loghead).perform();
        driver.findElement(By.xpath("//i[@class='zmdi zmdi-power']")).click();
        
	}
	
}


