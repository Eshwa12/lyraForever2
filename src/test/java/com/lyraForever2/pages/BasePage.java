package com.lyraForever2.pages;




import com.lyraForever2.utilities.BrowserUtils;
import com.lyraForever2.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //US1
    @FindBy(xpath = "//span[normalize-space()='Sales']")
    public WebElement salesPage;

    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> quotationsColumnsPage;


    //US2  , US11
    @FindBy(xpath = "//span[normalize-space()='Repairs']")
    public WebElement repairsPage;


    @FindBy(xpath = "//th[@class='o_column_sortable']")
    public List<WebElement> repairColumnsPage;

    //US3 , US4 , US7 ,US8 , US9
    @FindBy(xpath = "//ul[contains(@class,'oe_application_menu_placeholder')]//li//span")
    //div[@class='navbar-collapse collapse']
    //(//div[@class='navbar-collapse collapse']/ul//span) -->whole top manu bar all text + icons
    public List<WebElement> mainModules;
    // optional for user story 4 or 3 or 7  or 8 or 9://span[@class='oe_topbar_name']

    //US5
    @FindBy(xpath = "(//span[normalize-space()='Point of Sale'])[1]")
    public WebElement pointOfSalesPage;
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


    //U6
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement profileButton;
    @FindBy(xpath = "//a[.='Documentation']")
    public WebElement docPage;
    @FindBy(xpath = "//div[@id='wrap']//h1")
    public WebElement odooDoc;
    @FindBy(xpath = "//h2")
    public List<WebElement> fourDocTopic;
    //section[@class='o_content_fw_banner']/following-sibling::* select all the topic
    @FindBy(xpath = "(//a[.='User Docs'])[2]")
    public WebElement userDocTopic;
    @FindBy(xpath = "(//a[.='Install and Maintain'])[2]")
    public WebElement installAndMaintainTopic;
    @FindBy(xpath = "(//a[.='Developer'])[2]")
    public WebElement developerTopic;
    @FindBy(xpath = "(//a[.='Contributing'])[2]")
    public WebElement contributingTopic;

    //US10
    @FindBy(xpath = "(//span[normalize-space()='Quotations'])[2]")
    public WebElement quotationsButton;

    @FindBy(xpath = "(//input[@type='checkbox'] )[3]")
    public WebElement quotationsNumberCheckBox;

    @FindBy(xpath = "//table//input")
    public List<WebElement> quotationsAllBoxSelected;

    //US11
    @FindBy(xpath = "//th[@class='o_list_record_selector']//input[@type='checkbox']")
    public WebElement repairsCheckBox;

    @FindBy(xpath = "//table//input")
    public List<WebElement> repairAllCheckBoxSelected;


    //US14
    @FindBy(xpath = "//span[normalize-space()='Calendar']")
    public WebElement calenderPage;
    //example we want to choose time 0:00 ==>((//tbody)[5]/tr/td/span)[1]
    @FindBy(xpath = "(//tbody)[5]/tr/td/span")
    public List<WebElement> timeList;





    


}


