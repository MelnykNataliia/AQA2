package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.*;


public class Task8 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected DashboardPage dashboard = new DashboardPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected ContactsPage contacts = new ContactsPage(driver);
    protected DepartmentsPage departments = new DepartmentsPage(driver);
    protected CategoriesPage categories = new CategoriesPage(driver);

    @Test
    public void testOpenDashboardPage() {
        //Open Dashboard page
        dashboard.enterDashboardPage();
    }

    @Test
    public void testOpenTicketsPage() {
        //Open Tickets page
        tickets.enterTicketsPage();
    }

    @Test
    public void testOpenContactsPage() {
        //Open Contacts page
        contacts.enterContactsPage();
    }

    @Test
    public void testOpenDepartmentsPage() {
        //Open Departments page
        departments.enterDepartmentsPage();
    }

    @Test
    public void testOpenCategoriesPage() {
        //Open Categories page
        categories.enterCategoriesPage();
    }
}