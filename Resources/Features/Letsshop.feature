Feature: LetsShop

Scenario Outline: Login into letsshop application

Given when application is loaded #precondition
When user enters the username #step
When user enters the password
When user clicks on login button
Then verify home page loaded #validation


