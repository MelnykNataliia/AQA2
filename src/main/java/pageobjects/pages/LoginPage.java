package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    WebElement loginName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-signin")
    WebElement signInButton;

    public void loginBigom(String userNameBigom) {
        loginName.sendKeys(userNameBigom);
    }


    public void passwordBigom(String userPasswordBigom) {
        password.sendKeys(userPasswordBigom);
        signInButton.click();
    }
}
