package pageobjects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrelloCardPage extends BasePage {
    public TrelloCardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/b/Ej197KGK/testboard']")
    WebElement card;

    public void enterCardPage() {
        card.click();
    }
}


