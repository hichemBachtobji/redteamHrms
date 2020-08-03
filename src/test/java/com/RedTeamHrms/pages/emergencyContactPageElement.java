package com.RedTeamHrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedTeamHrms.testbase.BaseClass;

public class emergencyContactPageElement {
	
	@FindBy(id="btnAddContact")
	public WebElement addBtn;
	
	@FindBy(id="emgcontacts_name")
	public WebElement emgContName;
	
	@FindBy(id="emgcontacts_relationship")
	public WebElement emgContRelationship;
	
	@FindBy(id="emgcontacts_homePhone")
	public WebElement emgContHomePhone;
	
	@FindBy(id="emgcontacts_mobilePhone")
	public WebElement emgContMobile;
	
	@FindBy(id="emgcontacts_workPhone")
	public WebElement emgContWorkPhone;
	
	@FindBy(id="btnSaveEContact")
	public WebElement emgContSaveBtn;
	
	@FindBy(xpath="//ul[@id='sidenav']/li[3]/a")
	public WebElement emergencyCont;
	
	@FindBy(xpath="//table[@id='emgcontact_list']/tbody/tr")
	public List<WebElement> resultTable;
	
	@FindBy(xpath="//table[@id='emgcontact_list']/tbody/tr/td[2]")
	public List<WebElement> resultTableName;
	
	
	public emergencyContactPageElement(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}
