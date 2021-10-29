Feature: Create account of facebook2
  As a user you need to open facebook home page and do the validation

    
  Scenario Outline: Validate Create user Multiple fields21
    Given User need to be on Facebook login page
    When User enter user "<user>" First Name
    And User enters user "<surname>" surname
    Then User Checks User "<user>" First Name is present
    Then User Mobile field should be blank
    Then close browser
    Examples:
    |	user	|	surname	|
    |	Swati	|	Pareek	|
    |	Santosh	|	Mali	|
