@B28G27-102
	@wip
Feature: Default

	#Background:
		#@B28G27-100
	#	Given the user is on the login page
		


	@B28G27-101
	Scenario Outline: US13AC01TC01 - User valid login and account name
		When user login using "<email>" and "<password>"
		    Then account holder name should be "<name>"
		
		    @salesManager
		    Examples:
		
		      | email                   | password     | name           |
		      | salesmanager55@info.com | salesmanager | salesmanager55 |
		      | salesmanager67@info.com | salesmanager | salesmanager67 |
		      | salesmanager89@info.com | salesmanager | salesmanager89 |
		
		    @expensesManager
		    Examples:
		      | email                      | password        | name              |
		      | expensesmanager55@info.com | expensesmanager | expensesmanager55 |
		      | expensesmanager67@info.com | expensesmanager | expensesmanager67 |
		      | expensesmanager89@info.com | expensesmanager | expensesmanager89 |