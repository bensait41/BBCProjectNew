package co.uk.bbc.pages;

import co.uk.bbc.utilities.BrowserUtils;
import co.uk.bbc.utilities.ConfigurationReader;
import co.uk.bbc.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ArticlesPage {

        public ArticlesPage(){PageFactory.initElements(Driver.get(),this);}

        @FindBy(css = "input#orb-search-q")
        public WebElement searchBox;

        @FindBy(xpath = "//button[@class='se-searchbox__submit']")
        public WebElement searchButton;

        @FindBy(xpath = "//a[@class='ssrcss-bxvqns-PromoLink e1f5wbog0']")
        public List<WebElement> sportsHeadings;



}
