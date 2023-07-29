Feature: Testing Amazon website
  @Valid
  Scenario: Checking item added successfully
    Given user navigate to the website
    And   type car accessories in search bar
    And   user select the first item
    And   add item to the cart
    And  Going to cart
    Then  Checking that item have been added successfully
  @Valid
  Scenario: Adding item from the fourth page to the cart
    Given user open today's deals
    And   user select headphones and grocery
    And   choose 10% off from the discount part
    Then   select any item and add it to the cart