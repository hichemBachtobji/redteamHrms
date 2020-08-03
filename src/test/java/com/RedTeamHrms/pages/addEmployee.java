package com.RedTeamHrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RedTeamHrms.testbase.BaseClass;
import com.RedTeamHrms.utils.CommonMethods;

public class addEmployee  extends CommonMethods {
	
	@FindBy(id="firstName")
	public WebElement empName;
	
	@FindBy(id ="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement empId;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="photofile")
	public WebElement photo;
	
	@FindBy(id="profile-pic")
	public WebElement profilePic;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id= "user_password")
	public WebElement userPwd;
	
	@FindBy(id="re_password")
	public WebElement rePwd;
	
	@FindBy(id="status")
	public WebElement status;
	
	@FindBy(xpath="//span[@for='firstName']")
	public WebElement reqFname;
	
	@FindBy(xpath="//span[@for='lastName']")
	public WebElement reqLname;
	
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement createLoginBtn;
	
	@FindBy(id="middleName")
	public WebElement middlename;
	
	public addEmployee(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void addEmpInfo() {
		sendText(empName, "Hichem1");
		sendText(lastName, "Bachtobji1");
		//sendText(empId, "7919");
		String photoPath="C:\\Users\\bacht\\OneDrive\\Pictures";
		sendText(photo, photoPath);
		
	}
	
	public void createLoginCr(String uName,String password ) {
		//createLoginBtn.click();
		sendText(username,uName);
		sendText(userPwd, password);
		sendText(rePwd, password);
		//selectDdValue(status, "Enabled");
//		Select select= new Select(status);
//		select.selectByVisibleText("Enabled");
		
		//jsClick(saveBtn);
		saveBtn.click();
		
	}
	

}
