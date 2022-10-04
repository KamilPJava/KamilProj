package com.oib.lib;
import org.openqa.selenium.WebDriver;

public class GlobalData {
	//Rules-To maintain all the
	//TestData & objects related to whole application
	public  WebDriver driver;
	//********TestData
	public String url = "http://127.0.0.1/orangehrm-2.6/login.php";
	public String loginname = "admin";
	public String password = "admin";
	public String FirstName="Mahesh";
	public String LastName="Babu";
	

	//********Objects
	public String textbox_login_name = "txtUserName";
	public String txtbox_password_name= "txtPassword";
	public String button_login_name  = "Submit";
	public String  link_logout_linktext= "Logout";
	public String AddName="rightMenu";
	public String Last_Name="txtEmpLastName";
	public String First_Name="txtEmpFirstName";
	public String SaveButton="savebutton";


}
