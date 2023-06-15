@wip
Feature:  Nöbetçi eczane sorgulama
  User Story: Kullanıcı olarak nöbetçi eczaneleri illere göre listelemek

  Background: kullanıcı  e-devlet anasayfasında
    Given Kullanıcı e-devlet anasayfasında


  Scenario Outline: Geçerli tarihe göre nöbetçi eczane arama ve listeleme
    When Kullanıcı arama motoruna "<Nöbetçi eczane>" yazar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkini görür
    When Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkine tıklar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama modülüne erişir
    When Kullanıcı eczane sorgulama sayfasında il açılır listesinden "<il>" seçer
    And Kullanıcı eczane sorgulama sayfasında "<Tarih>" seçer
    And Kullanıcı sorgula butonuna tıklar
    Then Kullanıcı seçilen "<il>" ve "<Tarih>" bilgilerine göre eczane bilgileri tablosunu görür
    When Kullanıcı eczane sorgulama sayfasında ilçe açılır listesinden "<ilçe>" seçer
    Then Kullanıcı seçilen ilçe bilgisini tablo "<ilçe>" sütununda görür
    When Kullanıcı Haritada Göster linkine tıklar
    Then Kullanıcı Eczane Bilgilerini görür

    Examples:
      | Nöbetçi eczane | il      | Tarih      | ilçe    |
      | nöbetçi eczane | ANKARA  | 03/08/2023 | Ayaş    |
      | nöbetci eczane | ANKARA  | 02/06/2023 | Bala    |
      | nöbetçi eçzane | İZMİR   | 29/06/2023 | Konak   |
      | nobetçi eczane | İZMİR   | 14/06/2023 | Bornova |
      | nobetçı eczane | TRABZON | 05/06/2023 | Arsin   |
      | nöbetçı eczane | TRABZON | 09/06/2023 | Of      |

  Scenario: İl ve tarih seçmeden nöbetçi eczane arama ve listeleme
    When Kullanıcı arama motoruna "Nöbetçi eczane" yazar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkini görür
    When Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkine tıklar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama modülüne erişir
    And Kullanıcı sorgula butonuna tıklar
    Then Kullanıcı İl Seçimi başlığının üzerinde "Bu alanın doldurulması zorunludur." uyarı mesajını görür
    And Kullanıcı Nöbet Tarihi başlığının üzerinde "Bu alanın doldurulması zorunludur." uyarı mesajını görür


  Scenario:Tarih seçmeden nöbetçi eczane arama ve listeleme
    When Kullanıcı arama motoruna "Nöbetçi eczane" yazar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkini görür
    When Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkine tıklar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama modülüne erişir
    When Kullanıcı eczane sorgulama sayfasında il açılır listesinden "ANKARA" seçer
    And Kullanıcı sorgula butonuna tıklar
    Then Kullanıcı Nöbet Tarihi başlığının üzerinde "Bu alanın doldurulması zorunludur." uyarı mesajını görür


  Scenario Outline: Geçersiz tarih ile nöbetçi eczane arama ve listeleme
    When Kullanıcı arama motoruna "Nöbetçi eczane" yazar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkini görür
    When Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama(Sağlık Bakanlığı) linkine tıklar
    Then Kullanıcı TİTCK - Nöbetçi Eczane Sorgulama modülüne erişir
    When Kullanıcı eczane sorgulama sayfasında il açılır listesinden "ANKARA" seçer
    And Kullanıcı eczane sorgulama sayfasında "<Geçersiz Tarih>" seçer
    And Kullanıcı sorgula butonuna tıklar
    Then Kullanıcı "Seçilen tarih için sisteme ilgili İl/İlçe Sağlık Müdürlüğü tarafından veri girişi yapılmadığından dolayı nöbetçi eczane bilgisi gösterilememektedir." uyarı mesajını görür

    Examples:
      | Geçersiz Tarih |
      | 27/10/2023     |
      | 20/11/2023     |
      | 03/12/2023     |
