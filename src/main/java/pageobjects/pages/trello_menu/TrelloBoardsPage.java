package pageobjects.pages.trello_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.base.BasePage;

public class TrelloBoardsPage extends BasePage {
    public TrelloBoardsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'Test')]")
    WebElement testBoard;

    public void enterTestBoard() {
        testBoard.click();
    }
}
