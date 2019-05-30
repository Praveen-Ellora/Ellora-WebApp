Feature: BDDCuucmberLoginFeature

  Scenario Outline: BDD Login Scenario
    Given Url of application
    When url is opened
    Then user enter "<username>" and "<password>"
    Then user user clicks Login button
    Then click all main menu at the top
    Then user is on home page
 
 
 Examples:
 |username| password|
 |amit@gmail.com|amit123|
 