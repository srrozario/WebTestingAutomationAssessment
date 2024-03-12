Feature: Fill-up certification information
  @certificate
  Scenario Outline: Fill-up user certification information
    Given User lands on the certificate page
    When Select '<duration>' and duration type
    And Proceed forward
    Then Navigate to declaration page
    Examples:
      | duration |
      |3         |