package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    //Locator for dashboard field
    By dashboard = By.id("menu-dashboard");

    //Method to enter dashboard
    public void enterDashboardPage() {
        driver.findElement(dashboard).click();
    }

    By dashboardDone = By.id("dashboard-done");

    public void enterDashboardDone() {
        driver.findElement(dashboardDone).click();
    }

    By deadLineIsOver = By.id("company-additional-information");

    public void enterDeadLineIsOver() {
        driver.findElement(deadLineIsOver).click();
    }

    public void getDeadLineIsOver() {
        enterDashboardPage();
        enterDashboardDone();
        enterDeadLineIsOver();
    }
}