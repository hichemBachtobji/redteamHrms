package com.RedTeamHrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.RedTeamHrms.testbase.BaseClass;

public class viewLanguages {
	
	@FindBy(id="addLanguage")
	public WebElement addLanguage;
	
	@FindBy(xpath="//ul[@id='sidenav']/li")
	public WebElement sideNavigation;
	
	@FindBy(xpath="//ul[@id='sidenav']/li[10]")
	public WebElement qualificationbtn;
	
	@FindBy(id="language_code")
	public WebElement selectLang;
	
	@FindBy(id="language_lang_type")
	public WebElement selectFluency;
	
	@FindBy(id="language_competency")
	public WebElement selectCompetency;
	
	@FindBy(id="btnLanguageSave")
	public WebElement savebtn;
	
	@FindBy(xpath="//table[@id='lang_data_table']/tbody/tr")
	public List<WebElement> resultTable;
	
	
	
	public viewLanguages(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
//	public void qualifications(String qualification) {
//		for (WebElement nav : sideNavigation) {
//			String qualif=nav.getText();
//			if(qualif.equals(qualification)) {
//				nav.click();
//			}	
//		}
//	}
	
	public void selectLang(String lang) {
		Select select= new Select(selectLang);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			String opt=option.getText();
			if(opt.equals(lang)) {
				option.click();
			}
		}
	}
	
	public void selectFluency(String fluency) {
		Select select= new Select(selectFluency);
		List<WebElement> options =select.getOptions();
		for(WebElement option:options) {
			String flue = option.getText();
			if(flue.equals(fluency)) {
				option.click();
			}
		}	
	}
	
	public void selectCompetency(String competency) {
		Select select= new Select(selectCompetency);
		List<WebElement> options =select.getOptions();
		for(WebElement option:options) {
			String comp = option.getText();
			if(comp.equals(competency)) {
				option.click();
			}
		}	
	}
	
	public void seeTable(String language, String fluency, String competency) {
		for (WebElement webElement : resultTable) {
			String resultText= webElement.getText();		
	}
	
}
}
