package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12StepDefs {
    LoginPage loginPage = new LoginPage();
    @Given("POS managers and eventCRM manager are on the login page of the upgenix application")
    public void pos_managers_and_event_crm_manager_are_on_the_login_page_of_the_upgenix_application() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
    }
    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        loginPage.submit.click();
    }
    @Then("User should be in main page")
    public void user_should_be_in_main_page() {
        Boolean actualTitle  =  Driver.getDriver().getTitle().contains("Odoo");
        Assert.assertTrue(actualTitle);
    }

}
