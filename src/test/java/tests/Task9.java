package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageobjects.pages.DashboardPage;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;

import java.util.List;

import static pageobjects.pages.DashboardPage.*;


public class Task9 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected TicketsPage tickets = new TicketsPage(driver);
    protected DashboardPage dashboard = new DashboardPage(driver);
    protected DashboardPage dashboardDone = new DashboardPage(driver);
    protected DashboardPage deadLineIsOver = new DashboardPage(driver);

    private void login(LoginPage loginName, LoginPage password) {
    }


    @Test
    public void printTicketsPageTitles() {

        //Website login
        login(loginName, password);

        PageFactory.initElements(driver, tickets);
        tickets.enterTickets();

        // Return title names using getText() method
        System.out.printf("%10s %40s %45s %20s", TicketsPage.getTextId(), TicketsPage.getTextTitle(), TicketsPage.getTextAssignee(), TicketsPage.getTextStage());
        System.out.println();
        System.out.printf("%10s %70s %10s %20s", TicketsPage.getCompanyId(), TicketsPage.getCompanyTitle(), TicketsPage.getCompanyAssignee(), TicketsPage.getCompanyStage());
    }

    @Test
    public void printDevelopmentTitleNames() {
        login(loginName, password);

        PageFactory.initElements(driver, dashboard);
        dashboard.enterDashboardPage();

        PageFactory.initElements(driver, dashboardDone);
        dashboardDone.enterDashboardDone();

        PageFactory.initElements(driver, deadLineIsOver);
        deadLineIsOver.enterDeadLineIsOver();

        List<WebElement> devTitleNames = getDevelopmentTitleNames();
        for (WebElement e : devTitleNames) {
            System.out.println(e.getText());
        }
    }
}
