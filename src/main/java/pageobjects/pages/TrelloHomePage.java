package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrelloHomePage extends BasePage {
    public TrelloHomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[data-test-id='home-link']")
    WebElement homePage;

    @FindBy(css = "button[data-test-id='workspace-switcher']")
    WebElement workSpaces;

    @FindBy(css = "button[data-test-id='recently-viewed-boards-menu']")
    WebElement recent;

    @FindBy(css = "button[data-test-id='starred-boards-menu']")
    WebElement favorites;

    @FindBy(css = "button[data-test-id='templates-menu']")
    WebElement templates;

    @FindBy(css = "button[data-test-id='header-create-menu-button']")
    WebElement create;

    @FindBy(css = "input[data-test-id='header-search-input']")
    WebElement search;

    @FindBy(css = "a[href='/nataliiamelnyk13/boards']")
    WebElement boards;

    public void enterHomePage() {
        homePage.click();
    }

    public void enterWorkSpaces() {
        workSpaces.click();
    }

    public void enterRecent() {
        recent.click();
    }

    public void enterFavorites() {
        favorites.click();
    }

    public void enterTemplates() {
        templates.click();
    }

    public void enterCreate() {
        create.click();
    }

    public void enterSearch() {
        search.click();
    }

    public void enterBoards() {
        boards.click();
    }
}
