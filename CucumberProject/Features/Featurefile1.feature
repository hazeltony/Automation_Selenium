Feature: Search Feature of tricentis application

  Scenario: Verify search scenario
    Given User is on homepage
    When user search bmw in search field
    Then new window should open with search results
    
    Scenario: Verify search results
    Given Search results are available
    When user click on  first search result
    Then the details should display
