package com.RedTeamHrms.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedTeamHrms.testbase.BaseClass;
import com.RedTeamHrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {

	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(id="menu_pim_viewPimModule")
	public WebElement PIM;
	
	@FindBy(id ="menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	@FindBy(xpath="//div[@class='menu']/ul/li")
	public List<WebElement> dashMenu;
	
	
	public DashboardPageElements() {
		//PageFactory.initElements(BaseClass.driver, this);
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToAddEmployee() {
		jsClick(PIM);
		jsClick(addEmp);
	}
	
	public void navigateToEmployeeList() {
		jsClick(PIM);
		jsClick(empListPage);
	}
	
	
}