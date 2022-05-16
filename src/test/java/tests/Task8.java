package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.pages.*;


public class Task8 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected DashboardPage dashboard = new DashboardPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected ContactsPage contacts = new ContactsPage(driver);
    protected DepartmentsPage departments = new DepartmentsPage(driver);
    protected CategoriesPage categories = new CategoriesPage(driver);


    private void login(LoginPage loginName, LoginPage password) {
    }

    @Test
    public void testOpenDashboardPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, dashboard);

        //Go to page element
        dashboard.enterDashboardPage();
    }

    @Test
    public void testOpenTicketsPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, tickets);

        //Go to page element
        tickets.enterTickets();
    }

    @Test
    public void testOpenContactsPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, contacts);

        //Go to page element
        contacts.enterContacts();
    }

    @Test
    public void testOpenDepartmentsPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, departments);

        //Go to page element
        departments.enterDepartments();
    }

    @Test
    public void testOpenCategoriesPage() {

        //Website login
        login(loginName, password);

        //Initialise Element
        PageFactory.initElements(driver, categories);

        //Go to page element
        categories.enterCategories();
    }
}