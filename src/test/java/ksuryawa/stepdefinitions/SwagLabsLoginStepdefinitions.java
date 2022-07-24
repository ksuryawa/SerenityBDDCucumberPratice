package ksuryawa.stepdefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ksuryawa.pages.SwagLabsHomePage;
import ksuryawa.pages.SwagLabsLoginPage;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;

import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * @author Kapil Suryawanshi
 * 23/07/2022
 */
public class SwagLabsLoginStepdefinitions {

	@Steps
	SwagLabsLoginPage loginPage;

	@Steps
	SwagLabsHomePage homePage;

	@Given("I am on the SwagLabs login page")
	public void i_am_on_the_swag_labs_login_page() {
		loginPage.open();
	}
	@When("I enter valid username and password")
	public void i_enter_valid_username_and_password() {
		loginPage.loginToHRM("standard_user", "secret_sauce");
	}
	@Then("I should be able to login successfully")
	public void i_should_be_able_to_login_successfully() {
		Assert.assertTrue(homePage.getPageTitle().equalsIgnoreCase("Products"));
	}

	@After
	public void tearDown() {
		System.out.println("Tearing down");
		try {
			Desktop.getDesktop().browse(new File("/Users/kapilsuryawanshi/src/SerenityBDDCucumberPratice/target/site/serenity/index.html").toURI());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@When("I enter valid {string} and {string}")
	public void iEnterValidUsernameAndPassword(String username, String password) {
		loginPage.loginToHRM(username, password);
	}
}