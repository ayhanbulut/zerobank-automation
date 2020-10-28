Feature:
@accountactivity
  Scenario:
    Given user webpage and sign in
    And user logs in with valid credentials
    When user click to "Account Activity" button
    And user click on "Account" to dropdown to verify on "Savings" button appeared
    And user sees following options on the Account dropdown
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    Then user gets some transactions information


