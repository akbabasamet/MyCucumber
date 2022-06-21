Feature: US1007 Kullanici amazonda istedıgı kelımeyı aratır.
  Scenario Outline: TC12 amazonda listedeki kelımelerı aratma
    Given kullanici "amazonUrl" anasayfasinda
    Then kullanici "<istenenKelime>" icin arama yapar
    Then sonuclarin "<istenenKelimeKontrol>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      |istenenKelime|istenenKelimeKontrol|
      |nutella      |nutella      |
      |java         |java         |
      |elma         |elma         |
      |armut        |armut         |