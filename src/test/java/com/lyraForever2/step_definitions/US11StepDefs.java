package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.BasePage;
import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.pages.RepairPage;
import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US11StepDefs{

    LoginPage loginPage = new LoginPage();
    RepairPage repairPage = new RepairPage();


    @Given("the user is logged in as the POS manager")
    public void the_user_is_logged_in_as_the_pos_manager() {
        loginPage.login(ConfigurationReader.getProperty("PosManager_username"),
                ConfigurationReader.getProperty("PosManager_password"));

    }

    @Given("the user is logged in as the Sales Manager")
    public void the_user_is_logged_in_as_the_sales_manager() {
        loginPage.login(ConfigurationReader.getProperty("SalesManager_username"),
                ConfigurationReader.getProperty("SalesManager_password"));
    }


    @When("user clicks on Repairs module")
    public void user_clicks_on_repairs_module() {
        repairPage.repairsPage.click();
    }


    @Then("user is able to see Repair Orders")
    public void user_is_able_to_see_repair_orders() {
        Assert.assertTrue(repairPage.repairOrdersTitle.isDisplayed());
    }

    @Then("user selected the check box Repair Reference")
    public void userSelectedTheCheckBoxRepairReference() {
        repairPage.repairsCheckBox.click();
    }

    @Then("user is able to select all repair orders by clicking the checkbox")
    public void user_is_able_to_select_all_repair_orders_by_clicking_the_checkbox() {
        BrowserUtils.sleep(2);
        List<WebElement> checkboxQuotations = repairPage.repairAllCheckBoxSelected;
        boolean checkbox = false;

        for (WebElement element : checkboxQuotations) {
            if(element.isSelected()){
                checkbox = true;
            }else{
                checkbox =false;
            }
            Assert.assertTrue(checkbox);
        }

    }




}
