package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.pages.trello_home.TrelloHomePage;
import pageobjects.pages.trello_login.AtlassianLoginPage;
import pageobjects.pages.trello_login.TrelloLoginPage;
import pageobjects.pages.trello_menu.TrelloCardPage;


public class Task8 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected TrelloHomePage homePage = new TrelloHomePage(driver);
    protected TrelloHomePage boards = new TrelloHomePage(driver);
    protected TrelloCardPage card = new TrelloCardPage(driver);

    private void login(TrelloLoginPage loginName, AtlassianLoginPage password) {
    }

    @Test
    public void testOpenHomePage() {
        login(loginName, password);
        PageFactory.initElements(driver, homePage);
        homePage.enterHomePage();
    }

    @Test
    public void testOpenBoardsPage() {
        login(loginName, password);
        PageFactory.initElements(driver, boards);
        boards.enterBoards();
    }

    @Test
    public void testOpenCardPage() {
        login(loginName, password);
        PageFactory.initElements(driver, card);
        card.enterCardPage();
    }
}