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
    public WebElement emailButton;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordButton;

    @FindBy(xpath = "//button/span[text()='Sign in']")
    public WebElement singInButton;


    @Test
    public void fakeEmail(){

       faker = new Faker(new Locale("es"));

        String email = faker.internet().safeEmailAddress();
        System.out.println("email = " + email);

    }

}