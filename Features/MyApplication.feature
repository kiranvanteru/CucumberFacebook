Feature: Test facebook login

  Scenario Outline: Test Login with valid credentials
    Given open firefox and start application
    When i enter valid "<username>" and valid "<password>"
    Then user should be able to login
    Then Application should be closed

    Examples: 
      | username               | password      |
      | kk23_vanteru@yahoo.com | infoguyusad12 |
      | kk23_vanteru@yahoo.com | infoguyusad12 |
      | kk23_vanteru@yahoo.com | infoguyusad12 |
