package com.eDevlet.pages;

import com.eDevlet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anasayfa{

    public Anasayfa() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="searchField")
    public WebElement aramaMotoru;

    @FindBy(xpath = "(//a[contains(text(),'Nüfus Kayıt Örneği Belgesi Sorgulama')])[1]")
    public WebElement NüfusKayıtÖrneğiBelgesiSorgulamaLinki;

    @FindBy(xpath = "//a[contains(text(),'TİTCK - Nöbetçi Eczane Sorgulama (Sağlık Bakanlığı)')]")
    public WebElement NobetciEczaneSorgulamaLinki;


}
