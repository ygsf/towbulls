Feature: Tow Bulls QA2 Test

  Background: Start web
    Given I start browser

  Scenario: Task QA2
    Given I navigate to automationpractice
    When I Sing In using qa@testing.com/123456
    And I wait for 5 sec
    Then I am signed in

