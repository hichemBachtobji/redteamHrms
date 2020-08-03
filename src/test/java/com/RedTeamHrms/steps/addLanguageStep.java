package com.RedTeamHrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.RedTeamHrms.pages.viewLanguages;
import com.RedTeamHrms.utils.CommonMethods;
import com.RedTeamHrms.utils.configsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addLanguageStep extends CommonMethods {

	@Given("user should be able to login")
	public void user_should_be_able_to_login() {
		login.login(configsReader.getProperty("userName"), configsReader.getProperty("password"));
	}

	@Given("user should be able to navigate to employee list")
	public void user_should_be_able_to_navigate_to_employee_list() {
		dash.navigateToEmployeeList();
	}

	@Given("user should be able to select {string}")
	public void user_should_be_able_to_select_an_employee(String empname) {
		viewEmp.anyEmployee(empname);
	}

	@When("user navigates to {string} and hits add button")
	public void user_navigates_to_qualifications_and_hits_add_button(String qualif) {
		// viewLang.qualifications(qualif);
		driver.manage().window().fullscreen();
		scrollDown(250);
		// selectDdValue(viewLang.sideNavigation, qualif);
		click(viewLang.qualificationbtn);
		click(viewLang.addLanguage);
	}

	@When("user specify {string} {string} {string} and save then validate")
	public void user_specify_and_save(String Language, String Fluency, String Competency, DataTable dataTable) {
		List<Map<String, String>> langauges = dataTable.asMaps();
		for (Map<String, String> lang : langauges) {
//		viewLang.selectLang(lang.get(Language));
//		viewLang.selectFluency(lang.get(Fluency));
//		viewLang.selectCompetency(lang.get(Competency));
			wait(2);
			selectDdValue(viewLang.selectLang, lang.get(Language));
			selectDdValue(viewLang.selectFluency, lang.get(Fluency));
			selectDdValue(viewLang.selectCompetency, lang.get(Competency));

			click(viewLang.savebtn);
			click(viewLang.addLanguage);
			
			for(WebElement el:viewLang.resultTable) {
				String table=el.getText();
				if(el.equals(lang.get(Language)+" "+lang.get(Fluency)+" "+lang.get(Competency))) {
					Assert.assertEquals(table, lang.get(Language)+" "+lang.get(Fluency)+" "+lang.get(Competency));
				}
			}
		}
	}

//	@Then("{string} {string} {string} is displayed then validate")
//	public void is_displayed(String lang, String flu, String comp, DataTable dataTable) {
//		
//		for (WebElement webElement : viewLang.resultTable) {
//			String resultText= webElement.getText();    
//			System.out.println("result text = "+resultText);
////			if(resultText.equals(lang+" "+flu+" "+comp)) {
////				Assert.assertEquals(resultText, lang+" "+flu+" "+comp);
////			}
//	}
//		List<Map<String, String>> resultTable = dataTable.asMaps();
//		for (Map<String, String> map : resultTable) {
//			String expectedResult = map.get(lang) + " " + map.get(flu) + " " + map.get(comp);
//			System.out.println("expected text = " + expectedResult);
//		//TakesScreenshot(expectedResult);	
//		}

		

	}


