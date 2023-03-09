package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.pages.PointOfSalePage;
import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US5_StepDefss {


    LoginPage loginPage = new LoginPage();
    PointOfSalePage PointOfSale=new PointOfSalePage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.login(ConfigurationReader.getProperty("PosManager_username"), ConfigurationReader.getProperty("PosManager_password"));

    }

    @When("User click on Point of sales page")
    public void user_click_on_point_of_sales_page() {
        PointOfSale.pointOfSalesPage.click();
    }

    @When("User click on Orders on right menu bar")
    public void user_click_on_orders_on_right_menu_bar() {

        PointOfSale.ordersButton.click();
    }

    @When("User has to check the check box next to order Ref")
    public void user_has_to_check_the_check_box_next_to_order_ref() {

        PointOfSale.orderRefCheckBox.click();
    }

    @Then("User has to  verify all the orders will selected")
    public void user_has_to_verify_all_the_orders_will_selected() {

        List<WebElement> checkboxOrderRef = PointOfSale.allCheckBoxOrderSelected;
        boolean Point = false;

        for (WebElement element : checkboxOrderRef) {
            if (element.isSelected()) {
                Point = true;
            } else {
                Point = false;
            }
            Assert.assertTrue(Point);
        }
    }
    @Then("user click on Action button")
    public void userClickOnActionButton() {
        PointOfSale.actionButton.click();

    }

    @Then("user has to verify the action button has three options")
    public void userHasToVerifyTheActionButtonHasOptions(List<String> expectedResult) {
        List<WebElement> actionSubmenuElements = PointOfSale.actionSubMenu;
        List<String> actual = BrowserUtils.getElementsText(actionSubmenuElements);
        Assert.assertEquals(actual, expectedResult);

    }


}
