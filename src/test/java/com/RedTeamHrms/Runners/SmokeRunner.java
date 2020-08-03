package com.RedTeamHrms.Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                 glue="com/RedTeamHrms/steps",
                 dryRun = true,
                 tags="@smoke",
                 monochrome=true,
                 strict=true,
                 plugin= {"pretty",
                		 "html:target/cucumebr-default-report",
                		 "jason:target/cucumber.json"
                 }
  	
		)


public class SmokeRunner {
	
	

}
