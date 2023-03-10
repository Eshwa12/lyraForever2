@wip
@B28G27-117
Feature: Expense Manager Access Modules

	#Background:
		#@B28G27-100
		#Given the user is on the login page
		

	#*User Story:*
	#
	#As a Expense Manager, I should be able to access different modules
	#
	#*AC1:* Verify Expense Manager can access 12 modules
	@B28G27-116
	Scenario: Expense Manager Modules Access
		When Expense Manager logs into the upgenix page
		Then Expense Manager has access to 12 modules