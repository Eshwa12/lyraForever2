@B28G27-115
Feature:  As a user, I want to access the documentation page.

  @doc1 @B28G27-113
  Scenario: Verify the “Odoo Documentation” message is displayed n a new window

    Given User is in main page
    When  User click on the profile button
    And   User click on Documentation tab
    Then  User has to  verify the Odoo Documentation massage is displayed


  @doc @B28G27-114
  Scenario:Verify there are 4 main document topics are listed
    Given  User is in main page
    When   User click on the profile button
    And    User click on Documentation tab
    Then   User has to verify four main Document topics are listed
      | User Docs            |
      | Install and Maintain |
      | Developer            |
      | Contribute         |