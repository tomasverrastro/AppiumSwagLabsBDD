
Feature: Products scenarios

  Scenario: TH05 - View details of Sauce Labs Onesie
  When User clicks on product with text "Sauce Labs Onesie"
  Then User should view product description as "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel."

  Scenario: TH06 - Sort catalog by descendant
  When User clicks on Sorting button
  And User clicks on Sort By Descending Name button
  Then User should view products ordered by Descending Name

  Scenario: TH07 - Sort catalog by ascendant price
    When User clicks on Sorting button
    And User clicks on Sort By Ascendant Price button
    Then User should view products ordered by Ascendant Price

  Scenario: TH08 - Purchase 2 items before logging in
    When User clicks on the product on the position 1
    And User clicks on Add to Cart button
    And User press Back button
    And User clicks on the product on the position 4
    And User clicks on Add to Cart button
    And User clicks on Cart button
    And User clicks on Proceed to checkout button
    And User enters username as "bod@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    And User enters Full name as "Tomas Verrastro"
    And User enters Address Line as "Washington 1234"
    And User enters City as "Buenos Aires"
    And User enters Zip code as "50305"
    And User enters Country as "Argentina"
    And User clicks on To Payment button
    And User enters Card Full name as "Tomas Verrastro"
    And User enters Card Number as "8493373994032703"
    And User enters Expiration date as "0531"
    And User enters Security code as "754"
    And User clicks on Review Order button
    And User clicks on Place Order button
    Then User should view Checkout Complete Text as "Checkout Complete"

  Scenario: TH09 - Rate an item
    When User clicks on the product on the position 1
    And User clicks on five star rating button
    Then User should view a popup message as "Thank you for submitting your review!"

    @test
  Scenario: TH10 - Add item to chart and remove it
    When User clicks on the product on the position 1
    And User clicks on Add to Cart button
    And User clicks on Cart button
    And User clicks on Remove Item
    Then User should view empty cart with text "No Items"

  Scenario: TH11 - Try to purchase without entering ZIP code
    When User clicks on the product on the position 1
    And User clicks on Add to Cart button
    And User clicks on Cart button
    And User clicks on Proceed to checkout button
    And User enters username as "bod@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    And User enters Full name as "Tomas Verrastro"
    And User enters Address Line as "Washington 1234"
    And User enters City as "Buenos Aires"
    And User enters Country as "Argentina"
    And User clicks on To Payment button
    Then User should view ZIP code error text as "Please provide your zip"

  Scenario: TH12 - Try to purchase without entering security code
    When User clicks on the product on the position 1
    And User clicks on Add to Cart button
    And User press Back button
    And User clicks on the product on the position 4
    And User clicks on Add to Cart button
    And User clicks on Cart button
    And User clicks on Proceed to checkout button
    And User enters username as "bod@example.com"
    And User enters password as "10203040"
    And User taps on Login button
    And User enters Full name as "Tomas Verrastro"
    And User enters Address Line as "Washington 1234"
    And User enters City as "Buenos Aires"
    And User enters Zip code as "50305"
    And User enters Country as "Argentina"
    And User clicks on To Payment button
    And User enters Card Full name as "Tomas Verrastro"
    And User enters Card Number as "8493373994032703"
    And User enters Expiration date as "0531"
    And User clicks on Review Order button
    Then User should view security code error text as "Value looks invalid."

  Scenario: TH13 - Make a draw on drawing section
    When User taps on slide menu
    And User clicks on Drawing slide button
    And User allows access to app
    And User makes some drawing
    And User presses Save button
    Then User should view Successful Alert with text "Drawing saved successfully to gallery"

  @test
  Scenario: TH14 - Reset the app
    When User taps on slide menu
    And User clicks on Reset App State Slider Button
    And User clicks on Reset App Confirm Button
    Then User should view Successful App Reset Alert As "App State has been reset."










