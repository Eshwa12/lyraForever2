package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12StepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("User enters {string} and {string}")
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
