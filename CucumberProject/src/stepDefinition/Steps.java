package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	@Given("^User is on homepage$")
	public void user_is_on_homepage(){
		
		System.out.println("Navigate to homepage");
	    
	}

	@When("^user search bmw in search field$")
	public void user_search_bmw_in_search_field()  {
		
		System.out.println("Enter search keyword in search field");
	    
	}

	@Then("^new window should open with search results$")
	public void new_window_should_open_with_search_results()  {
		
	    System.out.println("Search results should match with search keyword");
	}

	@Given("^Search results are available$")
	public void search_results_are_available() {
	
		System.out.println("Search results are displayed");
	}

	@When("^user click on  first search result$")
	public void user_click_on_first_search_result() {
		
		System.out.println("Click on search result");
	}

	@Then("^the details should display$")
	public void the_details_should_display() {
		
		System.out.println("The details should be displayed");
	}

	@Given("^user is on login page$")
	public void user_is_on_login_page()  {
	    System.out.println("User is on login page");
	}	
	
	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed()  {
	   System.out.println("Home page is displayed");
	}
	
	@When("^user enters (.*?) and (.*?) on login page$")
	public void enterCredentials(String username,String password) {
		
		System.out.println("Enter username ="+username);
		System.out.println("Enter password=" +password);
	}
}
