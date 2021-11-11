package co.uk.bbc.stepDefinitions;

import co.uk.bbc.pages.NegativeLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginStepDefs {

    NegativeLoginPage negativeLP = new NegativeLoginPage();

    @Given("the user clicks the sign-in")
    public void the_user_clicks_the_sign_in() {

    }

    @When("press the sign-in button")
    public void press_the_sign_in_button() {

    }

    @Then("the user should see {string}")
    public void the_user_should_see(String string) {

    }

    @Then("the user should see {string} message for username")
    public void the_user_should_see_message_for_username(String string) {

    }

    @Then("the user should see {string} message for password")
    public void the_user_should_see_message_for_password(String string) {

    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String string) {

    }

    @When("the user enters username that include characters not from these {string}")
    public void the_user_enters_username_that_include_characters_not_from_these(String string) {

    }

    @When("the username enters more than 50# characters")
    public void the_username_enters_more_than_characters() {

    }

    @When("the user enters email with wrong format")
    public void the_user_enters_email_with_wrong_format() {

    }

    @When("the user enters email with correct format")
    public void the_user_enters_email_with_correct_format() {

    }

    @Then("And the user should see {string} message for password")
    public void and_the_user_should_see_message_for_password(String string) {

    }

    @When("the user enters password less than 8# characters")
    public void the_user_enters_password_less_than_characters() {

    }

    @When("the user enters password without any letter")
    public void the_user_enters_password_without_any_letter() {

    }

    @When("the user enters password with more than 50# characters")
    public void the_user_enters_password_with_more_than_characters() {

    }



}
