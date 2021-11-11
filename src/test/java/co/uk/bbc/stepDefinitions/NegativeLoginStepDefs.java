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
        negativeLP.emailUsernameInputBox.sendKeys("AB*");
    }

    @Then("the user should see invalid Char message {string}")
    public void the_user_should_see_invalid_Char_message(String invalidCharMessage) {
        String expectedResult = invalidCharMessage;
        String actualResult = negativeLP.userInvalidCharError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters username more than 50# characters")
    public void the_user_enters_username_more_than_characters() {
        negativeLP.emailUsernameInputBox.sendKeys("123456789012345678901234567890123456789012345678901");
    }

    @Then("the user should see username too long {string}")
    public void the_user_should_see_username_too_long(String userTooLongMessage) {
        String expectedResult = userTooLongMessage;
        String actualResult = negativeLP.userTooLongError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters email with wrong format")
    public void the_user_enters_email_with_wrong_format() {
        negativeLP.emailUsernameInputBox.sendKeys("a@.cm");
    }

    @Then("the user should see not proper email {string}")
    public void the_user_should_see_not_proper_email(String notProperEmailMesaage) {
        String expectedResult = notProperEmailMesaage;
        String actualResult = negativeLP.notProperEmailError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters email with correct format")
    public void the_user_enters_email_with_correct_format() {
        negativeLP.emailUsernameInputBox.sendKeys("a@b.com");
    }

    @When("the user enters password less than 8# characters")
    public void the_user_enters_password_less_than_characters() {
        negativeLP.passwordInputBox.sendKeys("1A2b");
    }

    @Then("the user should see too short password {string}")
    public void the_user_should_see_too_short_password(String passLessThanEightCharMessage) {
        String expectedResult = passLessThanEightCharMessage;
        String actualResult = negativeLP.passLessThanEightCharError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("the user enters password without any letter")
    public void the_user_enters_password_without_any_letter() {
        negativeLP.passwordInputBox.sendKeys("123456789");
    }

    @When("the user enters password with more than 50# characters")
    public void the_user_enters_password_with_more_than_characters() {
        negativeLP.passwordInputBox.sendKeys("123456789012345678901234567890123456789012345678901");
    }

    @Then("the user should see password miss a letter {string}")
    public void the_user_should_see_password_miss_a_letter(String passMissALetterMessage) {
        String expectedResult = passMissALetterMessage;
        String actualResult = negativeLP.passMissALetterError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Then("the user should see too long password {string}")
    public void the_user_should_see_too_long_password(String passTooLongMessage) {
        String expectedResult = passTooLongMessage;
        String actualResult = negativeLP.passTooLongError.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }



}
