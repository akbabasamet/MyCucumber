@dataTable
Feature: US1009 DAtatables sitesinde 5 fakli giris yapalim
  
  Scenario Outline: TC14 kullanici 5 farkli giris yapabilmeli

    When kullanici "datatablesUrl" anasayfasinda
    Then new butonuna basar
    And isim bolumune "<firstname>" yazar
    And soyisim bolumune "<lastName>" yazar
    And position bolumune "<position>" yazar
    And office bolumune "<office>" yazar
    And extension bolumune "<extension>" yazar
    And startDate bolumune "<startDate>" yazar
    And salary bolumune "<salary>" yazar
    And Create tusuna basar
    When kullanici "<firstname>" arama yapar
    Then isim bolumunde "<firstname>" oldugunu test eder
    And sayfayi kapatir

    Examples:
    |firstname|lastName|position|office|extension|startDate|salary|
    |Alim     |Zor     |qa      |ankara|UI       |2021-10-11|10000|
    |Berk     |Can     |tester  |ankara|api      |2022-05-05|11000|
    |Huseyin  |Kacmaz  |BA      |berlin|-        |2022-07-10|40000|
    |Fatih    |Sahin   |PO      |berlin|-        |2022-03-12|45000|
    |Ahmet    |Kaya    |Tester  |ankara|database |2022-06-06|11000|