Feature: Create account of facebook9
  As a user you need to open facebook home page and do the validation

  Scenario: Validate First Name field91
    Given User need to be on Facebook login page
    When User enter user First Name
    Then User Checks User First Name is present
    Then close browser
    
  Scenario: Validate Create user Multiple fields92
    Given User need to be on Facebook login page
    When User enter user First Name
    And User enters user surname
    Then User Checks User First Name is present
    Then User Mobile field should be blank
    Then close browser
