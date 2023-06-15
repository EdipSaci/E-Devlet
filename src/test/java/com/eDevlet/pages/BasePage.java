package com.eDevlet.pages;

import com.eDevlet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
