
Feature: Tricentis Login feature
#note
 

  Scenario Outline: Test login feature with multiple test data
    Given user is on login page
    When user enters <username> and <password> on login page
    Then Home page should be displayed

    Examples: 
      | username | 		 password 	 | 
      | anand123 |     Monday@123  | 
      | anand567 |     Tuesday&123 | 
