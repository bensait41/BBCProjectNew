@TestFeature1
Feature: As a business user, I would like to make a record of all teams which are playing today
  Scenario: Output all team names with a match today. If there are no matches today,
            output a message to convey this.

        Given the user navigate to the scores-fixtures page
        Then all the team names should be printed if there are any matches today
        And when no matches today, 'There are NO matches!' message should be printed
