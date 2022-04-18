#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Shore Login
  I want to use this template for my feature file

  Scenario Outline: Shore Login using default credentials
    
    Given initialize driver
    And User is on Smartship Landing page
    When I give <username> in username field 
    And I give <password> in password field
    And I click on login button
    Then I want to login to the shore application


    Examples: 
      |username |password | 
      |admin    |Alph@or1 |
      
      
      
      
      
