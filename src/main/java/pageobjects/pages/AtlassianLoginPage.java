package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AtlassianLoginPage extends BasePage {
    public AtlassianLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-submit")
    WebElement atlassianLoginButton;

    public void loginAtlassian(String userPassword) {

        //Get data for element
        password.sendKeys(userPassword);

        //Form submitting
        atlassianLoginButton.submit();
    }
}
