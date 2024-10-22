@test
Feature: Login scenarios

  Scenario: TC01 - Login with correct data
    When User taps on slide menu
    And User taps on Log In slide button
    And User enters username as "bod@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    Then User should view the products page with title "Products"