Feature: Default

  # US: As a  POS manager, I want to get repair order on the Repairs page.
  # AC: Verify users can select all the repair orders by clicking the top checkbox

  Background: For all scenarios user should be able to click on Repairs module,
  see repair orders and is able to select all repair orders by clicking the checkbox.


  @B28G27-92
  Scenario: US11AC1TC1 - As a user, POS manager wants to get repair order on the Repairs page.
    Given the user is logged in as the POS manager
    Then user clicks on Repairs module
    And user is able to see Repair Orders
    Then user is able to select all repair orders by clicking the checkbox



  # US: As a Sales manager, I want to get repair order on the Repairs page.
  # AC: Verify users can select all the repair orders by clicking the top checkbox

  Scenario: US11AC1TC2 - As a user, Sales Manager wants to get repair order on the Repairs page.
    Given the user is logged in as the Sales Manager
    Then user clicks on Repairs module
    And user is able to see Repair Orders
    Then user is able to select all repair orders by clicking the checkbox