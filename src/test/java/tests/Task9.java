package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import testdata.TestData;


public class Task9 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);


    @Test
    // Test prints to console title names and values of columns
    public void printTitleNamesAndValues() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Prints to the console title names and values of columns
        tickets.getAll();
    }
}
