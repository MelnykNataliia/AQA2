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

    // Return all title names and values of columns and print to the console
    public void titleNames() {
        List<WebElement> getTitleNames = driver.findElements(By.xpath("//tbody/tr[1]/th[contains(text(),'  ')]"));
        for (int i = 1; i < getTitleNames.size(); i++) {
            System.out.println(getTitleNames.get(i).getText());
        }
        List<WebElement> getValuesId = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (int i = 1; i < getValuesId.size(); i++) {
            System.out.println(getValuesId.get(i).getText());
        }
        List<WebElement> getValuesTitle = driver.findElements(By.xpath("//tbody/tr/td[3]/a[1]"));
        for (int i = 1; i < getValuesTitle.size(); i++) {
            System.out.println(getValuesTitle.get(i).getText());
        }
        List<WebElement> getValuesAssignee = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        for (int i = 1; i < getValuesAssignee.size(); i++) {
            System.out.println(getValuesAssignee.get(i).getText());
        }
        List<WebElement> getValuesStage = driver.findElements(By.xpath("//tbody/tr/td[7]"));
        for (int i = 1; i < getValuesStage.size(); i++) {
            System.out.println(getValuesStage.get(i).getText());
        }
    }
}








