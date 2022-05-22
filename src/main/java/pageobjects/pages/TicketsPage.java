package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    //Locator for tickets field
    By tickets = By.id("menu-tickets");

    //Method to enter tickets
    public void enterTicketsPage() {
        driver.findElement(tickets).click();
    }
}


