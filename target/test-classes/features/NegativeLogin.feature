@TestFeature3
Feature: As a QA, I would like to verify all negative scenarios for login
  #Scenario: Select ‘Sign in’, and enter as many negative scenarios as possible.
  #          Verify that a error message is displayed and the text that it contains is as expected.

  Background:
    Given the user navigate to the scores-fixtures page
    And the user clicks the sign-in

  Scenario: both username and password is empty
    When press the sign-in button
    Then the user should see "Sorry, those details don't match. Check you've typed them correctly."
    And the user should see "Something's missing. Please check and try again." message for username
    And the user should see "Something's missing. Please check and try again." message for password

  Scenario: Username has one valid character only and password is empty
    When the user enters username 'A'
    And press the sign-in button
    Then the user should see sorry message "Sorry, that username's too short. It needs to be at least two characters."

  Scenario: Username has at least two valid characters and password is empty
    When the user enters username 'A5'
    And press the sign-in button
    Then the user should see "Sorry, those details don't match. Check you've typed them correctly."
    And the user should see "Something's missing. Please check and try again." message for password

  Scenario: Username has two or more characters but include characters not from these ?/|}{+=_-^~`%$#
  and password is empty
    When the user enters username that include characters not from these '?/|}{+=_-^~`%$#'
    And press the sign-in button
    Then the user should see invalid Char message "Usernames can only include... Letters, numbers and these characters: ?/|}{+=_-^~`%$#"

  Scenario: Username has more than 50 characters and password is empty
    When the user enters username more than 50# characters
    And press the sign-in button
    Then the user should see username too long "Sorry, that username's too long. It can't be more than 50 characters."

  Scenario: Email is in the wrong format and password is empty
    When the user enters email with wrong format
    And press the sign-in button
    Then the user should see not proper email "Sorry, that email doesn’t look right. Please check it's a proper email."

  Scenario: Email entered correct format and password is empty
    When the user enters email with correct format
    And press the sign-in button
    Then the user should see "Sorry, those details don't match. Check you've typed them correctly."
    And the user should see "Something's missing. Please check and try again." message for password

  Scenario: the Email/Username is empty and password contains less than 8 characters
    When the user enters password less than 8# characters
    And press the sign-in button
    Then the user should see too short password "Sorry, that password is too short. It needs to be eight characters or more."

  Scenario: the Email/Username is empty and password has 8 or more chars but does not include any letter
    When the user enters password without any letter
    And press the sign-in button
    Then the user should see password miss a letter "Sorry, that password isn't valid. Please include a letter."

  Scenario: the Email/Username is empty and password has more than 50 characters
    When the user enters password with more than 50# characters
    And press the sign-in button
    Then the user should see too long password "Sorry, that password is too long. It can't be more than 50 characters."


    #Sorry, we can’t find an account with that username. If you're over 13, try your email address instead or get help here.
    #That's not the right password for that account. Please try again or get help here.
  #Sorry, we can’t find an account with that email. You can register for a new account or get help here.

