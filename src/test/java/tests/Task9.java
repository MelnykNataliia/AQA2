package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
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
    protected DashboardPage dashboard = new DashboardPage(driver);


    @Test
    public void printTicketsTitlesAndValues() {
        login.login(TestData.userName, TestData.userPassword);

        // Return title names using getText() method
        System.out.printf("%10s %40s %50s %20s", TicketsPage.getTextId(), TicketsPage.getTextTitle(), TicketsPage.getTextAssignee(), TicketsPage.getTextStage());
        System.out.println();

        // Return value of columns using getText() method
        System.out.printf("%10s %70s %10s %25s", TicketsPage.getTextValueId(), TicketsPage.getTextValueTitle(), TicketsPage.getTextValueAssignee(), TicketsPage.getTextValueStage());
    }

    @Test
    public void print() {
        login.login(TestData.userName, TestData.userPassword);
        dashboard.getDeadLineIsOver();

        List<WebElement> development = driver.findElements(By.tagName("tr"));
        for (WebElement titles : development) {
            List<WebElement> titleName = titles.findElements(By.xpath("//tbody/tr/td/span[contains(@style, 'background: blue')]"));
            for (WebElement developmentTitleName : titleName) {
                System.out.println(developmentTitleName.getText());
            }
        }
    }
}
