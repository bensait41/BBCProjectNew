@TestFeature2
Feature: As a sports user, I would like to read about all articles related to sports
  Scenario: Use the search option to find all articles related to ‘sports’.
            Output the first heading and the last heading returned on the page.

      Given the user navigate to the scores-fixtures page
      When the user types 'sports' in the search box and hit ENTER
      Then the user should get the first and the last heading from articles