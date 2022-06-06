package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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
        tickets.getAllTitlesAndValues(By.xpath("//tbody/tr[1]/th[contains(text(),'  ')]"));

        // Prints to the console values of ID column
        tickets.getAllTitlesAndValues(By.xpath("//tbody/tr/td[2]"));

        // Prints to the console values of Title column
        tickets.getAllTitlesAndValues(By.xpath("//tbody/tr/td[3]/a[1]"));

        // Prints to the console values of Assignee column
        tickets.getAllTitlesAndValues(By.xpath("//tbody/tr/td[6]"));

        // Prints to the console values of Stage column
        tickets.getAllTitlesAndValues(By.xpath("//tbody/tr/td[7]"));
    }
}