package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.BasePage;
import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import io.cucumber.java.en.Given;
public class LoginStepDefs  {

    LoginPage loginPage = new LoginPage();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username = null;
        String password = null;

        if (userType.equalsIgnoreCase("POS_Manager")) {
            username = ConfigurationReader.getProperty("PosManager_username");
            password = ConfigurationReader.getProperty("PosManager_password");
        } else if (userType.equalsIgnoreCase("sales_Manager")) {
            username = ConfigurationReader.getProperty("SalesManager_username");
            password = ConfigurationReader.getProperty("SalesManager_password");
        } else if (userType.equalsIgnoreCase("CRM_Manager")) {
            username = ConfigurationReader.getProperty("CrmManager_username");
            password = ConfigurationReader.getProperty("CrmManager_password");
        } else if (userType.equalsIgnoreCase("Inventory_Manager")) {
            username = ConfigurationReader.getProperty("InventoryManager_username");
            password = ConfigurationReader.getProperty("InventoryManager_password");


        } else if (userType.equalsIgnoreCase("Expenses_Manager")) {
            username = ConfigurationReader.getProperty("ExpensesManager_username");
            password = ConfigurationReader.getProperty("ExpensesManager_password");
        }

        //send username and password and login
        new LoginPage().login(username, password);
    }

   /* @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {

        loginPage.login(username, password);
    }
*/

  /* @Given("the user is on the login page with username and password")
    public void theUserIsOnTheLoginPageWithUsernameAndPassword() {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("PosManager_username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("PosManager_password"));
        loginPage.submit.click();
    }
*/



}





