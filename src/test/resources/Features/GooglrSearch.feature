Feature: Feature to test google search funtionality

Scenario: Validate google search is working

Given browser is open
And User is on google page
When user enters a text in search box
And hits enter
Then user is navigated to search result


