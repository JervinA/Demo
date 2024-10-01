Feature: Feature to test Login funtionality

  Scenario Outline: Validate Login check is working
    Given browser is opening
    And User is on login page
    When user enters a <username> and <password>
    And clicks enter
    Then user is navigated to home page

    Examples: 
      | username              | password |
      | jervinit120@gmail.com | Jeran11@ |
      | wolverinek11@rahulshetty.com | Pwdselenium@1 |
