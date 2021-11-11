package co.uk.bbc.stepDefinitions;

import co.uk.bbc.pages.ArticlesPage;
import co.uk.bbc.utilities.BrowserUtils;
import co.uk.bbc.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class ArticlesStepDefs {

    ArticlesPage aPage = new ArticlesPage();
    String keyword;

    @When("the user types {string} in the search box and hit ENTER")
    public void the_user_types_in_the_search_box_and_hit_ENTER(String keyword) {
        this.keyword=keyword;
        aPage.searchBox.sendKeys(keyword);
        aPage.searchButton.sendKeys(Keys.ENTER);
    }

    @Then("the user should get the first and the last heading from articles")
    public void the_user_should_get_the_first_and_the_last_heading_from_articles() {
        System.out.println(aPage.sportsHeadings.get(0).getText());
        System.out.println(aPage.sportsHeadings.get(aPage.sportsHeadings.size() - 1).getText());
        //Assert.assertTrue(Driver.get().getTitle().contains(keyword));
    }
}
