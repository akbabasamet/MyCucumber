Feature: Choosing a phone

  Scenario: TC01 kullanici listeye telefon ekler
    Given websayfasina gider
    And click on Phones & PDAs
    And get the brandName of phones
    And click on add to button for all elements
    Then click on black total added cart button
    Then get the names of list from the cart
    And compare the names from displaying list and cart list