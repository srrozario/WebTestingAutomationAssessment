Feature: Fill-up address information
  @address
  Scenario Outline: Fill-up user address information
    Given User lands on the address page
    When Select division, district and '<thana>'
    And Type '<postOffice>', '<postCode>' and '<address>'
    And Click on the same as permanent address checkbox
    And Proceed to next
    Then Navigate to education page
    Examples:
      | thana | postOffice     | postCode | address    |
      | Ramna |Test post office|1212      |Test address|


