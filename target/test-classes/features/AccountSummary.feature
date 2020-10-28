Feature:
  @accountsummary
  Scenario: Account Summary
    Given user webpage and sign in
    And user logs in with valid credentials
    When account page should have account types
    Then the user should see following options under Credit accounts
      | Account        |
      | Credit Card    |
      | Balance        |

