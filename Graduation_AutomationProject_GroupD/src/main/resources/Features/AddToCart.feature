Feature: Add to cart feature

  Scenario: Add product to cart
    Given user searches for "MacBook"
    When user adds product to cart
    Then "MacBook" should be in the cart

