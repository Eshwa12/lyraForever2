@wip
@B28G27-120
Feature: Default

	#*User Story:*
	#
	#As a Event manager, I should be able to access to the different modules.
	#
	#*AC1:* Verify the Event managers access to 15 modules.
	@B28G27-119 @UPGENIX
	Scenario: US07AC01TC01-Verify the Event managers access to 15 modules
		Given User as Event manager is on the login page of the upgenix application
		Then User verify that have access to 15 modules.