package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menu-dashboard")
    WebElement dashboard;

    @FindBy(id = "dashboard-reaction")
    WebElement dashboardReaction;

    @FindBy(id = "dashboard-done")
    WebElement dashboardDone;

    @FindBy(id = "company-additional-information")
    WebElement deadLineIsOver;

    public void enterDashboardPage() {
        dashboard.click();
    }

    public void enterDashboardReaction() {
        dashboardReaction.click();
    }

    public void enterDashboardDone() {
        dashboardDone.click();
    }

    public void enterDeadLineIsOver() {
        deadLineIsOver.click();
    }


    public static String getTextId58() {
        String textId58 = driver.findElement(By.xpath("//tbody/tr[9]/td[3]")).getText();
        return textId58;
    }

    public static String getTextId57() {
        String textId57 = driver.findElement(By.xpath("//tbody/tr[8]/td[3]")).getText();
        return textId57;
    }

    public static List<WebElement> getDevelopmentTitleNames() {
        WebElement development = driver.findElement(By.id("collapse7"));
        List<WebElement> devTitleNames = development.findElements(By.partialLinkText("[Inner]"));

        return devTitleNames;
    }
}


