Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to http://google.co.uk
    Then I will be on Google
    Then I click on the link
    Then I will be on Gmail - Free Storage and Email from Google
