Feature: Shopping cart scenario

  @smoke
  Scenario: Shopping via adding item in the cart
    Given I am able to open the chrome browser and launch the application
    When I add four different products to my wish list
    And I view my wishlist table
    Then I find total four selected items in my whishlist
    When I search for lowest price product
    And I am able to add the lowest price item  to my cart
    Then I a, able to verify the item in my cart
    Then I close my browser
