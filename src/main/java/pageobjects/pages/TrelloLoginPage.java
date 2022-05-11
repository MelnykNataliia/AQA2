package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrelloLoginPage extends BasePage {
    public TrelloLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "user")
    WebElement loginName;

    @FindBy(id = "login")
    WebElement trelloLoginButton;

    public void loginTrello(String userName) {

        //Get data for element
        loginName.sendKeys(userName);

        //Form submitting
        trelloLoginButton.click();
    }
}
