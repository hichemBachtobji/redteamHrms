$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/langauge.feature");
formatter.feature({
  "name": "add Languages",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@US10"
    }
  ]
});
formatter.scenario({
  "name": "As an admin user should be able to add any availablelanguages to any employee",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@US10"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to login",
  "keyword": "Given "
});
formatter.match({
  "location": "com.RedTeamHrms.steps.addLanguageStep.user_should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to navigate to employee list",
  "keyword": "And "
});
formatter.match({
  "location": "com.RedTeamHrms.steps.addLanguageStep.user_should_be_able_to_navigate_to_employee_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to select \"11111\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.RedTeamHrms.steps.addLanguageStep.user_should_be_able_to_select_an_employee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Qualifications\" and hits add button",
  "keyword": "When "
});
formatter.match({
  "location": "com.RedTeamHrms.steps.addLanguageStep.user_navigates_to_qualifications_and_hits_add_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user specify \"langauge\" \"fluency\" \"competency\" and save then validate",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.RedTeamHrms.steps.addLanguageStep.user_specify_and_save(java.lang.String,java.lang.String,java.lang.String,io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "As an admin user should be able to add any availablelanguages to any employee");
formatter.after({
  "status": "passed"
});
});