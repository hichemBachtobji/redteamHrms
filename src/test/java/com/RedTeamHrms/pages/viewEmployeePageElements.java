package com.RedTeamHrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RedTeamHrms.testbase.BaseClass;

public class viewEmployeePageElements {

	@FindBy(xpath = "//input[@id='empsearch_id']")
	public WebElement empID;

	@FindBy(xpath = "//input[@id='searchBtn']")
	public WebElement searchBtn;

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td[3]/a")
	public List<WebElement> table;

	public viewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public void anyEmployee(String empName) {
		for (int i=1;i<table.size();i++) {
			String text = table.get(i-1).getText();
			if(text.equals(empName)) {
			table.get(i-1).click();
				break;
			}
		}

	}
	
//	public void anyEmployee(String empName) {
//		table.
//	}

}
