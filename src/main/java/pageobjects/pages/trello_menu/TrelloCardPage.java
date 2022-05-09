package pageobjects.pages.trello_menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.pages.base.BasePage;

public class TrelloCardPage extends BasePage {
    public TrelloCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "body.feplat3731:nth-child(2) div.chrome.chrome-101.windows.body-tabbed-page:nth-child(1) div._2ffa7ex19Eoxvc:nth-child(1) div._2W6d4IdyPwMlNi main._13yPKk9EPKnvGB:nth-child(2) div.member-boards-view div.js-boards-page div.js-react-root div.home-container div.home-sticky-container div.all-boards:nth-child(2) div.content-all-boards div.js-react-root div.boards-page-board-section.mod-no-sidebar div:nth-child(2) ul.boards-page-board-section-list li.boards-page-board-section-list-item:nth-child(1) > a.board-tile")
    WebElement card;

    public void enterCardPage() {
        card.click();
    }
}


