#Author: Priya S

@shopping
Feature: Shopping Portal Testing
  I want to shop a outfit for the party and add it to cart

  Scenario: Add and Remove products from the cart
    Given I want to login to the shopping portal
    When I add the product to cart
    Then would like to view the product in cart
    And I want to remove the item from the cart
    