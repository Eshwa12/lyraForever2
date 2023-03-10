package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import com.lyraForever2.utilities.UpgenixUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US7StepDefs {

    LoginPage loginPage = new LoginPage();

    @Then("User verify that have access to {int} modules.")
    public void user_verify_that_have_access_to_modules(int int1) {
        // BasePage.mainModulesTitles();
        Assert.assertEquals(int1,UpgenixUtil.mainModulesTitles());


    }

    @Given("User as Event manager is on the login page of the upgenix application")
    public void userAsEventManagerIsOnTheLoginPageOfTheUpgenixApplication() {
        loginPage.login(ConfigurationReader.getProperty("CrmManager_username"),ConfigurationReader.getProperty("CrmManager_password"));
    }
}
