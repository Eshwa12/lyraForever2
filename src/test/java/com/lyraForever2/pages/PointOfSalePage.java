package com.lyraForever2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PointOfSalePage extends BasePage{

    @FindBy(xpath = "(//span[normalize-space()='Orders'])[3]")
    public WebElement ordersButton;
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement orderRefCheckBox;
    @FindBy(xpath = "//button[normalize-space()='Action']")
    public WebElement actionButton;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[4]//li")
    public List<WebElement> actionSubMenu;
    @FindBy(xpath = "//table//input")
    public List<WebElement> allCheckBoxOrderSelected;




















}
