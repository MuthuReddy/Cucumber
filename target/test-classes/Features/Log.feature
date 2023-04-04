Feature: Verify Instagram login details

  Scenario Outline: Verify Instagram login details with valid username and valid password
    Given User is on the Instagram login page
    When User login "<userName>","<password>"
    Then User should verify after login success message

    Examples: 
      | userName   | password  |
      | Muthukumar | Reddy@123 |
