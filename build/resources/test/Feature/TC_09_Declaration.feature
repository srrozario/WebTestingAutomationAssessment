Feature: Confirmation of provided information is indeed accurate and reliable
  @declaration
  Scenario: Confirmation of given is correct
    Given User lands on the declaration page
    When Click on the checkbox
    And Confirm
    Then Navigate to payment page