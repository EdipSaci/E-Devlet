package com.eDevlet.pages;

import com.eDevlet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NüfusVeVatandaşlıkİşleri {

    public NüfusVeVatandaşlıkİşleri() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//li[.='Nüfus Kayıt Örneği Belgesi Sorgulama']" )
    public WebElement nüfusKayıtÖrneğiBelgesiSorgulamaBaşlığı;

    @FindBy(xpath = "//a[.='Kimliğimi Şimdi Doğrula']")
    public WebElement kimliğimiŞimdiDoğrulaButonu;

    @FindBy(xpath = "//ol[@class='serviceInstructions']")
    public WebElement bilgilendirmeYazısı;

    @FindBy(className = "radioButton")
    public WebElement yukarıdakiBilYazOkdumRadioButton;

    @FindBy(className = "submitButton")
    public WebElement devamEtButonu;

    @FindBy(xpath ="//legend[.='Sorgulamaya Esas Bilgileriniz']")
    public WebElement sorgulamayaEsasBilgilerinizBaslıgı;

    @FindBy(id="nkoTip")
    public WebElement nufusKayitOrnTipiAcilirPencere;

    @FindBy(xpath = "(//input[@value='E'])[1]")
    public WebElement eskiEsListeleEvet;

    @FindBy(xpath = "(//input[@value='H'])[1]")
    public WebElement eskiEsListeleHayır;

    @FindBy(xpath = "(//input[@value='H'])[2]")
    public WebElement vukuatlıBelgeEvet;

    @FindBy(xpath = "(//input[@value='H'])[2]")
    public WebElement vukuatlıBelgeHayır;

    @FindBy(id = "kullanilisAmac")
    public WebElement belgeninNedenVerilecegiAcılırPencere;

    @FindBy(name = "kurumAdi")
    public WebElement kurumAdiKutusu;

    @FindBy(className = "submitButton")
    public WebElement sorgulaButonu;

    @FindBy(xpath = "//li[.='Sorgulama Sonucu']")
    public WebElement sorgulamaSonucu;

    @FindBy(id = "sayi")
    public WebElement sayiKutucugu;

    @FindBy(id = "tarih")
    public WebElement tarihKutucugu;

     @FindBy(xpath = "//a[.='Kayıtlı Belgelerim']")
    public WebElement kayıtlıBelgelerimButonu;





}
