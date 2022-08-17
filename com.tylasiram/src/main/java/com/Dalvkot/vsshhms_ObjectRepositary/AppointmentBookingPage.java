package com.Dalvkot.vsshhms_ObjectRepositary;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Dalvkot.vsshhms_GenericUtility.WebDriverUtility;

public class AppointmentBookingPage extends WebDriverUtility
{

	public AppointmentBookingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// Appointment BookNow Button
	@FindBy(xpath = "//button[@class='btn btn-primary btn-round btn-simple']/ancestor::div[@class='col-lg-12 text-right']/descendant::button[@class='btn btn-primary btn-round']")
	private WebElement appointmentBookNowButton;

	// Appointment Cancel Button
	@FindBy(xpath = "//button[@class='btn btn-primary btn-round btn-simple']")
	private WebElement cancelBtn;

	@FindBy(xpath = "//label[text()='Appointment Type ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement appointmentType;

	@FindBy(xpath = "//label[text()='Booking Date ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input")
	private WebElement bookingdate;

	@FindBy(xpath = "//label[text()='Booking Time ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::input")
	private WebElement bookingtime;

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement nameField;

	@FindBy(xpath = "//label[text()='Gender']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::select[@class='select2-hidden-accessible']")
	private WebElement genderdrop;

	@FindBy(xpath = "//input[@formcontrolname='dateOfBirth']")
	private WebElement dateOfBirth;

	@FindBy(xpath = "//input[@formcontrolname='phoneNo']")
	private WebElement phonenumber;

	@FindBy(xpath = "//input[@placeholder='Email Id']")
	private WebElement email;

	@FindBy(xpath = "//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement depatmentdropdownBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement deptDropDownText;

	@FindBy(xpath = "//label[text()=' Doctor Name ']/ancestor::div[@class='form-group col-lg-3 col-md-3 col-xl-3 col-sm-3 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement doctordropdownbtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement doctordropdowntext;

	// Appointment booking Popup "OK"button
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement appointmentBookingPopup;

	@FindBy(xpath = "//b[text()='SUDH']")
	private WebElement logoutappoint;
	
	//Appointment List\
	@FindBy(xpath="//table[@class='table table-responsive-md table-striped row-border hover']/tbody/tr[1]/td[5]")
	private WebElement listExistingName;
	
	
	public WebElement getListExistingName() {
		return listExistingName;
	}

	public WebElement getDoctordropdownbtn() {
		return doctordropdownbtn;
	}

	public WebElement getDoctordropdowntext() {
		return doctordropdowntext;
	}

	public WebElement getLogoutappoint() {
		return logoutappoint;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getDepatmentdropdownBtn() {
		return depatmentdropdownBtn;
	}

	public WebElement getDeptDropDownText() {
		return deptDropDownText;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhonenumber() {
		return phonenumber;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getGender() {
		return genderdrop;
	}

	public WebElement getName() {
		return nameField;
	}

	public WebElement getBookingTime() {
		return bookingtime;
	}

	public WebElement getBookingdate() {
		return bookingdate;
	}

	public WebElement getAppointmentType() {
		return appointmentType;
	}

	public WebElement getAppointmentBookNowButton() {
		return appointmentBookNowButton;
	}

	public void appointBookNow() {
		appointmentBookNowButton.click();
	}

	public void appointdropdown(String telephonic) {
		selectByVisibleTextDropDown(appointmentType, telephonic);
	}

	// booking date
	public void bookingdate(String text) {
		bookingdate.sendKeys(text);
	}

	// booking time
	public void bookingTime(String text) {
		bookingtime.click();
		bookingtime.sendKeys(text);

	}

	// Name\
	public void namefield(String name) {
		nameField.sendKeys(name);
	}

	// gender
	public void genderField(String gender) {
		selectByVisibleTextDropDown(genderdrop, gender);

	}

	// date of birth
	public void dateOfBirthField(String text) {
		// dateOfBirth.click();
		dateOfBirth.sendKeys(text);
	}

	// phoneNumber
	public void phonenumberField(String text) {
		phonenumber.sendKeys(text);
	}

	// email
	public void emailField(String mail) {
		email.sendKeys(mail);
	}

	// department dropdown
	public void departmentdrop(WebDriver driver, String department) {
		depatmentdropdownBtn.click();
		moveToElementWithPassValue(driver, deptDropDownText, department);
	}

	// doctor depart\
	public void doctordertment(WebDriver driver, String doctor) {
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

		moveToElementWithPassValue(driver, doctordropdowntext, doctor);
	}

	// cancel
	public void appCancelButton() {
		cancelBtn.click();
	}

	public void AppbookingBtn() {
		appointmentBookNowButton.click();
		appointmentBookingPopup.click();
	}

	public void logoutappDouble(WebDriver driver) {
		doubleClick(driver, logoutappoint);
	}

	public void updatebookingtime() {
		bookingtime.clear();
	}
	
	//list name 
	public String listExistedName() {
		String patientName = listExistingName.getText();
			return patientName;
		}
	}


