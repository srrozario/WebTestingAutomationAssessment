Feature: Fill-up job experience information
  @jobExperience
  Scenario Outline: Fill-up user job experience information
    Given User lands on the ob experience page
    When Type '<orgName>'
    And Select '<designation>', '<startDate>'
    And Put '<jobAddress>'
    Then Navigate to certificate page
    Examples:
      | orgName | designation | startDate | jobAddress     |
      |ABC LTD  |3rd Engineer |11102010   |Test job address|

