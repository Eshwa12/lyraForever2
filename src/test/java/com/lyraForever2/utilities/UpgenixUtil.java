package com.lyraForever2.utilities;

import com.lyraForever2.pages.BasePage;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UpgenixUtil extends BasePage{
    public static int mainModulesTitles() {
        UpgenixUtil basePageModules = new UpgenixUtil();
        List<WebElement> listOfMenuBar = basePageModules.mainModules;
        List<String> getListOfMenuBar = BrowserUtils.getElementsText(listOfMenuBar);
        List<String> allModules = new ArrayList<>();
        int count = 0;
        for (String eachTitle : getListOfMenuBar) {

                allModules.addAll(getListOfMenuBar);
                count++;


        }
        return count ;


    }

    public static List<String> listMainModulesTitlesString() {
        UpgenixUtil basePageModules = new UpgenixUtil();
        List<WebElement> listOfMenuBar = basePageModules.mainModules;
        List<String> getListOfMenuBar = BrowserUtils.getElementsText(listOfMenuBar);
        List<String> allModules = new ArrayList<>();
        for (String eachTitle : getListOfMenuBar) {

            allModules.addAll(getListOfMenuBar);
        }

        return allModules ;


    }

    /**
     * Method to return/confirm the number of Quotations/Names for columns under the Sales Module
     * @return
     */

    public static int salesColumns() {
        UpgenixUtil basePageModules = new UpgenixUtil();
        List<WebElement> listOfColumns = basePageModules.quotationsColumnsPage;
        List<String> getListOfColumns = BrowserUtils.getElementsText(listOfColumns);
        List<String> allColumns = new ArrayList<>();
        int count = 0;
        for (String eachTitle : getListOfColumns) {

            allColumns.addAll(getListOfColumns);
            count++;


        }
        return count;

    }

}
