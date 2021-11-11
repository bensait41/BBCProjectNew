package co.uk.bbc.stepDefinitions;

import co.uk.bbc.pages.TodaysMatchPage;
import co.uk.bbc.utilities.BrowserUtils;
import co.uk.bbc.utilities.ConfigurationReader;
import co.uk.bbc.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class TodaysMatchStepDefs {

    TodaysMatchPage tMatches = new TodaysMatchPage();

    @Given("the user navigate to the scores-fixtures page")
    public void the_user_navigate_to_the_scores_fixtures_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(2);
    }

    @Then("all the team names should be printed if there are any matches today")
    public void all_the_team_names_should_be_printed_if_there_are_any_matches_today() {
        if(tMatches.teamNames.size()!=0) {
            for (WebElement teamName : tMatches.teamNames) {
                System.out.println(teamName.getText());
            }

        }
        Assert.assertTrue("There are NO teams with a match today",tMatches.teamNames.size()!=0);
    }

    @Then("when no matches today, {string} message should be printed")
    public void when_no_matches_today_message_should_be_printed(String message) {

            if(tMatches.teamNames.size()==0) {
                Assert.assertEquals(0, tMatches.teamNames.size());
                System.out.println("Sorry! " + message);
            }
        }

}