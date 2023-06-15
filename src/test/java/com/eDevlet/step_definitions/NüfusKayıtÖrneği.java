package com.eDevlet.step_definitions;

import com.eDevlet.pages.Anasayfa;
import com.eDevlet.pages.EDevletKimlikDogrulamaSayfasi;
import com.eDevlet.pages.NüfusVeVatandaşlıkİşleri;
import com.eDevlet.utilities.BrowserUtils;
import com.eDevlet.utilities.ConfigurationReader;
import com.eDevlet.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class NüfusKayıtÖrneği {

    Anasayfa anasayfa = new Anasayfa();
    NüfusVeVatandaşlıkİşleri nüfusVeVatandaşlıkİşleri = new NüfusVeVatandaşlıkİşleri();
    EDevletKimlikDogrulamaSayfasi eDevletKimlikDogrulamaSayfasi =new EDevletKimlikDogrulamaSayfasi();
    Faker faker = new Faker();

    @Given("Kullanıcı e-devlet anasayfasında")
    public void kullanıcı_EDevlet_Anasayfasında() {
        Driver.getDriver().get(ConfigurationReader.getProperty("e-devletURL"));
    }
    @When("Kullanıcı arama motoruna {string} yazar")
    public void kullanıcı_arama_motoruna_yazar(String nfsKytÖrn) {
        anasayfa.aramaMotoru.sendKeys(nfsKytÖrn);
    }
    @Then("Kullanıcı çıkan sonuçlardan {string} linkini görür")
    public void kullanıcı_çıkan_sonuçlardan_linkini_görür(String linkText) {
        Assert.assertTrue(anasayfa.NüfusKayıtÖrneğiBelgesiSorgulamaLinki.getText().contains(linkText));
    }
    @When("Kullanıcı Nüfus Kayıt Örneği Belgesi Sorgulama linkine tıklar")
    public void kullanıcı_Nüfus_Kayıt_Örneği_Belgesi_Sorgulama_linkine_tıklar() {
       anasayfa.NüfusKayıtÖrneğiBelgesiSorgulamaLinki.click();
    }
    @Then("Kullanıcı {string} modülüne erişim sağlar")
    public void kullanıcı_modülüne_erişim_sağlar(String başlık) {
        Assert.assertTrue(nüfusVeVatandaşlıkİşleri.nüfusKayıtÖrneğiBelgesiSorgulamaBaşlığı.getText().contains(başlık));
    }
    @When("Kullanıcı Kimliğimi Şimdi Doğrula butonuna tıklar")
    public void kullanıcı_kimliğimi_şimdi_doğrula_butonuna_tıklar() {
        nüfusVeVatandaşlıkİşleri.kimliğimiŞimdiDoğrulaButonu.click();
    }
    @Then("Kullanıcı Kimlik Doğrulama Sistemi sayfasına yönlendirilir")
    public void kullanıcı_kimlik_doğrulama_sistemi_sayfasına_yönlendirilir() {
        Assert.assertTrue(eDevletKimlikDogrulamaSayfasi.KimlikDogrulamaBaslık.isDisplayed());
    }
    @When("Kullanıcı e-devlet şifresi kullanarak sisteme giriş yapmak için TC Kimlik numarası ve e-devlet şifresini girer")
    public void kullanıcı_e_devlet_şifresi_kullanarak_sisteme_giriş_yapmak_için_tc_kimlik_numarası_ve_e_devlet_şifresini_girer() {
        eDevletKimlikDogrulamaSayfasi.TCNoKutusu.sendKeys(ConfigurationReader.getProperty("TCKimlikNo"));
        eDevletKimlikDogrulamaSayfasi.SifreKutusu.sendKeys(ConfigurationReader.getProperty("sifre"));
    }
    @When("Kullanıcı Giriş butonuna tıklar")
    public void kullanıcı_giriş_butonuna_tıklar() {
        eDevletKimlikDogrulamaSayfasi.girisButonu.click();
    }
    @Then("Kulllanıcı bilgilendirme yazısını görür")
    public void kulllanıcı_bilgilendirme_yazısını_görür() {
        Assert.assertTrue(nüfusVeVatandaşlıkİşleri.bilgilendirmeYazısı.isDisplayed());
    }
    @When("Kullanıcı Yukarıdaki bilgilendirme yazısını okudum onay kutusunu işaretler")
    public void kullanıcı_yukarıdaki_bilgilendirme_yazısını_okudum_onay_kutusunu_işaretler() {
        nüfusVeVatandaşlıkİşleri.yukarıdakiBilYazOkdumRadioButton.click();
    }
    @When("Kullanıcı Devam Et butonuna tıklar")
    public void kullanıcı_devam_et_butonuna_tıklar() {
        nüfusVeVatandaşlıkİşleri.devamEtButonu.click();
    }
    @Then("Kullanıcı Sorgulama Formu sayfasına erişir")
    public void kullanıcı_sorgulama_formu_sayfasına_erişir() {
        Assert.assertTrue(nüfusVeVatandaşlıkİşleri.sorgulamayaEsasBilgilerinizBaslıgı.isDisplayed());
    }
    @When("Kullanıcı {string} seçer")
    public void kullanıcı_seçer(String NfsKayıtOrnTipi) {
        Select NfsKayitOrnAcilirPencere = new Select(nüfusVeVatandaşlıkİşleri.nufusKayitOrnTipiAcilirPencere);
        NfsKayitOrnAcilirPencere.selectByVisibleText(NfsKayıtOrnTipi);
        BrowserUtils.sleep(1);
    }
    @When("Kullanıcı Eski Eş Listele kısmından {string} birini seçer")
    public void kullanıcı_eski_eş_listele_kısmından_birini_seçer(String evetHayır) {
         if (evetHayır.equals("Evet")){
             nüfusVeVatandaşlıkİşleri.eskiEsListeleEvet.click();
         }else {
             nüfusVeVatandaşlıkİşleri.eskiEsListeleHayır.click();
         }
    }
    @When("Kullanıcı Vukuatlı Belge \\(Olayları Göster) kısmından {string}  birini seçer")
    public void kullanıcı_vukuatlı_belge_olayları_göster_kısmından_birini_seçer(String evetHayır) {
        if (evetHayır.equals("Evet")){
            nüfusVeVatandaşlıkİşleri.vukuatlıBelgeEvet.click();
        }else {
            nüfusVeVatandaşlıkİşleri.vukuatlıBelgeHayır.click();
        }
    }
    @When("Kullanıcı Belgenin Neden Verileceği açılır listesinden {string} seçeneğini seçer")
    public void kullanıcı_belgenin_neden_verileceği_açılır_listesinden_kuruma_ibraz_seçeneğini_seçer(String tip) {

        Select belgeNedenVerilecekAcilirPencere = new Select(nüfusVeVatandaşlıkİşleri.belgeninNedenVerilecegiAcılırPencere);
        if(tip.contains("Kişi")){
            belgeNedenVerilecekAcilirPencere.selectByIndex(3);
            return;
        }
        belgeNedenVerilecekAcilirPencere.selectByVisibleText(tip);
    }
    @When("Kullanıcı Kurum Adını kutucuğa yazar")
    public void kullanıcı_kurum_adını_kutucuğa_yazar() {
        nüfusVeVatandaşlıkİşleri.kurumAdiKutusu.sendKeys(faker.name().fullName());
        BrowserUtils.sleep(2);
    }
    @When("Kullanıcı Sorgula butonuna tıklar")
    public void kullanıcı_sorgula_butonuna_tıklar() {
        nüfusVeVatandaşlıkİşleri.sorgulaButonu.click();
        BrowserUtils.sleep(2);
    }

    @Then("Kullanıcı Sorgulama Sonucu sayfasına erişir")
    public void kullanıcı_sorgulama_sonucu_sayfasına_erişir() {
        Assert.assertTrue(nüfusVeVatandaşlıkİşleri.kayıtlıBelgelerimButonu.isDisplayed());
        BrowserUtils.sleep(2);
    }

    //2. senaryo
    @And("Kullanıcı Sayı numarasını kutucuğa yazar")
    public void kullanıcıSayıNumarasınıArasıKutucuğaYazar() {
        nüfusVeVatandaşlıkİşleri.sayiKutucugu.sendKeys(""+faker.number().numberBetween(0,9));
        BrowserUtils.sleep(2);
    }

    @And("Kullanıcı {string} kutucuğa yazar")
    public void kullanıcıKutucuğaYazar(String tarih) {
        nüfusVeVatandaşlıkİşleri.tarihKutucugu.sendKeys(tarih);
        BrowserUtils.sleep(3);
    }
}
