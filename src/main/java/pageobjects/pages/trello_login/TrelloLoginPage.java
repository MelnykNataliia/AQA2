package pageobjects.pages.trello_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.base.BasePage;

public class TrelloLoginPage extends BasePage {
    public TrelloLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user")
    WebElement username;
    @FindBy(id = "login")
    WebElement trelloLoginButton;

    public void loginTrello() {
        username.sendKeys("goodlucknat97@gmail.com");
        trelloLoginButton.click();
    }
}
