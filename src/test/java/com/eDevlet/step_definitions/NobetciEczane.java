package com.eDevlet.step_definitions;

import com.eDevlet.pages.Anasayfa;
import com.eDevlet.pages.NöbetciEczaneSorgulama;
import com.eDevlet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class NobetciEczane {

    NöbetciEczaneSorgulama nöbetciEczaneSorgulama = new NöbetciEczaneSorgulama();
    Anasayfa anasayfa = new Anasayfa();

    @Then("Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama\\(Sağlık Bakanlığı) linkini görür")
    public void kullanıcı_titck_nöbetçi_eczane_sorgulama_sağlık_bakanlığı_linkini_görür() {
        Assert.assertTrue(anasayfa.NobetciEczaneSorgulamaLinki.isDisplayed());
    }

    @When("Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama\\(Sağlık Bakanlığı) linkine tıklar")
    public void kullanıcı_titck_nöbetçi_eczane_sorgulama_sağlık_bakanlığı_linkine_tıklar() {
        anasayfa.NobetciEczaneSorgulamaLinki.click();
    }

    @Then("Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama modülüne erişir")
    public void kullanıcı_titck_nöbetçi_eczane_sorgulama_modülüne_erişir() {
        Assert.assertTrue(nöbetciEczaneSorgulama.NobetciEczaneSorgulamaBaslık.isDisplayed());
    }

    @When("Kullanıcı eczane sorgulama sayfasında il açılır listesinden {string} seçer")
    public void kullanıcı_eczane_sorgulama_sayfasında_il_açılır_listesinden_seçer(String il) {
        Select nbtciEczneAcilirPncere = new Select(nöbetciEczaneSorgulama.ilAcılırPencere);
        nbtciEczneAcilirPncere.selectByVisibleText(il);
        BrowserUtils.sleep(2);
    }

    @When("Kullanıcı eczane sorgulama sayfasında {string} seçer")
    public void kullanıcı_eczane_sorgulama_sayfasında_seçer(String tarih) {
        nöbetciEczaneSorgulama.tarihKutucugu.sendKeys(tarih);
        BrowserUtils.sleep(2);
    }

    @When("Kullanıcı sorgula butonuna tıklar")
    public void kullanıcı_sorgula_butonuna_tıklar() {
        nöbetciEczaneSorgulama.sorgulaButonu.click();
    }

    @Then("Kullanıcı seçilen {string} ve {string} bilgilerine göre eczane bilgileri tablosunu görür")
    public void kullanıcı_seçilen_ve_bilgilerine_göre_eczane_bilgileri_tablosunu_görür(String il, String tarih) {
        Assert.assertTrue(nöbetciEczaneSorgulama.eczaneBilgileriTablo.isDisplayed());
        Assert.assertEquals(il, nöbetciEczaneSorgulama.secilenIl.getText());
        Assert.assertEquals(tarih, nöbetciEczaneSorgulama.secilenTarih.getText());

    }

    @When("Kullanıcı eczane sorgulama sayfasında ilçe açılır listesinden {string} seçer")
    public void kullanıcı_Eczane_Sorgulama_Sayfasında_IlçeAçılır_Listesinden_Seçer(String ilçe) {
        Select ilceAcılırPencere = new Select(nöbetciEczaneSorgulama.ilceAcılırPencere);
        ilceAcılırPencere.selectByVisibleText(ilçe);
        BrowserUtils.sleep(2);
    }
    @Then("Kullanıcı seçilen ilçe bilgisini tablo {string} sütununda görür")
    public void kullanıcı_seçilen_ilçe_bilgisini_tablo_sütununda_görür(String ilce) {
        Assert.assertEquals(ilce,nöbetciEczaneSorgulama.tabloIlce.getText());
    }

    @When("Kullanıcı Haritada Göster linkine tıklar")
    public void kullanıcı_haritada_göster_linkine_tıklar() {
        nöbetciEczaneSorgulama.haritadaGosterLinki.click();
    }

    @Then("Kullanıcı Eczane Bilgilerini görür")
    public void kullanıcı_eczane_bilgilerini_görür() {
        Assert.assertTrue(nöbetciEczaneSorgulama.eczaneBilgileri.isDisplayed());
    }

    @Then("Kullanıcı İl Seçimi başlığının üzerinde {string} uyarı mesajını görür")
    public void kullanıcı_il_seçimi_başlıgınının_üzerinde_uyarı_mesajını_görür(String uyariMesaji) {
        Assert.assertEquals(nöbetciEczaneSorgulama.uyarıMesajıIlSecimi.getText(),uyariMesaji);
    }


    @And("Kullanıcı Nöbet Tarihi başlığının üzerinde {string} uyarı mesajını görür")
    public void kullanıcı_NöbetTarihi_Başlığının_Üzerinde_Uyarı_Mesajını_Görür(String uyariMesaji) {
        Assert.assertEquals(nöbetciEczaneSorgulama.uyarıMesajıTarihSecimi.getText(),uyariMesaji);
    }
    @Then("Kullanıcı {string} uyarı mesajını görür")
    public void kullanıcı_uyarı_mesajını_görür(String uyariMesajı) {
        Assert.assertEquals(nöbetciEczaneSorgulama.uyarıMesajıGecersizTarihSecimi.getText(),uyariMesajı);
    }
}
