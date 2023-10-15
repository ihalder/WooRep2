package com;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.HomePage;
import page.ProfilePage;

public class LoginStepDefinition extends BaseTest{
	
	HomePage homepage;
	ProfilePage profilepage;
	
	//Cucumber Hooks
	@Before
	public void start() {
		
		System.out.println("It will run before the scenario");
	}
	
	@After
	public void end() {
		
		System.out.println("It will run end of the scenario");
		
	}
	
	//Cucumber Hooks customized
	@Before("@Smoke")
	public void startAgainistTags() {
		
		System.out.println("It will run before the scenario");
	}
	
	@After("@Smoke")
	public void endAgainistTags() {
		
		System.out.println("It will run end of the scenario");
		
	}

	//@Given("^open browser$")
	public void open_browser() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		//openBrowser();
	}
	
	//List of List
	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
	   List<List<String>>  browsers = arg1.asLists(String.class);
	   String browser = browsers.get(0).get(0);
	   
	   openBrowser(browser);
	}

	@Given("^navigate to facebook\\.com$")
	public void navigate_to_facebook_com() {
		// Write code here that turns the phrase above into concrete actions
		//gotoURL();
	}

	@When("^user type valid user ID$")
	public void user_type_valid_user_ID() {
		// Write code here that turns the phrase above into concrete actions
		//homepage = new HomePage(dr);
		//homepage.typeUserID();
		
		
	}
	
	//List of Map
	@When("^user type valid user ID And password$")
	public void user_type_valid_user_ID_And_password(DataTable arg1) throws Throwable {
	  List<Map<String, String>> credentials =  arg1.asMaps(String.class, String.class);
	  String user = credentials.get(1).get("user ID");
	  String password = credentials.get(1).get("Password");

	}

	@When("^user type valid password$")
	public void user_type_valid_password() {
		// Write code here that turns the phrase above into concrete actions
		//homepage.typePassword();
	}

	@When("^user click login button$")
	public void user_click_login_button() {
		// Write code here that turns the phrase above into concrete actions
		
		//profilepage = homepage.clickButton();
		
		
	}

	@Then("^user should see their profile page$")
	public void user_should_see_their_profile_page() {
		// Write code here that turns the phrase above into concrete actions
		//profilepage.verifyProfilePage();
	}
	
	@When("^user type invalid \"([^\"]*)\" in userID textBox$")
	public void user_type_invalid_in_userID_textBox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    homepage.typeUserID(arg1);
	}

	@When("^user type invalid \"([^\"]*)\" in password textBox$")
	public void user_type_invalid_in_password_textBox(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^user should not see their profile page$")
	public void user_should_not_see_their_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

}
