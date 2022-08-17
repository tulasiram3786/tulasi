package com.Dalvkot.vsshhms_ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OPDRegistrationPage {
	public  OPDRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
