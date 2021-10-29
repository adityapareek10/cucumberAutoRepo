Feature: Create account of facebook8
  As a user you need to open facebook home page and do the validation

  Scenario: Validate First Name field81
    Given User need to be on Facebook login page
    When User enter user "Aditya" First Name
    Then User Checks User "Aditya" First Name is present
    Then close browser
    
  Scenario: Validate Create user Multiple fields82
    Given User need to be on Facebook login page
    When User enter user "Swati" First Name
    And User enters user "Pareek" surname
    Then User Checks User "Swati" First Name is present
    Then User Mobile field should be blank
    Then close browser
