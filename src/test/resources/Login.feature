
Feature: Login scenarios

  Scenario: TC01 - Login with correct data
    When User taps on slide menu
    And User taps on Log In slide button
    And User enters username as "bod@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    Then User should view the products page with title "Products"

  Scenario: TC02 - Try to login without filling the user field
    When User taps on slide menu
    And User taps on Log In slide button
    And User enters password as "10203040"
    And User taps on Login button
    Then User should view Required Username error text as "Username is required"

  Scenario: TC03 - Try to login without filling the password field
    When User taps on slide menu
    And User taps on Log In slide button
    And User enters username as "bod@example.com"
    And User taps on Login button
    Then User should view Password error text as "Enter Password"

  Scenario: TC04 - Try to login with a blocked user
    When User taps on slide menu
    And User taps on Log In slide button
    And User enters username as "alice@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    Then User should view Password error text as "Sorry this user has been locked out."
