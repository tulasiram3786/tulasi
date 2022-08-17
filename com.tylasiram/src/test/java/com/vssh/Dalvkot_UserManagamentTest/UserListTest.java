package com.vssh.Dalvkot_UserManagamentTest;

import org.testng.annotations.Test;

import com.Dalvkot.vsshhms_GenericUtility.BaseClass;
import com.Dalvkot.vsshhms_ObjectRepositary.HomePage;
import com.Dalvkot.vsshhms_ObjectRepositary.UserListPage;

public class UserListTest extends BaseClass {
	
	@Test
	public void userList() throws Throwable {
  
		String firstname = eutil.getDataFromTheExcel("Sheet4", 1, 1);
		String lastname = eutil.getDataFromTheExcel("Sheet4", 1, 2);
		String employeeid = eutil.getDataFromTheExcel("Sheet4", 1, 3);
		String mobilenumber = eutil.getDataFromTheExcel("Sheet4", 1, 4);
		String pincode = eutil.getDataFromTheExcel("Sheet4", 1, 5);
		String department = eutil.getDataFromTheExcel("Sheet4", 1, 6);
		String usertype = eutil.getDataFromTheExcel("Sheet4", 1, 7);
		String roletype = eutil.getDataFromTheExcel("Sheet4", 1, 8);
		String role = eutil.getDataFromTheExcel("Sheet4", 1, 9);
		String email = eutil.getDataFromTheExcel("Sheet4", 1, 10);

		HomePage hp = new HomePage(driver);
		hp.homeBtn(driver);
		hp.userListButton(driver);
		UserListPage ulp = new UserListPage(driver);
		ulp.addButton();
		ulp.userListfirtNameTextField(firstname);
		ulp.userListlastNameTextField(lastname);
		ulp.userListemployeeId(employeeid);
		ulp.userListEmailTextField(email);
		ulp.userListmobileNumberTextFiled(mobilenumber);
		ulp.userListpincodeTextFiled(pincode);
		ulp.userListDepartDropDown(driver, department);
		ulp.userListuserTypeDropDown(driver, usertype);
        ulp.userListRoleTypeDropDownLogic(driver, roletype);
		ulp.userListRoleDropDownLogic(driver, role);
		ulp.userListSubmitButton(driver);
		
	}
}


