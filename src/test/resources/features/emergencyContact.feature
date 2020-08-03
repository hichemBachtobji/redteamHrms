@US2
Feature: Emergency Contact

  Scenario: add employee's emergency contact
    Given user should be able to login
    And user should be able to navigate to employee list
    And user should be able to select "11111"
    When user navigates to "Emergency Contacts" then hits add button
    And user specifies Name Relationship Home Telephone Mobile and Work Telephone and hits save and validation
      | Name   | Relationship | Home Telephone | Mobile      | Work Telephone |
      | Syntax | school       |     5711098790 | 20212345678 |     3014009000 |
    
     
