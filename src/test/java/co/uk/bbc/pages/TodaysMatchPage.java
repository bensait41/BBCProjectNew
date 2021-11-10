package co.uk.bbc.pages;

import java.util.List;
import co.uk.bbc.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TodaysMatchPage {

    public TodaysMatchPage() {PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//span[@class='gs-u-display-none gs-u-display-block@m qa-full-team-name sp-c-fixture__team-name-trunc']")
    public List<WebElement> teamNames;

}
