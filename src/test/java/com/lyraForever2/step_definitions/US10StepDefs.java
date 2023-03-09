package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.pages.SalesPage;
import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US10StepDefs {

    LoginPage login = new LoginPage();
    SalesPage salesPageBase = new SalesPage();

   /* @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    */

    @Then("user insert {string} and {string}")
    public void user_insert_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.login(username, password);
    }

    @And("user should click on Sales module")
    public void user_should_click_on_sales_module() {
        salesPageBase.salesPage.click();
    }

    @Then("user should see Quotations header")
    public void user_should_see_quotations_header() {
       salesPageBase.quotationsHeader.isDisplayed();
    }

    @And("user should click on main Quotation Box")
    public void user_should_click_on_main_quotation_box() {
        salesPageBase.quotationMainBox.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should see all the checkboxes are selected")
    public void user_should_see_all_the_checkboxes_are_selected() {
        salesPageBase.assertCheckboxesAreSelected();
    }


}





