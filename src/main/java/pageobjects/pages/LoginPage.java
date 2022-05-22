package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    //Locator for login field
    By loginName = By.id("username");

    //Locator for password field
    By password = By.id("password");

    //Locator for signIn button
    By signInButton = By.id("login-signin");

    //Method to enter login
    public void enterUsername(String user) {
        driver.findElement(loginName).sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    //Method to click on signIn button
    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
}

