Feature: Select Vacancy
  @vacancy
  Scenario: Select a vacancy
    Given User lands on the post vacancy page
    When User selects a vacancy
    Then Navigate to the vacancy details page