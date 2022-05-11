package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrelloBoardsPage extends BasePage {
    public TrelloBoardsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "span[data-test-id='home-team-tab-name']")
    WebElement testBoard;

    public void enterTestBoard() {
        testBoard.click();
    }
}
