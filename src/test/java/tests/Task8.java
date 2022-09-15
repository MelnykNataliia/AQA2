package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.*;
import testdata.TestData;


public class Task8 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected DashboardPage dashboard = new DashboardPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected ContactsPage contacts = new ContactsPage(driver);
    protected DepartmentsPage departments = new DepartmentsPage(driver);
    protected CategoriesPage categories = new CategoriesPage(driver);

    @Test
    public void testOpenDashboardPage() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        //Open Dashboard page
        dashboard.enterDashboardPage();
    }

    @Test
    public void testOpenTicketsPage() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        //Open Tickets page
        tickets.enterTicketsPage();
    }

    @Test
    public void testOpenContactsPage() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        //Open Contacts page
        contacts.enterContactsPage();
    }

    @Test
    public void testOpenDepartmentsPage() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        //Open Departments page
        departments.enterDepartmentsPage();
    }

    @Test
    public void testOpenCategoriesPage() {
        // Website login
        login.login(TestData.userName, TestData.userPassword);

        //Open Categories page
        categories.enterCategoriesPage();
    }
}