@Fun1
Feature: Verifying Adactinhotel details

  Scenario Outline: Verifying adatinhotel login with valid credentials
    Given As a User enter "<username>" and "<password>" and click login button
    When As a user verify the message
    Then As a user select "<location>" and "<hotel>" and "<roomtype>" and"<noofrooms>" andclick the search button
    And As a user click select and continue button
    Then As a user enter "<firstname>" and"<lastname>" and "<address>" and "<ccno>" and "<cctype>" and "<month>" and"<year>"and"<cvvno>" and click book now button

    Examples: 
      | username   | password | location | hotel       | roomtype | noofrooms | firstname | lastname | address   | ccno             | cctype | month    | year | cvvno |
      | Abarnaappu | abi@ppu  | Sydney   | Hotel Creek | Standard | 1 - One   | Abi       | appu     | Thanjavur | 2345665432234567 | VISA   | December | 2022 |  4598 |

  @reg @smoke
  Scenario Outline: Verifying adatinhotel login with valid credentials
    Given As a User enter "<username>" and "<password>" and click login button
    When As a user verify the message
    Then As a user select "<location>" and "<hotel>" and "<roomtype>" and"<noofrooms>" andclick the search button
    And As a user click select and continue button
    Then As a user enter "<firstname>" and"<lastname>" and "<address>" and "<ccno>" and "<cctype>" and "<month>" and"<year>"and"<cvvno>" and click boo

    Examples: 
      | username   | password | location | hotel          | roomtype     | noofrooms | firstname | lastname | address | ccno             | cctype           | month     | year | cvvno |
      | Abarnaappu | abi@ppu  | Brisbane | Hotel Sunshine | Super Deluxe | 5 - Five  | Arun      | raj      | Cheenai | 2345686789009876 | American Express | September | 2021 |  2620 |

  @sanity @smoke
  Scenario Outline: Verifying adatinhotel login with valid credentials
    Given As a User enter "<username>" and "<password>" and click login button
    When As a user verify the message
    Then As a user select "<location>" and "<hotel>" and "<roomtype>" and"<noofrooms>" andclick the search button
    And As a user click select and continue button
    Then As a user enter "<firstname>" and"<lastname>" and "<address>" and "<ccno>" and "<cctype>" and "<month>" and"<year>"and"<cvvno>" and click boo

    Examples: 
      | username   | password | location | hotel        | roomtype | noofrooms | firstname | lastname | address | ccno             | cctype      | month     | year | cvvno |
      | Abarnaappu | abi@ppu  | Sydney   | Hotel Hervey | Standard | 10 - Ten  | preethi   | nachi    | Velur   | 2345678910987564 | Master Card | September | 2021 |  3126 |

  @UAT
  Scenario Outline: Verifying adatinhotel login with Invalid credentials
    Given As a User enter "<username>" and "<password>" and click login button
    When As a user verify the message
    Then As a user select "<location>" and "<hotel>" and "<roomtype>" and"<noofrooms>" andclick the search button
    And As a user click select and continue button
    Then As a user enter "<firstname>" and"<lastname>" and "<address>" and "<ccno>" and "<cctype>" and "<month>" and"<year>"and"<cvvno>" and click boo

    Examples: 
      | username   | password | location | hotel        | roomtype | noofrooms | firstname | lastname | address | ccno             | cctype      | month     | year | cvvno |
      | Abarnaappu | abiAppu  | Sydney   | Hotel Hervey | Standard | 10 - Ten  | preethi   | nachi    | Velur   | 2345678910987564 | Master Card | September | 2021 |  3126 |
