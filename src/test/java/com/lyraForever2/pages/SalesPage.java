package com.lyraForever2.pages;

import com.lyraForever2.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SalesPage extends BasePage{

    public SalesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //locate Quotation box
    @FindBy(xpath = "//table/thead/tr/th[1]")
    public WebElement quotationMainBox;

    //locate all the checkboxes options 83
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement allQuotationBoxes;

    //locate Quotations from left side menu
    @FindBy(xpath = "//a[@class='oe_menu_leaf']")
    public WebElement quotationsLeftMenu;

    //locate Quotations header
    @FindBy(xpath = "//li[contains(text(),'Quotations')]")
    public WebElement quotationsHeader;




    public void assertCheckboxesAreSelected(){
        List<WebElement> checkboxes = Driver.getDriver().findElements(By.xpath("//table/tbody/tr/td[1]/div[@class='o_checkbox']/input"));
        System.out.println(checkboxes.size());
        int count = 0;
        for (int i=0;i< checkboxes.size();i++) {

            Assert.assertEquals(true, checkboxes.get(i).isSelected());
            count++;

        }
        System.out.println(count);
    }


}
