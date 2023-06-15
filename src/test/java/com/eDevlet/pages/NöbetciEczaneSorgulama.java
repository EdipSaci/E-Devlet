package com.eDevlet.pages;

import com.eDevlet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NöbetciEczaneSorgulama {
    public NöbetciEczaneSorgulama() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//em[.='TİTCK - Nöbetçi Eczane Sorgulama']")
    public WebElement NobetciEczaneSorgulamaBaslık;

    @FindBy(id = "plakaKodu")
    public WebElement ilAcılırPencere;

    @FindBy(className = "advdate")
    public WebElement tarihKutucugu;

    @FindBy(id = "col_1_inp")
    public WebElement ilceAcılırPencere;

    @FindBy(className = "submitButton")
    public WebElement sorgulaButonu;

    @FindBy(xpath = "(//dl[@class='compact']//dd)[1]")
    public WebElement secilenIl;

    @FindBy(xpath = "(//dl[@class='compact']//dd)[2]")
    public WebElement secilenTarih;

    @FindBy(xpath = "//caption[.='Eczane Bilgileri']")
    public WebElement eczaneBilgileriTablo;

    @FindBy(xpath = "((//tbody//tr[@data-row-filtered='0'])[1]//td)[2]")
    public WebElement tabloIlce;

    @FindBy(xpath = "((//tbody//tr[@data-row-filtered='0'])[1]//td)[5]//a")
    public WebElement haritadaGosterLinki;

    @FindBy(xpath = "//dl[@class='compact']")
    public WebElement eczaneBilgileri;

    @FindBy(id = "plakaKodu-error")
     public WebElement uyarıMesajıIlSecimi;

    @FindBy(id = "nobetTarihi-error")
     public WebElement uyarıMesajıTarihSecimi;

    @FindBy(xpath = "//div[@class='warningContainer']")
     public WebElement uyarıMesajıGecersizTarihSecimi;







}
