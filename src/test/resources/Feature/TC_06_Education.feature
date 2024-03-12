Feature: Fill-up education information
  @education
  Scenario Outline: Fill-up user education information
    Given User lands on the education page
    When Select hsc exam, '<hscSub>', '<hscBoard>', '<hscPassingYr>', '<gpaScaleHsc>' and '<hscResult>'
    And Select ssc exam, '<sscSub>', '<sscBoard>', '<sscPassingYr>', '<gpaScaleSsc>' and '<sscResult>'
    And Click on next button
    Then Navigate to job experience page
    Examples:
      | hscSub | hscBoard | hscPassingYr | gpaScaleHsc | hscResult | sscSub | sscBoard | sscPassingYr | gpaScaleSsc | sscResult |
      |science |bit       |2010          |5            |5          |science |dhaka     |2008          |5            |5          |