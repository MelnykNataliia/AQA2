package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.DepartmentsPage;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import pageobjects.pages.СompaniesPage;
import testdata.TestData;


public class Task10 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected LoginPage login = new LoginPage(driver);
    protected TicketsPage tickets = new TicketsPage(driver);
    protected DepartmentsPage departments = new DepartmentsPage(driver);
    protected СompaniesPage companies = new СompaniesPage(driver);

    @Test
        public void createNewTicket() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Fills all fields and submit the form for new ticket
        tickets.fillAllFieldsForTicket();

        // Checking if a new ticket is in the list of tickets
        tickets.enterTicketsPage();
    }

    @Test
    public void createNewDepartment() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Open Departments page
        departments.enterDepartmentsPage();

        // Fills all fields and submit the form for new department
        departments.fillAllFieldsForDepartment();

        // Checking if a new department is in the list of departments
        departments.enterDepartmentsPage();
    }

    @Test
    public void createNewCompany() {

        // Website login
        login.login(TestData.userName, TestData.userPassword);

        // Open Companies page
        companies.enterDepartmentsPage();

        // Fills all fields and submit the form for new company
        companies.fillAllFieldsForDepartment();

        // Checking if a new company is in the list of companies
        companies.enterDepartmentsPage();
    }
}
