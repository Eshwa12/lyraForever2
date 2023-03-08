package com.lyraForever2.pages;

import com.lyraForever2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiscussPage {

// created by Desi for US13
    public DiscussPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement profileName;
}
