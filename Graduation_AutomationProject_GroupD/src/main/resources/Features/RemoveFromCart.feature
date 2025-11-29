Feature: Remove from Cart

  Scenario: User removes a product from the cart
    Given user searches for "MacBook"
    And user adds product to cart
    When user removes "MacBook" from the cart
    Then the cart should be empty