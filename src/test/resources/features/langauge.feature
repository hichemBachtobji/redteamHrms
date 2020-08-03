#Author: RedTeam
@US10
Feature: add Languages

  Scenario: As an admin user should be able to add any availablelanguages to any employee
    Given user should be able to login
    And user should be able to navigate to employee list
    And user should be able to select "11111"
    When user navigates to "Qualifications" and hits add button
    And user specify "langauge" "fluency" "competency" and save then validate
      | langauge | fluency  | competency    |
      | Arabic   | Writing  | Mother Tongue |
      | English  | Speaking | Good          |
      | Farsi   | Reading  | Basic         |
    
