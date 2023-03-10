@wip
@B28G27-99
Feature: Login as POS and eventCRM manager with valid credential


  @B28G27-98
  Scenario Outline: US12AC01TC01- Verify POS and eventCRM managers login successful and the account holder name should be correct.

    Given  User enters "<username>" and "<password>"
    And   User click on login button
    Then  User should be in main page

    Examples:
      | username                    | password         |
      | posmanager6@info.com        | posmanager       |
      | posmanager7@info.com        | posmanager       |
      | posmanager8@info.com        | posmanager       |
      | posmanager9@info.com        | posmanager       |
      | posmanager10@info.com       | posmanager       |
      | eventscrmmanager10@info.com | eventscrmmanager |
      | eventscrmmanager11@info.com | eventscrmmanager |
      | eventscrmmanager12@info.com | eventscrmmanager |
      | eventscrmmanager13@info.com | eventscrmmanager |
      | eventscrmmanager14@info.com | eventscrmmanager |
