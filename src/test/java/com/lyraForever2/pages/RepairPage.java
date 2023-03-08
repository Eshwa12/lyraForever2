package com.lyraForever2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepairPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement RepairsPage;


    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement repairsBox;
}
