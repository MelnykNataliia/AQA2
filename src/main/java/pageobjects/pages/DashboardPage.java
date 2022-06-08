package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    // Locators for dashboard fields
    By dashboard = By.id("menu-dashboard");
    By dashboardDone = By.id("dashboard-done");
    By deadLineIsOver = By.id("company-additional-information");

    // Method to enter dashboard
    public void enterDashboardPage() {
        driver.findElement(dashboard).click();
    }

    // Method to enter "Done deadline" dashboard
    public void enterDashboardDone() {
        driver.findElement(dashboardDone).click();
    }

    // Method to enter "Deadline is over" via collapse element
    public void enterDeadLineIsOver() {
        driver.findElement(deadLineIsOver).click();
    }

    // Method gets the list of tickets "Deadline is over"
    public void getDeadLineIsOver() {
        enterDashboardPage();
        enterDashboardDone();
        enterDeadLineIsOver();
    }

    // Getting list of elements and printing to the console
    public void getAllTitlesAndID(By webElements) {
        List<WebElement> titleNames = driver.findElements(webElements);
        for (int i = 0; i < titleNames.size(); i++) {
            System.out.println(titleNames.get(i).getAttribute("textContent"));
        }
    }

    public void getDevTitle() {
        this.getAllTitlesAndID(By.xpath("//tbody/tr/td[9]/span[contains(@style, 'background: ')]"));
    }
}