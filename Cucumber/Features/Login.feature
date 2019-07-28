Feature: Login

  Scenario: Test login with valid credentials
  
    Given User launch chrome browser
    When User Enters URL "http://admin-demo.nopcommerce.com/login"
    And user enters email as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then pagetitle should be "Dashboard / nopCommerce administration"