Feature: Create account of facebook4
  As a user you need to open facebook home page and do the validation

  Scenario: Validate First Name field41
    Given User need to be on Facebook login page
    When User enter user First Name
    Then User Checks User First Name is present
  #Scenario: Validate Create user Multiple fields
  #Given User need to be on Facebook login page
  #When User enter user First Name
  #And User enters user surname
  #Then User Checks User First Name is present
  #But User Mobile field should be blank
