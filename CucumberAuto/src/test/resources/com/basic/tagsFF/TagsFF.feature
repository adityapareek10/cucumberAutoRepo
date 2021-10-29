@Important
Feature: Create account of facebook12
  As a user you need to open facebook home page and do the validation

  @Smoke
  Scenario: Validate First Name field121
    Given User need to be on Facebook login page
    When User enter user "Aditya" First Name
    Then User Checks User "Aditya" First Name is present
    Then close browser
  
  @Smoke @Regression  
  Scenario: Validate Create user Multiple fields122
    Given User need to be on Facebook login page
    When User enter user "Swati" First Name
    And User enters user "Pareek" surname
    Then User Checks User "Swati" First Name is present
    Then User Mobile field should be blank
    Then close browser

    
  Scenario: Validate First Name field123
    Given User need to be on Facebook login page
    When User enter user "Aditya" First Name
    Then User Checks User "Aditya" First Name is present
    Then close browser
    
   @Regression
  Scenario: Validate First Name field124
    Given User need to be on Facebook login page
    When User enter user "Aditya" First Name
    Then User Checks User "Aditya" First Name is present
    Then close browser
   
   @Smoke 
  Scenario: Validate First Name field125
    Given User need to be on Facebook login page
    When User enter user "Aditya" First Name
    Then User Checks User "Aditya" First Name is present
    Then close browser