Feature: Wishlist

  Scenario: User adds product to wishlist
    Given user searches for "MacBook"
    When user adds product to wishlist
    Then "MacBook" should be in the wishlist