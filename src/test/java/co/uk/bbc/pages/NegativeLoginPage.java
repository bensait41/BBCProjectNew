
package co.uk.bbc.pages;

import co.uk.bbc.utilities.Driver;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class NegativeLoginPage {

    private Faker faker;

    public NegativeLoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@id='idcta-username']")
    public WebElement singIn;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailUsernameInputBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//button/span[text()='Sign in']")
    public WebElement singInButton;

    @FindBy(xpath = "//div[@id='form-message-general']")
    public WebElement dontMatchError;

    @FindBy(xpath = "//div[@data-bbc-title='username-error']")
    public WebElement userMissingError;

    @FindBy(xpath = "//div[@data-bbc-title='password-error']")
    public WebElement passMissingError;

    @FindBy(xpath = "//div[@id='form-message-username']")
    public WebElement userInsufficientCharacterError;

    @FindBy(id = "form-message-username")
    public WebElement userInvalidCharError;

    @FindBy(id = "form-message-username")
    public WebElement userTooLongError;

    @FindBy(id = "form-message-username")
    public WebElement notProperEmailError;

    @FindBy(id = "form-message-password")
    public WebElement passMissALetterError;

    @FindBy(id = "form-message-password")
    public WebElement passLessThanEightCharError;

    @FindBy(id = "form-message-password")
    public WebElement passTooLongError;



    public void login(String user, String pass) {

        Faker faker = new Faker();

        String username = faker.name().username(); // "josé luis.alonso"
        String email = faker.internet().safeEmailAddress(); // "josé luis.alonso@example.com"

    }



    public void fakeEmail(){

       faker = new Faker(new Locale("es"));

        String username = faker.name().username();
        String email = faker.internet().safeEmailAddress();
        System.out.println("email = " + email);

    }

}

