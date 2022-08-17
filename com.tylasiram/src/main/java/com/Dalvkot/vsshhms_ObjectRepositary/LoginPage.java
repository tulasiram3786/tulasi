package com.Dalvkot.vsshhms_ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@class='form-control p-0 show-tick']/ancestor::div[@class='content']/descendant::input[@placeholder='Enter Email Id']")
	private WebElement userNameText;

	@FindBy(xpath = "//select[@class='form-control p-0 show-tick']/ancestor::div[@class='content']/descendant::input[@placeholder='Password']")
	private WebElement passwordText;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-round btn-lg btn-block']")
	private WebElement submitButton;

	public WebElement getUserNameText() {
		return userNameText;
	}

	public WebElement getPasswordText() {
		return passwordText;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void loginToApplication(String username, String password) {
		userNameText.sendKeys(username);
		passwordText.sendKeys(password);
		submitButton.click();

	}

}
