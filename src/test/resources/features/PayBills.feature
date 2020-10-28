Feature:


    Scenario:
    Given user webpage and sign in
    And user logs in with valid credentials
    When user press Pay Bills button
    Given the user fills form "Amount","Date"


  @paybills

  Scenario Outline: user pays bills positive scenario
    Given user webpage and sign in
    And user logs in with valid credentials
    When user press Pay Bills button
    Given the user fills form "<Amount>","<Date>" and "<Description>"

    Examples:
      | Amount          |Date          |Description     |
      |  100            |2020 12 09   |first payment    |


