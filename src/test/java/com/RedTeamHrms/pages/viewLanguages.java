package com.RedTeamHrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class viewLanguages {
	
	@FindBy(id="btnAdd")
	public WebElement addLanguage;
	
	viewLanguages(){
		PageFactory.initElements(BaseClass, this);
	}
	
	

}
