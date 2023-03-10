package com.lyraForever2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RepairPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement RepairPage;


    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement repairsBox;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> repairColumnsPage;

    @FindBy(xpath =  "//li[.='Repair Orders']")
    public WebElement repairOrdersTitle;
}
