package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.pages.DashboardPage;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import testdata.TestData;

import java.util.List;


public class Task9 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected DashboardPage dashboard = new DashboardPage(driver);

    @Test
    // Test prints to console title names and value of columns ID, Title, Assignee, Stage
    public void printTicketTitleNameAndValue() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Return title names
        List<WebElement> titleNames = tickets.getTitleOfColumns();
        tickets.getTitleNames(titleNames);

        // Return value of columns
        List<WebElement> columnsValue = tickets.getValueOfColumns();
        tickets.getColumnsValue(columnsValue);
    }

    @Test
    // Test prints to console title names for category Development, Finance and ID for Priority P3
    public void printTitleNameAndID() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Open Dashboard page (Deadline is over)
        dashboard.getDeadLineIsOver();

        // Return all title names of Development category
        List<WebElement> devTitles = dashboard.getDevTitleNames();
        dashboard.getTitlesDevelopmentCategory(devTitles);

        // Return all title names of Finance category
        List<WebElement> finTitles = dashboard.getFinTitleNames();
        dashboard.getTitleOfFinanceCategory(finTitles);

        // Return all ID of priority P3
        List<WebElement> priorityId = dashboard.getPriorityId();
        dashboard.getIdOfPriorityP3(priorityId);
    }
}
