package com.vssh.Dalvkot_AppointmentBookingTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Dalvkot.vsshhms_GenericUtility.BaseClass;
import com.Dalvkot.vsshhms_ObjectRepositary.AppointmentBookingPage;
import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;
@Listeners(com.Dalvkot.vsshhms_GenericUtility.ListenerImp.class)
public class ApponitmentBookingTest extends BaseClass{
	

	// TC-1-Click on Cancel button After Filling All mandatory fields
	@Test(priority = 0)
	public void clickoncancelAfterFillingAllTheManadatoryFieldsTest() throws Throwable {

		String telephonic = eutil.getDataFromTheExcel("Sheet3", 1, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 1, 2);	
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 1, 3);	
		String name = eutil.getDataFromTheExcel("Sheet3", 1, 4);	
		String gender = eutil.getDataFromTheExcel("Sheet3", 1, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 1, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 1, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 1, 7);
		String department = eutil.getDataFromTheExcel("Sheet3", 1, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 1, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();

		AppointmentBookingPage ap = new AppointmentBookingPage(driver);
		ap.appointdropdown(telephonic);
		ap.bookingdate(bookingdate);
		ap.bookingTime(bookingtime);
		ap.namefield(name);
		ap.genderField(gender);
		ap.dateOfBirthField(dateofbirth);
		ap.phonenumberField(phonenumber);
		ap.emailField(email);
		ap.departmentdrop(driver, department);
		ap.doctordertment(driver, doctorname);
		ap.appCancelButton();
		Thread.sleep(2000);

	}
	
	
	// TC-2 Without Entering Anything/Any mandatory fields Click on Cancel
	@Test(priority = 1)
	public void withoutEnteringAnythingClickOnCancelTest() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();
		AppointmentBookingPage ap = new AppointmentBookingPage(driver);
		ap.appCancelButton();
		Thread.sleep(1000);
	}

	// TC-4 Select less than the current date in calender widget as 'Booking Date' //A-p  M-p
	@Test(priority = 2)
	public void selectLessThanCurrentDateInCalenderTest() throws Throwable {
		String telephonic = eutil.getDataFromTheExcel("Sheet3", 2, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 2, 2);
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 2, 3);
		String name = eutil.getDataFromTheExcel("Sheet3", 2, 4);
		String gender = eutil.getDataFromTheExcel("Sheet3", 2, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 2, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 2, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 2, 8);
		String department = eutil.getDataFromTheExcel("Sheet3", 2, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 2, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();
		
		AppointmentBookingPage ap = new AppointmentBookingPage(driver);
		ap.appointdropdown(telephonic);
		ap.bookingdate(bookingdate);
		ap.bookingTime(bookingtime);
		ap.namefield(name);
		ap.genderField(gender);
		//ap.dateOfBirthField(dateofbirth);
		ap.phonenumberField(phonenumber);
		ap.emailField(email);
		ap.departmentdrop(driver, department);
		ap.doctordertment(driver, doctorname);
		ap.AppbookingBtn();
		String patientName = ap.listExistedName();
		Assert.assertEquals(patientName, name);
		System.out.println("Appointment Booking done Successfully");
		}

	// TC-5 Select less than  current Time in 'Booking Time Field' M-p  A-p
	@Test(priority=3)
	public void selectLessThanCurrentTimeInBookingTimeTest() throws Throwable {
		String telephonic = eutil.getDataFromTheExcel("Sheet3", 3, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 3, 2);
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 3, 3);
		String name = eutil.getDataFromTheExcel("Sheet3", 3, 4);
		String gender = eutil.getDataFromTheExcel("Sheet3", 3, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 3, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 3, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 3, 8);
		String department = eutil.getDataFromTheExcel("Sheet3", 3, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 3, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();

		AppointmentBookingPage ap = new AppointmentBookingPage(driver);
		ap.appointdropdown(telephonic);
		ap.bookingdate(bookingdate);
		ap.bookingTime(bookingtime);
		ap.namefield(name);
		ap.genderField(gender);
		ap.dateOfBirthField(dateofbirth);
		ap.phonenumberField(phonenumber);
		ap.emailField(email);
		ap.departmentdrop(driver, department);
		ap.doctordertment(driver, doctorname);
		ap.AppbookingBtn();
		String patientName = ap.listExistedName();
		Assert.assertEquals(patientName, name);
		System.out.println("Appointment Booking done Successfully");

	}

    	
	// TC-6 Select More than the current date in calender widget as 'DATE OF BIRTH '
	@Test(priority=4)
	public void selectMoreThanCurrentDateInCalenderTest() throws Throwable {
		String telephonic = eutil.getDataFromTheExcel("Sheet3", 4, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 4, 2);
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 4, 3);
		String name = eutil.getDataFromTheExcel("Sheet3", 4, 4);
		String gender = eutil.getDataFromTheExcel("Sheet3", 4, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 4, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 4, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 4, 8);
		String department = eutil.getDataFromTheExcel("Sheet3", 4, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 4, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();

		AppointmentBookingPage ap = new AppointmentBookingPage(driver);

		ap.appointdropdown(telephonic);
		ap.bookingdate(bookingdate);
		ap.bookingTime(bookingtime);
		ap.namefield(name);
		ap.genderField(gender);
		ap.dateOfBirthField(dateofbirth);
		Thread.sleep(2000);
		ap.phonenumberField(phonenumber);
		ap.emailField(email);
		ap.departmentdrop(driver, department);
		ap.doctordertment(driver, doctorname);
		ap.AppbookingBtn();

	}
	
	
	// TC-7 Click on the Booking time to Update/Change the current Time.
	@Test(priority=5)
	public void clickOnBookingTimeToUpadteChangeTheCurrentTimeTest() throws Throwable {
		String telephonic = eutil.getDataFromTheExcel("Sheet3", 5, 1);
		String bookingdate = eutil.getDataFromTheExcel("Sheet3", 5, 2);
		String bookingtime = eutil.getDataFromTheExcel("Sheet3", 5, 3);
		String bookingtime1 = eutil.getDataFromTheExcel("Sheet3", 6, 3);
		String name = eutil.getDataFromTheExcel("Sheet3", 5, 4);
		String gender = eutil.getDataFromTheExcel("Sheet3", 5, 5);
		String dateofbirth = eutil.getDataFromTheExcel("Sheet3", 5, 6);
		String phonenumber = eutil.getDataFromTheExcel("Sheet3", 5, 7);
		String email = eutil.getDataFromTheExcel("Sheet3", 5, 8);
		String department = eutil.getDataFromTheExcel("Sheet3", 5, 9);
		String doctorname = eutil.getDataFromTheExcel("Sheet3", 5, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.appointmentBtn();

		AppointmentBookingPage ap = new AppointmentBookingPage(driver);

		ap.appointdropdown(telephonic);
		ap.bookingdate(bookingdate);
		ap.bookingTime(bookingtime);
		ap.updatebookingtime();
		ap.bookingTime(bookingtime1);
		ap.namefield(name);
		ap.genderField(gender);
		ap.dateOfBirthField(dateofbirth);
		Thread.sleep(2000);
		ap.phonenumberField(phonenumber);
		ap.emailField(email);
		ap.departmentdrop(driver, department);
		ap.doctordertment(driver, doctorname);
		ap.AppbookingBtn();
	String patientName = ap.listExistedName();
	Assert.assertEquals(patientName, name);
	System.out.println("Appointment Booking done Successfully");
	}

//		// TC-3 Without Entering any mandatory field's Click on Submit
//		@Test(priority=6)
//		public void withoutEnteringAnythingClickOnSubmitTest() throws Throwable {
	//
//			HomePage hp = new HomePage(driver);
//			hp.homeBtn(driver);
//			hp.appointmentBtn();
//			AppointmentBookingPage ap = new AppointmentBookingPage(driver);
//			ap.AppbookingBtn();
//			WebElement e = driver.findElement(By.xpath("//div[@class='ng-tns-c44-6 ng-star-inserted ng-trigger ng-trigger-flyInOut ngx-toastr toast-error']"));
//			Actions act=new Actions(driver);
//			act.doubleClick(e).perform();
//			
//		}

	}

