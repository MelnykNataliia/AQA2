package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static LoginPage using(WebDriver driver) {
        return new LoginPage(driver);
    }

    //Locator for login field
    By loginName = By.id("username");

    //Locator for password field
    By password = By.id("password");

    //Locator for signIn button
    By signInButton = By.id("login-signin");

    //Method to enter login
    public LoginPage enterUsername(String userName) {
        driver.findElement(loginName).sendKeys(userName);
        return this;
    }

    //Method to enter password
    public LoginPage enterPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
        return this;
    }

    //Method to click on signIn button
    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

}

