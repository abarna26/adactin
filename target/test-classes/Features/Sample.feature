@Fun2
Feature: Verifying Adactinhotel detailss

  Scenario Outline: Verifying adatinhotel login with valid credentials
    Given As a User enter "<username>" and "<password>" and click login button
    When As a user verify the message
    Then As a user select "<location>" and "<hotel>" and "<roomtype>" and"<noofrooms>" andclick the search button
    And As a user click select and continue button
    Then As a user enter "<firstname>" and"<lastname>" and "<address>" and "<ccno>" and "<cctype>" and "<month>" and"<year>"and"<cvvno>" and click book now button

    Examples: 
      | username   | password | location | hotel       | roomtype | noofrooms | firstname | lastname | address   | ccno             | cctype | month    | year | cvvno |
      | Abarnaappu | abi@ppu  | Sydney   | Hotel Creek | Standard | 1 - One   | Abi       | appu     | Thanjavur | 2345665432234567 | VISA   | December | 2022 |  4598 |
