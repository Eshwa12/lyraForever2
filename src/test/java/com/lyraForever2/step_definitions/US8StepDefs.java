package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import com.lyraForever2.utilities.UpgenixUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

public class US8StepDefs
{
    LoginPage loginPage = new LoginPage();
    @Given("Expense manager logs into the upjenix page")
    public void Expense_manager_logs_into_the_upjenix_page(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login(ConfigurationReader.getProperty("ExpensesManager_username"), ConfigurationReader.getProperty("ExpensesManager_password"));
    }

    @Then("Expense Manager has access to {int} modules")
    public void expense_manager_has_access_to_modules(int int1) {
        Assert.assertEquals(int1, UpgenixUtil.mainModulesTitles());
    }

}
