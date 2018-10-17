Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    Given I go to url http://google.co.uk
    Then I should be on my selected page
    When I click on the link hehe
    Then I should be on the next page
