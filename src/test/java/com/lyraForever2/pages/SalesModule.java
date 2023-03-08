package com.lyraForever2.pages;

import com.lyraForever2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesModule extends BasePage {

    public SalesModule() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locate Quotation box
    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement quotationMainBox;

    //locate all the checkboxes options 83
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement allQuotationBoxes;

    //locate Quotations from left side menu
    @FindBy(xpath = "//a[@class='oe_menu_leaf']")
    public WebElement quotationsLeftMenu;

    //locate Quotations header
    @FindBy(xpath = "//li[contains(text(),'Quotations')]")
    public WebElement quotationHeader;

    public void assertMultipleCheckboxesSelected() {
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        boolean allSelected = checkboxes.stream().allMatch(WebElement::isSelected);
        Assert.assertTrue("Not all checkboxes are selected", allSelected);

    }
}
