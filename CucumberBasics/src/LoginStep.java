import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	@Given("^user navigate to facebook website$")
	public void user_navigate_to_facebook_website() throws Throwable {
     
	System.out.println("@Given -- user navigates to Facebook.com");
	
	}
	@When("^user validate the homepage title$")
	public void user_validate_the_homepage_title() throws Throwable {
      System.out.println("@When - user validate the homepage title");
	}

	@Then("^user entered \"([a-zA-Z]{1,})\" username$")
	public void user_entered_valid_username(String userName) throws Throwable {
		System.out.println("@Then  user entered "+ userName +" username");
	  
	}

	@Then("^user entered \"([a-zA-Z]{1,})\" password$")
	public void user_entered_valid_password(String password) throws Throwable {
		System.out.println("@Then - user entered " + password +" password ");
	}

	@Then("^user \"([a-zA-Z]{1,})\" successfully logged in$")
	public void user_shouldbe_successfully_logged_in(String validateLogin) throws Throwable {
		System.out.println("@Then - user " + validateLogin+" successfully logged in");
	}



}
