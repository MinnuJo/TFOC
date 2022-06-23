Feature: Shore Login

Scenario Outline: Shore Login using default credentials

Given User is on Smartship Landing page
When I give <username> in username field
And I give <password> in password field
And I click on login button
Then I want to login to the shore application

    Examples: 
      |username           |password | 
      |admin              |Alph@or1 |
      |minnu.j@alphaori.sg|Minnu$12 |