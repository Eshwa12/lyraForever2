@wip
@B28G27-108
Feature: As a Point of Sale manager (POS), I should be able to view product order.

  Background:
    Given the user is on the login page
    When  User click on Point of sales page
    And   User click on Orders on right menu bar
    And   User has to check the check box next to order Ref


  @B28G27-106
  Scenario: US5AC1-Verify the POS managers can view the order list on the Point of Sale page,
  after checking the Order reference, all the orders should be checked

    Then  User has to  verify all the orders will selected

  @B28G27-107
  Scenario: US5AC2-Verify the Action drop down has 3 options : Import, Export, Delete

    Then  user click on Action button
    Then  user has to verify the action button has three options
      |Import|
      |Export|
      |Delete|