Feature: Payment
  @Valid
  Scenario: Fillig fileds of payment without submitting it
    Given user navigate to the second website
    And choosing the routes
    And Choose the arrival date
    And search for bus
    And Choose boarding point
    And fill customer details
    And Click on payment
    Then fill fields without submitting it