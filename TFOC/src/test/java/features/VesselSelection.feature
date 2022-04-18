
Feature: My fleet page

Background: Login functionality

    Given initialize driver
    And User is on Smartship Landing page
    When I give admin in username field 
    And I give Alph@or1 in password field
    And I click on login button
    

    
Scenario: Select a vessel from myfleet page

  When I select vessel 
  Then user should navigate to ship page

