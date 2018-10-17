Feature: Visit a page and click on a link

@test
  Scenario: Visit a page and check the page title
    #Given I go to http://google.co.uk
    #Then I will be on Google
    #Then I click on the link
    #Then I will be on Gmail - Free Storage and Email from Google
    Given lambda 1
    When lambda 2
    Then lambda 3 pages.Page., next-button
    And lambda 4
    When I enter my birth date
    Then lambda 3 next-button
