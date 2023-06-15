
Feature: Nüfus ve Vatandaşlık işlemleri Nüfus Kayıt Örneği
  User Story: Kullancı olarak Nüfus ve Vatandaşlık işlemleri sayfasını görüntülemeli ve Nüfus Kayıt
  Örneği Belgesi Sorgulayabilmeli

  Background: kullanıcı e-devlet anasayfasında
    Given Kullanıcı e-devlet anasayfasında

  Scenario Outline: Kullanıcının Kuruma İbraz nedeni ile Nüfus Kayıt Örneği Belgesi Sorgulaması
    When Kullanıcı arama motoruna 'nüfus kayıt örneği' yazar
    Then Kullanıcı çıkan sonuçlardan 'Nüfus Kayıt Örneği Belgesi Sorgulama' linkini görür
    When  Kullanıcı Nüfus Kayıt Örneği Belgesi Sorgulama linkine tıklar
    Then Kullanıcı 'Nüfus Kayıt Örneği Belgesi Sorgulama' modülüne erişim sağlar
    When Kullanıcı Kimliğimi Şimdi Doğrula butonuna tıklar
    Then Kullanıcı Kimlik Doğrulama Sistemi sayfasına yönlendirilir
    And Kullanıcı e-devlet şifresi kullanarak sisteme giriş yapmak için TC Kimlik numarası ve e-devlet şifresini girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kulllanıcı bilgilendirme yazısını görür
    When Kullanıcı Yukarıdaki bilgilendirme yazısını okudum onay kutusunu işaretler
    And Kullanıcı Devam Et butonuna tıklar
    Then Kullanıcı Sorgulama Formu sayfasına erişir
    When Kullanıcı "<Nüfus Kayıt Örneği Tipini>" seçer
    And Kullanıcı Eski Eş Listele kısmından "<Evet veya Hayır>" birini seçer
    And Kullanıcı Vukuatlı Belge (Olayları Göster) kısmından "<Evet veya Hayır>"  birini seçer
    And Kullanıcı Belgenin Neden Verileceği açılır listesinden "Kuruma İbraz" seçeneğini seçer
    And Kullanıcı Kurum Adını kutucuğa yazar
    And Kullanıcı Sorgula butonuna tıklar
    Then Kullanıcı Sorgulama Sonucu sayfasına erişir

    Examples:
      | Nüfus Kayıt Örneği Tipini | Evet veya Hayır |
      | Kişi                      | Evet            |
      | Aile                      | Hayır           |
      | Nüfus Aile                | Evet            |


  Scenario Outline: Kullanıcının Kurum Talebi nedeni ile Nüfus Kayıt Örneği Belgesi Sorgulaması
    When Kullanıcı arama motoruna 'nüfus kayıt örneği' yazar
    Then Kullanıcı çıkan sonuçlardan 'Nüfus Kayıt Örneği Belgesi Sorgulama' linkini görür
    When  Kullanıcı Nüfus Kayıt Örneği Belgesi Sorgulama linkine tıklar
    Then Kullanıcı 'Nüfus Kayıt Örneği Belgesi Sorgulama' modülüne erişim sağlar
    When Kullanıcı Kimliğimi Şimdi Doğrula butonuna tıklar
    And Kullanıcı Kimlik Doğrulama Sistemi sayfasına yönlendirilir
    And Kullanıcı e-devlet şifresi kullanarak sisteme giriş yapmak için TC Kimlik numarası ve e-devlet şifresini girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kulllanıcı bilgilendirme yazısını görür
    When Kullanıcı Yukarıdaki bilgilendirme yazısını okudum onay kutusunu işaretler
    And Kullanıcı Devam Et butonuna tıklar
    Then Kullanıcı Sorgulama Formu sayfasına erişir
    When Kullanıcı "<Nüfus Kayıt Örneği Tipini>" seçer
    And Kullanıcı Eski Eş Listele kısmından "<Evet veya Hayır>" birini seçer
    And Kullanıcı Vukuatlı Belge (Olayları Göster) kısmından "<Evet veya Hayır>"  birini seçer
    And Kullanıcı Belgenin Neden Verileceği açılır listesinden "Kurum Talebi" seçeneğini seçer
    And Kullanıcı Kurum Adını kutucuğa yazar
    And Kullanıcı Sayı numarasını kutucuğa yazar
    And Kullanıcı "<tarih>" kutucuğa yazar
    And Kullanıcı Sorgula butonuna tıklar
    Then Kullanıcı Sorgulama Sonucu sayfasına erişir

    Examples:
      | Nüfus Kayıt Örneği Tipini | Evet veya Hayır | tarih      |
      | Kişi                      | Evet            | 02/06/2023 |
      | Aile                      | Hayır           | 03/06/2023 |
      | Nüfus Aile                | Evet            | 04/06/2023 |


  Scenario Outline: Kullanıcının Kişi Talebi nedeni ile Nüfus Kayıt Örneği Belgesi Sorgulaması
    When Kullanıcı arama motoruna 'nüfus kayıt örneği' yazar
    Then Kullanıcı çıkan sonuçlardan 'Nüfus Kayıt Örneği Belgesi Sorgulama' linkini görür
    When Kullanıcı Nüfus Kayıt Örneği Belgesi Sorgulama linkine tıklar
    Then Kullanıcı 'Nüfus Kayıt Örneği Belgesi Sorgulama' modülüne erişim sağlar
    When Kullanıcı Kimliğimi Şimdi Doğrula butonuna tıklar
    And Kullanıcı Kimlik Doğrulama Sistemi sayfasına yönlendirilir
    And Kullanıcı e-devlet şifresi kullanarak sisteme giriş yapmak için TC Kimlik numarası ve e-devlet şifresini girer
    And Kullanıcı Giriş butonuna tıklar
    Then Kulllanıcı bilgilendirme yazısını görür
    When Kullanıcı Yukarıdaki bilgilendirme yazısını okudum onay kutusunu işaretler
    And Kullanıcı Devam Et butonuna tıklar
    Then Kullanıcı Sorgulama Formu sayfasına erişir
    When Kullanıcı "<Nüfus Kayıt Örneği Tipini>" seçer
    And Kullanıcı Eski Eş Listele kısmından "<Evet veya Hayır>" birini seçer
    And Kullanıcı Vukuatlı Belge (Olayları Göster) kısmından "<Evet veya Hayır>"  birini seçer
    And Kullanıcı Belgenin Neden Verileceği açılır listesinden "<Kişi Talebi>" seçeneğini seçer
    And Kullanıcı Sorgula butonuna tıklar
    Then Kullanıcı Sorgulama Sonucu sayfasına erişir

    Examples:
      | Nüfus Kayıt Örneği Tipini | Evet veya Hayır |
      | Kişi                      | Evet            |
      | Aile                      | Hayır           |
      | Nüfus Aile                | Evet            |





