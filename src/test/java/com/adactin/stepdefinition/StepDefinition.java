package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
//import io.cucumber.java.en.*;

public class StepDefinition {

	@Given("user launch the application")
	public void user_launch_the_application() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vigneshwari\\eclipse-workspace\\Cucumber\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

	}

	@When("user enter the valid username in username field")
	public void user_enter_the_valid_username_in_username_field() {

	}

	@When("user enter the valid password in password field")
	public void user_enter_the_valid_password_in_password_field() {

	}

	@When("user click on login button")
	public void user_click_on_login_button() {

	}

	@Then("user confirm it navigates to the homepage")
	public void user_confirm_it_navigates_to_the_homepage() {

	}

}