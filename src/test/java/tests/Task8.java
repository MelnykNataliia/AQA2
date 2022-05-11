package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.pages.AtlassianLoginPage;
import pageobjects.pages.TrelloCardPage;
import pageobjects.pages.TrelloHomePage;
import pageobjects.pages.TrelloLoginPage;


public class Task8 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected TrelloHomePage homePage = new TrelloHomePage(driver);
    protected TrelloHomePage boards = new TrelloHomePage(driver);
    protected TrelloCardPage card = new TrelloCardPage(driver);

    private void login(TrelloLoginPage loginName, AtlassianLoginPage password) {
    }

    @Test
    public void testOpenHomePage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, homePage);

        //Go to page element
        homePage.enterHomePage();
    }

    @Test
    public void testOpenBoardsPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, boards);

        //Go to page element
        boards.enterBoards();
    }

    @Test
    public void testOpenCardPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, card);

        //Go to page element
        card.enterCardPage();
    }
}