package co.uk.bbc.stepDefinitions;

import co.uk.bbc.pages.NegativeLoginPage;
import co.uk.bbc.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NegativeLoginStepDefs {

    NegativeLoginPage negativeLP = new NegativeLoginPage();

    @Given("the user clicks the sign-in")
    public void the_user_clicks_the_sign_in() {
        negativeLP.singIn.click();
    }

    @When("press the sign-in button")
    public void press_the_sign_in_button() {
        negativeLP.singInButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("the user should see {string}")
    public void the_user_should_see(String message1) {
        String expectedResult = message1;
        String actualResult = negativeLP.dontMatchError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("the user should see {string} message for username")
    public void the_user_should_see_message_for_username(String messageUser) {
        String expectedResult = messageUser;
        String actualResult = negativeLP.userMissingError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("the user should see {string} message for password")
    public void the_user_should_see_message_for_password(String messagePass) {
        String expectedResult = messagePass;
        String actualResult = negativeLP.passMissingError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String enterUser) {
        negativeLP.emailUsernameInputBox.sendKeys(enterUser);
    }

    @Then("the user should see sorry message {string}")
    public void the_user_should_see_sorry_message(String userSorryMessage) {
        String expectedResult = userSorryMessage;
        String actualResult = negativeLP.userInsufficientCharacterError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters username that include characters not from these {string}")
    public void the_user_enters_username_that_include_characters_not_from_these(String validChars) {


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
