package com.RedTeamHrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.RedTeamHrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class emergencyContactSteps extends CommonMethods{
	
	@When("user navigates to {string} then hits add button")
	public void user_navigates_to_then_hits_add_button(String string) {
	   click(emContact.emergencyCont);
	   click(emContact.addBtn);
	}

	@When("user specifies Name Relationship Home Telephone Mobile and Work Telephone and hits save and validation")
	public void user_specifies_and_and_hits_save( DataTable dataTable) {
	List<Map<String, String>> maps = dataTable.asMaps();
	 for (Map<String, String> map : maps) {
		 
		 sendText(emContact.emgContName, map.get("Name"));
		 sendText(emContact.emgContRelationship, map.get("Relationship"));
		 sendText(emContact.emgContHomePhone, map.get("Home Telephone"));
		 sendText(emContact.emgContMobile, map.get("Mobile"));
		 sendText(emContact.emgContWorkPhone, map.get("Work Telephone"));
		 click(emContact.emgContSaveBtn);
		 
		 String expectedRslt= map.get("Name");
		 
		for(WebElement el:emContact.resultTableName) {
			String name=el.getText();
			if(name.equals(map.get("Name"))) {
				Assert.assertEquals(expectedRslt, name);
			}
		}
		 
		 
		
	}
	  
	}

	


}
