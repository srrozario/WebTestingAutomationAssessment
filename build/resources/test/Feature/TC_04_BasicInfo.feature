Feature: Fill-up basic information
  @basicInfo
  Scenario Outline: Fill-up basic user information
    Given User lands on the basic info pag
    When Insert '<nidNumber>'
    And Select nid file
    And Select Dob
    And Click on the verify nid button
    Then Personal information are shown
    When Enter '<fatherName>' , '<motherName>' , and '<mobileNumber>'
    Then OTP popups
    When Click on the ok button from the popup dialog box
    And Enter otp
    And Click on the ok button from the popup dialog box
    And Enter '<emailAddress>'
    And Select Marital and religion
    And Select photo and signature
    And Click on the next button
    Then Navigate to the address page
    Examples:
      | nidNumber | fatherName | motherName | mobileNumber | emailAddress      |
      |8231771135 |Md. Siddiq  |Amena Begum | 01702312169  | sajibsqa@gmail.com|