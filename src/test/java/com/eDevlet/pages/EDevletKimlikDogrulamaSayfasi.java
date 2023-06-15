package com.eDevlet.pages;

import com.eDevlet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EDevletKimlikDogrulamaSayfasi {

    public EDevletKimlikDogrulamaSayfasi() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1[.='Türkiye Cumhuriyeti Vatandaş Kimlik Doğrulama Sistemi']")
    public WebElement KimlikDogrulamaBaslık;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement TCNoKutusu;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement SifreKutusu;

    @FindBy(className = "submitButton")
    public WebElement girisButonu;


}
