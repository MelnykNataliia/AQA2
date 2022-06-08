package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.DashboardPage;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import testdata.TestData;


public class Task9 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected DashboardPage dashboard = new DashboardPage(driver);


    @Test
    // Test prints to console title names and values of columns
    public void printTitleNamesAndValues() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Prints to the console all title names
        tickets.getTitles();

        // Prints to the console values of ID column
        tickets.getValuesID();

        // Prints to the console values of Title column
        tickets.getValuesTitle();

        // Prints to the console values of Assignee column
        tickets.getValuesAssignee();

        // Prints to the console values of Stage column
        tickets.getValuesStage();
    }

    @Test
    // Test prints to console title names for category Development, Finance and ID for Priority P3
    public void printTitleNamesAndID() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Open Dashboard page (Deadline is over)
        dashboard.getDeadLineIsOver();

        // Prints to the console all title names
        dashboard.getDevTitle();
    }
}