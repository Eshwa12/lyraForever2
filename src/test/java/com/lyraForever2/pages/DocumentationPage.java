package com.lyraForever2.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DocumentationPage extends BasePage{

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
}
