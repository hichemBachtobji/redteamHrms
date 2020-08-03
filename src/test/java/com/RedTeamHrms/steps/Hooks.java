package com.RedTeamHrms.steps;

import com.RedTeamHrms.testbase.BaseClass;
import com.RedTeamHrms.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	
	@After
	public void end(Scenario scenario) {
		
		byte[] pic;
		if(scenario.isFailed()) {
			pic=CommonMethods.TakesScreenshot("failed/"+scenario.getName());
		}else {
			pic=CommonMethods.TakesScreenshot("passed/"+scenario.getName());
		}
		
		scenario.attach(pic, "image/png", scenario.getName());
		
		BaseClass.tearDown();
	}

}
