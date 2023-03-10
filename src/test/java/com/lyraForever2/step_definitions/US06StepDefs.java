package com.lyraForever2.step_definitions;

import com.lyraForever2.pages.BasePage;
import com.lyraForever2.pages.DocumentationPage;
import com.lyraForever2.pages.LoginPage;
import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.ConfigurationReader;
import com.lyraForever2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.print.Doc;
import java.lang.module.Configuration;
import java.util.List;
import java.util.Set;

public class US06StepDefs extends DocumentationPage{

    LoginPage loginPage = new LoginPage();
    DocumentationPage basePage = new DocumentationPage();

    @Given("User is in main page")
    public void user_is_in_main_page() {
        loginPage.login(ConfigurationReader.getProperty("PosManager_username"), ConfigurationReader.getProperty("PosManager_password"));
    }

    @When("User click on the profile button")
    public void user_click_on_the_profile_button() {
        basePage.profileButton.click();
    }

    @When("User click on Documentation tab")
    public void user_click_on_documentation_tab() {
        basePage.docPage.click();

    }

    @Then("User has to  verify the Odoo Documentation massage is displayed")
    public void user_has_to_verify_the_odoo_documentation_massage_is_displayed() {
        BrowserUtils.switchToWindow("Odoo Documentation — Odoo 16.0 documentation");

        String expectedResult = "Odoo Documentation";
        String actualResult = Driver.getDriver().findElement(By.xpath("//h1[@class='text-white']")).getText();

        Assert.assertEquals(actualResult, expectedResult);

       /* public void windowHandlingTest(){ vvvv

            String currentWindowHandle = Driver.getDriver().getWindowHandle();

            Set<String> allWindows = Driver.getDriver().getWindowHandles();


            for (String eachWindow : allWindows) {
                Driver.getDriver().switchTo().window(eachWindow);
                if (eachWindow.contains("Documentation")) {
                    Driver.getDriver().switchTo().window(eachWindow);
                }

            }


            String expectedResult = "Odoo Documentation";
            String actualResult = Driver.getDriver().findElement(By.xpath("//h1[@class='text-white']")).getText();

            Assert.assertEquals(actualResult, expectedResult);

        } */
    }




    @Then("User has to verify four main Document topics are listed")
    public void userHasToVerifyMainDocumentTopicsAreListed(List<String> expectedResult) {
        String currentWindowHandle=Driver.getDriver().getWindowHandle();

        Set<String> allWindows=Driver.getDriver().getWindowHandles();


        for (String eachWindow: allWindows) {
            Driver.getDriver().switchTo().window(eachWindow);
            if (eachWindow.contains("Documentation")) {
                Driver.getDriver().switchTo().window(eachWindow);
            }

        }


        List<WebElement> listSixColumn = basePage.fourDocTopic;
        List<String> actual = BrowserUtils.getElementsText(listSixColumn);
        Assert.assertEquals(actual,expectedResult);


    }
}

