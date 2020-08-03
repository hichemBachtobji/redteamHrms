package com.RedTeamHrms.testbase;

import com.RedTeamHrms.pages.DashboardPageElements;
import com.RedTeamHrms.pages.LoginPageElements;
import com.RedTeamHrms.pages.PersonalDetailsPageElements;
import com.RedTeamHrms.pages.addEmployee;
import com.RedTeamHrms.pages.emergencyContactPageElement;
import com.RedTeamHrms.pages.viewEmployeePageElements;
import com.RedTeamHrms.pages.viewLanguages;

public class pageInitializer extends BaseClass {

	public static addEmployee addEmp;
	public static DashboardPageElements dash;
	public static LoginPageElements login;
	public static PersonalDetailsPageElements pdetails;
	public static viewEmployeePageElements viewEmp;
	public static viewLanguages viewLang;
	public static emergencyContactPageElement emContact;
	
	public static void initialize() {
		
		addEmp=new addEmployee();
		dash= new DashboardPageElements();
		login=new LoginPageElements();
		pdetails= new PersonalDetailsPageElements();
		viewEmp= new viewEmployeePageElements();
		viewLang= new viewLanguages();
		emContact= new emergencyContactPageElement();
		
	}
	
}
