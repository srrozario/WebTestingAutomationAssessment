Feature: Apply For A Vacancy Without Login
  @apply
  Scenario: Apply for a vacancy without login
    Given User lands on a particular vacancy details page
    When User clicks on the apply now button
    And User clicks on the continue without login
    Then Navigate to the job application page