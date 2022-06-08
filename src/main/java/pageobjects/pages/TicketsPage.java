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

    // Getting locators for elements
    public void getTitles() {
        this.getAllTitlesAndValues(By.xpath("//tbody/tr[1]/th[contains(text(),'  ')]"));
    }

    public void getValuesID() {
        this.getAllTitlesAndValues(By.xpath("//tbody/tr/td[2]"));
    }

    public void getValuesTitle() {
        this.getAllTitlesAndValues(By.xpath("//tbody/tr/td[3]/a[1]"));

    }

    public void getValuesAssignee() {
        this.getAllTitlesAndValues(By.xpath("//tbody/tr/td[6]"));

    }

    public void getValuesStage() {
        this.getAllTitlesAndValues(By.xpath("//tbody/tr/td[7]"));
    }
}






