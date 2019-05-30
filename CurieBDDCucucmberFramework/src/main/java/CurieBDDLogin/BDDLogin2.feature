Feature: BDDCuucmberLoginFeature

  Scenario Outline: BDD Login Scenario
    Given Url2 of application
    When Url2 is opened
    Then User2 enter "<username>" and "<password>"
    Then User2 user clicks Login button
    Then User2 is on home page
 
 
 Examples:
 |username| password|
 |amit@gmail.com|amit123|
 