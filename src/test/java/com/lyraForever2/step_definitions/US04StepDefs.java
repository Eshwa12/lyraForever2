package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import com.lyraForever2.utilities.UpgenixUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04StepDefs {


    LoginPage loginPage = new LoginPage();

/*
    @Then("Inventory manager have access to {int} modules" )
    public void inventoryManagerHaveAccessTo(int arg0) {
        Assert.assertEquals(arg0,UpgenixUtil.mainModulesTitles());
    }


    @Given("the Inventory logged in with username and password")
    public void theUserLoggedInWithUsernameAndPassword() {

        loginPage.login(ConfigurationReader.getProperty("InventoryManager_username"),
                ConfigurationReader.getProperty("InventoryManager_password"));

    }
*/
@Given("Inventory manager logs into the upgenix page")
public void Inventory_manager_logs_into_the_upgenix_page() {
    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    loginPage.login(ConfigurationReader.getProperty("InventoryManager_username"), ConfigurationReader.getProperty("InventoryManager_password"));
}

    @Then("Inventory manager has access to {int} modules")
    public void Inventory_manager_has_access_to_16_modules(int int1) {
        Assert.assertEquals(int1, UpgenixUtil.mainModulesTitles());

    }

}
