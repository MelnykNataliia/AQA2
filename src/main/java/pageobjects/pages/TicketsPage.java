package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    // Locator for tickets field
    By tickets = By.id("menu-tickets");

    // Method to enter tickets
    public void enterTicketsPage() {
        driver.findElement(tickets).click();
    }

    // Getting list of elements and printing to the console
    public void getAllTitlesAndValues(By webElements) {
        List<WebElement> titleNames = driver.findElements(webElements);
        for (int i = 1; i < titleNames.size(); i++) {
            System.out.println(titleNames.get(i).getText());
        }
    }
}






