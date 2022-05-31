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

    // Return all Title names and print to the console
    public void titleNames() {
        List<WebElement> getTitleNames = driver.findElements(By.xpath("//tbody/tr[1]/th"));
        for (int i = 0; i < getTitleNames.size(); i++) {

            if (i == 1 | i == 2 | i == 5 | i == 6) {
                System.out.println(getTitleNames.get(i).getText());

            } else if (i > 6) {
                break;
            }
        }
    }

    // Return value of ID column and print to the console
    public void valuesId() {
        List<WebElement> getValues = driver.findElements(By.xpath("//tbody/tr/td[2]"));
        for (WebElement getValue : getValues) {
            System.out.println(getValue.getText());
        }
    }

    // Return value of Title column and print to the console
    public void valuesTitle() {
        List<WebElement> getValues = driver.findElements(By.xpath("//tbody/tr/td[3]/a[1]"));
        for (WebElement getValue : getValues) {
            System.out.println(getValue.getText());
        }
    }

    // Return value of Assignee column and print to the console
    public void valuesAssignee() {
        List<WebElement> getValues = driver.findElements(By.xpath("//tbody/tr/td[6]"));
        for (WebElement getValue : getValues) {
            System.out.println(getValue.getText());
        }
    }

    // Return value of Stage column and print to the console
    public void valuesStage() {
        List<WebElement> getValues = driver.findElements(By.xpath("//tbody/tr/td[7]"));
        for (WebElement getValue : getValues) {
            System.out.println(getValue.getText());
        }
    }
}






