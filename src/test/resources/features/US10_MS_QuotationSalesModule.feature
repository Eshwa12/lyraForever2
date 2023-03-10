@wip
Feature: Sales Module Quotations checkbox
  Agile story: B28G27-91 - As POS & Sales manager, I want to manage quotations on the Sales page.


	#*US10* As POS & Sales manager, I want to manage quotations on the Sales page.
	#
	#*AC:* Verify users can select all the quotations by clicking the top checkbox.
  @B28G27-103
  Scenario Outline: US10AC1- POS and Sales manager wants to manage quotation on the Sales page.
    Then user insert "<username>" and "<password>"
    And user should click on Sales module
    Then user should see Quotations header
    And user should click on main Quotation Box
    Then user should see all the checkboxes are selected
    Examples:
      | username                | password     |
      | posmanager6@info.com    | posmanager   |
      | posmanager7@info.com    | posmanager   |
      | posmanager8@info.com    | posmanager   |
      | salesmanager10@info.com | salesmanager |
      | salesmanager11@info.com | salesmanager |
      | salesmanager12@info.com | salesmanager |
