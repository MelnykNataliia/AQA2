package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import testdata.TestData;


public class Task10 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);

    @Test
    // Test
    public void createNewTicket() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);
        tickets.clickButtonNewTicket();
        tickets.inputTicketTitle();
        tickets.selectTicketCategory();
        tickets.selectTicketStage();
        tickets.inputTicketCompany();
        tickets.selectTicketContact();
        tickets.selectTicketPriority();
        tickets.inputTicketDepartment();
        tickets.submitNewTicket();
        tickets.enterTicketsPage();
    }
}
