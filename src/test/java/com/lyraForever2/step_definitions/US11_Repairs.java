package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.pages.RepairsPage;
import com.lyraForever2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US11_Repairs {


    LoginPage loginPage = new LoginPage();
    RepairsPage repairsPage = new RepairsPage();

    @Given("the user is logged in as the POS manager")
    public void the_user_is_logged_in_as_the_pos_manager() {
        loginPage.login(ConfigurationReader.getProperty("PosManager_username"), ConfigurationReader.getProperty("PosManager_password"));

    }

    @Given("the user is logged in as the Sales Manager")
    public void the_user_is_logged_in_as_the_sales_manager() {
        loginPage.login(ConfigurationReader.getProperty("SalesManager_username"), ConfigurationReader.getProperty("SalesManager_password"));
    }


    @When("user clicks on Repairs module")
    public void user_clicks_on_repairs_module() {

    }


    @Then("user is able to see Repair Orders")
    public void user_is_able_to_see_repair_orders() {

    }


    @Then("user is able to select all repair orders by clicking the checkbox")
    public void user_is_able_to_select_all_repair_orders_by_clicking_the_checkbox() {


    }




}
