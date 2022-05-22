package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    //Locator for dashboard field
    By dashboard = By.id("menu-dashboard");

    By dashboardDone = By.id("dashboard-done");

    By deadlineIsOve = By.id("company-additional-information");

    //Method to enter dashboard
    public void enterDashboardPage() {
        driver.findElement(dashboard).click();
    }

    public void enterDashboardDone() {
        driver.findElement(dashboardDone).click();
    }

    public void enterDeadLineIsOver() {
        driver.findElement(deadlineIsOve).click();
    }

//    public static String getTextId58() {
//        String textId58 = driver.findElement(By.xpath("//tbody/tr[9]/td[3]")).getText();
//        return textId58;
//    }
//
//    public static String getTextId57() {
//        String textId57 = driver.findElement(By.xpath("//tbody/tr[8]/td[3]")).getText();
//        return textId57;
//    }
//
//    public static List<WebElement> getDevelopmentTitleNames() {
//        WebElement development = driver.findElement(By.id("collapse7"));
//        List<WebElement> devTitleNames = development.findElements(By.partialLinkText("[Inner]"));
//
//        return devTitleNames;
//    }
}


