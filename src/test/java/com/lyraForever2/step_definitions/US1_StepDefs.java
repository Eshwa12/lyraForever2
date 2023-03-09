package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.pages.SalesPage;
import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US1_StepDefs {
LoginPage loginPage = new LoginPage();
SalesPage salesPage = new SalesPage();

    @Given("sales manager logs into the app")
    public void sales_manager_logs_into_the_app() {
        loginPage.login(ConfigurationReader.getProperty("PosManager_username"),ConfigurationReader.getProperty("PosManager_password"));

    }
    @When("sales manager clicks on Sales module")
    public void sales_manager_clicks_on_sales_module() {
    salesPage.salesPage.click();

    }
    @Then("sales manager can view six columns")
    public void sales_manager_can_view_columns(List<String> expectedResult) {
        List<WebElement> columnsQuotationNames = salesPage.quotationsColumnsPage;
        List<String> actual = BrowserUtils.getElementsText(columnsQuotationNames);
        Assert.assertEquals(actual, expectedResult);

    }


}
