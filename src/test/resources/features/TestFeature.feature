Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to google
    Then I will be on Google
    Then I will click on Gmail
    Then I will be on Gmail - Free Storage and Email from Google
  