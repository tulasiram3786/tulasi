package com.Dalvkot.vsshhms_ObjectRepositary;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.vsshhms_GenericUtility.WebDriverUtility;

public class UserListPage extends WebDriverUtility {
	public UserListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// user list page '+'Add Button
	@FindBy(xpath = "//a[@class='btn btn-white btn-round']")
	private WebElement addbtn;

	// User List First Name
	@FindBy(xpath = "//input[@id='FirstName']")
	private WebElement firstNameText;

	// Last Name
	@FindBy(xpath = "//input[@id='SecondName']")
	private WebElement lastName;

	// Employee id
	@FindBy(xpath = "//input[@placeholder='Employee Id']")
	private WebElement employeeIdText;

	// email
	@FindBy(id = "Email")
	private WebElement userListEmailText;

	// Mobile Number
	@FindBy(xpath = "//input[@id='MobileNumber']")
	private WebElement mobilenumText;

	// pincode
	@FindBy(xpath = "//input[@id='PinCode']")
	private WebElement pincodeText;

	// Department drpdown
	@FindBy(xpath = "//label[text()='Department ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement userListDepartmentDropDownBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement userListDepartmentDropDownText;

	// userType dropdown
	@FindBy(xpath = "//label[text()='User Type ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement userListuserTypeDropdownBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement userListuserTypeDropdownText;

	// RoleType Drop Down
	@FindBy(xpath = "//label[text()='Role Type ']/parent::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement userListRoleTypeDropdownBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement userListRoleTypeDropdownText;

	// RoleDropdown
	@FindBy(xpath = "//label[text()='Role ']/ancestor::div[@class='form-group col-lg-3 col-xl-3 col-sm-4 col-md-4 col-xs-12']/descendant::span[@class='select2-selection__arrow']")
	private WebElement userListRoleDropdownBtn;

	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement userListRoleDropdownText;

	// submit button
	@FindBy(xpath = "//button[@class='btn btn-default btn-round btn-simple']/ancestor::div[@class='col-xl-12 col-lg-12 col-sm-12 col-md-12 col-xs-12 text-right']/descendant::button[@class='btn btn-primary btn-round']")
	private WebElement submitBtn;

	@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
	private WebElement popOkBtn;
	
	public WebElement getPopOkBtn() {
		return popOkBtn;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getFirstNameText() {
		return firstNameText;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmployeeIdText() {
		return employeeIdText;
	}

	public WebElement getEmailtext() {
		return userListEmailText;
	}

	public WebElement getMobilenumText() {
		return mobilenumText;
	}

	public WebElement getPincodeText() {
		return pincodeText;
	}

	public WebElement getUserListDepartDropDownBtn() {
		return userListDepartmentDropDownBtn;
	}

	public WebElement getUserListDepartmentDropDownText() {
		return userListDepartmentDropDownText;
	}

	public WebElement getUserListuserTypeDropdownBtn() {
		return userListuserTypeDropdownBtn;
	}

	public WebElement getUserListuserTypeDropdownText() {
		return userListuserTypeDropdownText;
	}

	public WebElement getUserListRoleTypeDropdownBtn() {
		return userListRoleTypeDropdownBtn;
	}

	public WebElement getUserListRoleTypeDropdownText() {
		return userListRoleTypeDropdownText;
	}

	public WebElement getUserListRoleDropdownBtn() {
		return userListRoleDropdownBtn;
	}

	public WebElement getUserListRoleDropdownText() {
		return userListRoleDropdownText;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	// Business Logics
	// '+'Add
	public void addButton() {
		addbtn.click();
	}

	// first Name
	public void userListfirtNameTextField(String firstname) {
		firstNameText.sendKeys(firstname);
	}

	// Last Name
	public void userListlastNameTextField(String lastname) {
		lastName.sendKeys(lastname);
	}

	// employee code
	public void userListemployeeId(String employeeid) {
		employeeIdText.sendKeys(employeeid);
	}

	// mobile number
	public void userListmobileNumberTextFiled(String mobilenumber) {
		mobilenumText.sendKeys(mobilenumber);
	}

	// pincode
	public void userListpincodeTextFiled(String pincode) {
		pincodeText.sendKeys(pincode);
	}

	// Email
	public void userListEmailTextField(String email) {
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		userListEmailText.sendKeys(randomInt + email);
	}

	// department dropdown
	public void userListDepartDropDown(WebDriver driver, String department) {
		userListDepartmentDropDownBtn.click();
		moveToElementWithPassValue(driver, userListDepartmentDropDownText, department);
	}

	// usertypedropdown
	public void userListuserTypeDropDown(WebDriver driver, String usertype) {
		userListuserTypeDropdownBtn.click();
		moveToElementWithPassValue(driver, userListuserTypeDropdownText, usertype);
	}

	// RoleType drop down
	public void userListRoleTypeDropDownLogic(WebDriver driver, String roletype) throws Throwable {
		userListRoleTypeDropdownBtn.click();
		moveToElementWithPassValue(driver, userListRoleTypeDropdownText, roletype);
		Thread.sleep(1000);
	}

	// roledropdown
	public void userListRoleDropDownLogic(WebDriver driver, String role) throws Throwable {
		userListRoleDropdownBtn.click();
		moveToElementWithPassValue(driver, userListRoleDropdownText, role);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,450)", "");
	}

	// SubmitBtn
	public void userListSubmitButton(WebDriver driver) {
		submitBtn.click();
		popOkBtn.click();
	}
}
