package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import com.lyraForever2.utilities.UpgenixUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class US9StepDefs {
LoginPage loginPage = new LoginPage();

    @Given("Sales Manager logs into the upgenix page")
    public void Sales_Manager_logs_into_the_upgenix_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("SalesManager_username"), ConfigurationReader.getProperty("SalesManager_password"));
    }

    @Then("Sales manager has access to {int} modules")
    public void Sales_manager_has_access_to_19_modules(int int1) {
        Assert.assertEquals(int1, UpgenixUtil.mainModulesTitles());

    }
}
