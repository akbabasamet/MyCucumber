@auotoexercise
Feature: Login User with correct email and password
  Scenario: Login User with correct email and password

    Given Navigate to url of automationexercise
    Then Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter correct email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Delete Account button
    And Verify that ACCOUNT DELETED! is visible