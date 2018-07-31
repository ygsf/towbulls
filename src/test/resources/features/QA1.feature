Feature: Tow Bulls QA1 Test

  Background: Start web
    Given I start browser

  Scenario: Task QA1
    Given I navigate to Google home
    When I search for text "Software quality assurance"
    And I click "Software quality assurance - Wikipedia" link
    Then I am on "Software quality assurance - Wikipedia" page
    And Page "Software quality assurance - Wikipedia" contains link to "Quality assurance"
