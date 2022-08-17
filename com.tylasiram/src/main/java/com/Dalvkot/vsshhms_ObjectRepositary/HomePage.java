package com.Dalvkot.vsshhms_ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dalvkot.vsshhms_GenericUtility.WebDriverUtility;



public class HomePage extends WebDriverUtility {
	
	// intilization f the WebElements
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title='Events']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::a[@class='ls-toggle-btn']")
	private WebElement homeButton;

	@FindBy(xpath = "//a[text()=' Appointment Booking ']")
	private WebElement appointmentButton;

	@FindBy(css = "b[text()='SUDH']")
	private WebElement logoutName;

	@FindBy(xpath = "//i[@class='zmdi zmdi-power']")
	private WebElement logoutBtn;

	@FindBy(xpath = "//a[text()=' Patient Admission ']")
	private WebElement patientAdmissionbtn;

	// userList
	@FindBy(xpath = "//a[text()=' User List ']")
	private WebElement userListBtn;

	// apoointmnetlogout
	@FindBy(xpath = "//img[@style='max-width: 40px;']")
	private WebElement applogout;

	@FindBy(xpath = "//i[@class='zmdi zmdi-power']")
	private WebElement logoutapp;

	public WebElement getLogoutapp() {
		return logoutapp;
	}

	public WebElement getApplogout() {
		return applogout;
	}

	public WebElement getPatientAdmissionbtn() {
		return patientAdmissionbtn;
	}

	public WebElement gethomeButton() {
		return homeButton;
	}

	public WebElement getUserListBtn() {
		return userListBtn;
	}

	public WebElement getAppointmentButton() {
		return appointmentButton;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	public WebElement getLagoutName() {
		return logoutName;
	}

	// Business Logic

	public void appointmentBtn() {
		appointmentButton.click();
	}

	public void logoutBtnClick(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//b[text()='SUDH']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		// driver.findElement(By.cssSelector(""))

		logoutBtn.click();
	}

	public void homeBtn(WebDriver driver) {

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
	}

	// patient Admission button
	public void patientAdmissionBtn() {
		patientAdmissionbtn.click();
	}

	// Business Logic for Userlistbutton
	public void userListButton(WebDriver driver) {
		selectParticularElementByUsingJavaScript(driver, userListBtn);
	}

}
