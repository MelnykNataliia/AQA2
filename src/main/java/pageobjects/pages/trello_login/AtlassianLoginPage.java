package pageobjects.pages.trello_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.base.BasePage;

public class AtlassianLoginPage extends BasePage {
    public AtlassianLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-submit")
    WebElement atlassianLoginButton;

    public void loginAtlassian () {
        password.sendKeys("Test2904");
        atlassianLoginButton.click();
    }
}
