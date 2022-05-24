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

    @Test
    public void printTicketsPageTitles() {
        login.login(TestData.userName, TestData.userPassword);

        // Return title names using getText() method
        System.out.printf("%10s %40s %50s %20s", TicketsPage.getTextId(), TicketsPage.getTextTitle(), TicketsPage.getTextAssignee(), TicketsPage.getTextStage());
        System.out.println();

        // Return value of columns using getText() method
        System.out.printf("%10s %70s %10s %25s", TicketsPage.getTextValueId(), TicketsPage.getTextValueTitle(), TicketsPage.getTextValueAssignee(), TicketsPage.getTextValueStage());
    }
}
