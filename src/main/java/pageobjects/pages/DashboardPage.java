package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    // Locator for dashboard field
    By dashboard = By.id("menu-dashboard");

    // Method to enter dashboard
    public void enterDashboardPage() {
        driver.findElement(dashboard).click();
    }

    By dashboardDone = By.id("dashboard-done");

    // Method to enter "Done deadline" dashboard
    public void enterDashboardDone() {
        driver.findElement(dashboardDone).click();
    }

    By deadLineIsOver = By.id("company-additional-information");

    // Method to enter "Deadline is over" via collapse element
    public void enterDeadLineIsOver() {
        driver.findElement(deadLineIsOver).click();
    }

    // Locators and methods for column values
    public WebElement getDevTitle1() {
        WebElement devTitle1 = driver.findElement(By.xpath("//tbody/tr[6]/td[3]/a[1]"));
        return devTitle1;
    }

    public WebElement getDevTitle2() {
        WebElement devTitle2 = driver.findElement(By.xpath("//tbody/tr[8]/td[3]/a[1]"));
        return devTitle2;
    }

    public WebElement getDevTitle3() {
        WebElement devTitle3 = driver.findElement(By.xpath("//tbody/tr[9]/td[3]/a[1]"));
        return devTitle3;
    }

    public WebElement getFinTitle1() {
        WebElement finTitle1 = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/a[1]"));
        return finTitle1;
    }

    public WebElement getFinTitle2() {
        WebElement finTitle2 = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/a[1]"));
        return finTitle2;
    }

    public WebElement getFinTitle3() {
        WebElement finTitle3 = driver.findElement(By.xpath("//tbody/tr[219]/td[3]/a[1]"));
        return finTitle3;
    }

    public WebElement getPriorityId1() {
        WebElement priorityId1 = driver.findElement(By.xpath("//tbody/tr[11]/td[2]"));
        return priorityId1;
    }

    public WebElement getPriorityId2() {
        WebElement priorityId2 = driver.findElement(By.xpath("//td[contains(text(),'INN-154')]"));
        return priorityId2;
    }

    public WebElement getPriorityId3() {
        WebElement priorityId3 = driver.findElement(By.xpath("//td[contains(text(),'INN-161')]"));
        return priorityId3;
    }

    public WebElement getPriorityId4() {
        WebElement priorityId4 = driver.findElement(By.xpath("//td[contains(text(),'INN-174')]"));
        return priorityId4;
    }

    public WebElement getPriorityId5() {
        WebElement priorityId5 = driver.findElement(By.xpath("//td[contains(text(),'MIKHAI-1')]"));
        return priorityId5;
    }

    public WebElement getPriorityId6() {
        WebElement priorityId6 = driver.findElement(By.xpath("//td[contains(text(),'MIKHAI-2')]"));
        return priorityId6;
    }

    // Method gets the list of tickets "Deadline is over"
    public void getDeadLineIsOver() {
        enterDashboardPage();
        enterDashboardDone();
        enterDeadLineIsOver();
    }

    // Return a List<WebElement> of title names for category Development
    public List<WebElement> getDevTitleNames() {
        List<WebElement> development = new LinkedList<>();
        development.add(getDevTitle1());
        development.add(getDevTitle2());
        development.add(getDevTitle3());
        return development;
    }

    // Return a List<WebElement> of title names for category Finance
    public List<WebElement> getFinTitleNames() {
        List<WebElement> finance = new LinkedList<>();
        finance.add(getFinTitle1());
        finance.add(getFinTitle2());
        finance.add(getFinTitle3());
        return finance;
    }

    // Return a List<WebElement> of ID for Priority P3
    public List<WebElement> getPriorityId() {
        List<WebElement> priority = new LinkedList<>();
        priority.add(getPriorityId1());
        priority.add(getPriorityId2());
        priority.add(getPriorityId3());
        priority.add(getPriorityId4());
        priority.add(getPriorityId5());
        priority.add(getPriorityId6());
        return priority;
    }

    // Gets List<WebElement> and prints title names for category Development to the console
    public void getTitlesDevelopmentCategory(List<WebElement> webElements) {
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
        }
    }

    // Gets List<WebElement> and prints title names for category Finance to the console
    public void getTitleOfFinanceCategory(List<WebElement> webElements) {
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
        }
    }

    // Gets List<WebElement> and prints ID for Priority P3 to the console
    public void getIdOfPriorityP3(List<WebElement> webElements) {
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
        }
    }
}