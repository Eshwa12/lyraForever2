@wip
@28G27-129
Feature: Sales Module Column Access Info
	Agile: US01 - B28G27-82 - As a manager, I should be able to get correct information on the Sales page.


	@B28G27-128
	Scenario: US01AC01TC01-As a pos manager, I should be able to get correct information on the Sales page.
		Given sales manager logs into the app
		    When sales manager clicks on Sales module
		    Then sales manager can view six columns
		      | Quotation Number |
		      | Quotation Date   |
		      | Customer         |
		      | Salesperson      |
		      | Total            |
		      | Status           |