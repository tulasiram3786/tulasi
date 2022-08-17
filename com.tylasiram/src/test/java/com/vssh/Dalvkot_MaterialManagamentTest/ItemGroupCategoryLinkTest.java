package com.vssh.Dalvkot_MaterialManagamentTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItemGroupCategoryLinkTest {
	
	public static void main(String[] args) {
		

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
		
		
		WebElement webElement = driver.findElement(By.xpath("//a[text()=' Item Group Category Link ']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", webElement);
		
		//Account store Drop Down
	    driver.findElement(By.xpath("//table/tbody/tr/td[2]/descendant::span[@class='select2-selection__arrow']")).click();
		WebElement accountStoreText = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions act=new Actions(driver);
		act.moveToElement(accountStoreText).sendKeys("DALVKOT",Keys.ENTER).build().perform();
		
		//Item Group dropdown
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/descendant::span[@class='select2-selection__arrow']")).click();
		WebElement itemgroup = driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		Actions item=new Actions(driver);
		item.moveToElement(itemgroup).sendKeys("CTVS",Keys.ENTER).build().perform();
		
		
		//Item category dropdown
		WebElement itemCategory = driver.findElement(By.xpath("//table/tbody/tr/td[4]/descendant::select[@class='select2-hidden-accessible']"));
		Select icategory=new Select(itemCategory);
		icategory.selectByIndex(3);
		//Active Status
		driver.findElement(By.xpath("//table/tbody/tr/td[6]/descendant::span[@class='switchs-label']")).click();
		//'+'Action button
		driver.findElement(By.xpath("//table/tbody/tr/td[7]/descendant::button[@class='btn btn-primary btn-circle btn-sm']")).click();
		

		
		
		}

}
