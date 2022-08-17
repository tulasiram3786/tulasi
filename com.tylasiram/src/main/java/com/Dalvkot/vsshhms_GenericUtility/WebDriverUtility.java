package com.Dalvkot.vsshhms_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Sudarshan palla
 *
 */
public class WebDriverUtility {

	/**
	 * wait for Element to load in DOM[HTML document]
	 * @param driver
	 */
	public void waitForElementToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	/**
	 * wait for the page to be load before Identifying element in DOM[HTML document]
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
	}
	
	/**
	 * it is used to wait for element to be clickable in GUI,& Check for specific element for every 500 milli seconds
	 * @param driver
	 * @param element
	 */
	public void waitForElementToBeClickable(WebDriver driver ,WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * used to wait for  element to be clickable in GUI ,&check for specific element for every 500 milli seconds
	 * @throws Throwable 
	 * 
	 */
	
	public  void waitForElementWithCustomTimeOut(WebDriver driver ,WebElement element,int pollingTime) throws Throwable
	{
		FluentWait wait=new FluentWait(driver);
		wait.pollingEvery(pollingTime,TimeUnit.SECONDS);
		wait.wait(20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/**
	 * it is used to handle the Dropdowns
	 * 
	 */
	public void selectByVisibleTextDropDown(WebElement element, String text)
	{
		
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	public void selectByIndex(WebElement element,int num)
	{
		Select sel=new Select(element);
		sel.selectByIndex(num);
	}
	
	/**
	 * it is used to handle the scroll down/up Handling
	 */
	
	public void scrollHandling(WebDriver driver,int value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,value)", "");
	}
	/**
	 * it is used to take the Screen Shot of the Faield Test Scripts
	 * @throws Throwable 
	 */
	
	public String takeScreenShot(WebDriver driver,String screenshotName) throws Throwable
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		String dateandtime=Calendar.getInstance().getTime().toString().replace(":", "_");
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/"+screenshotName+dateandtime+".PNG");
		FileUtils.copyFile(src,dest);
		return dest.getAbsolutePath();
		
	}
	
	/**
	 * it is used switch to window based on window title
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle)
	{
		Set<String>set=driver.getWindowHandles();
		Iterator<String>it=set.iterator();
		
		while(it.hasNext())
		{
			String wid = it.next();
			driver.switchTo().window(wid);
			String currentwindowTitle=driver.getTitle();
			if(currentwindowTitle.contains(currentwindowTitle))
			{
				break;
			}
		}
			
	}
	/**
	 * This method is used to mouse over actions
	 * @param driver
	 * @param element
	 */
	
	public void movetoElement(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void doubleClick(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void moveToElementWithPassValue(WebDriver driver,WebElement element,String department) {
	Actions act=new Actions(driver);
	act.moveToElement(element).sendKeys(department,Keys.ENTER).build().perform();
	}
	
	public void selectParticularElementByUsingJavaScript(WebDriver driver,WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
}
