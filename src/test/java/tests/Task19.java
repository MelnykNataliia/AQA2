package tests;

import config.ChromeDriverConfiguration;
import database.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.*;
import testdata.TestData;
import utils.GlobalHelpers;
import utils.Log;

import java.sql.SQLException;

public class Task19 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected TicketsPage tickets = new TicketsPage(driver);
    protected СompaniesPage companies = new СompaniesPage(driver);
    protected ManagersPage managers = new ManagersPage(driver);
    protected CategoriesPage categories = new CategoriesPage(driver);
    protected DataBase newTicket = new DataBase();
    protected DataBase newCompany = new DataBase();
    protected DataBase newManager = new DataBase();
    protected DataBase newCategory = new DataBase();

    @Test
    public void createNewTicket() throws SQLException, ClassNotFoundException {

        // Test data
        String newTicketTitle = "Test Ticket";
        String newTicketCategory = "Test";
        String newTicketStage = "OPEN";
        String newTicketCompany = "Snowball";
        String newTicketContact = "Nataliia Melnyk";
        String newTicketPriority = "P4";
        String selectTitle = "select title from ticket where title = 'Test Ticket' limit 1";
        String selectCategoryName = "select category.name from category join ticket on category.id = ticket.category_id and title = 'Test Ticket' limit 1";
        String selectStageName = "select stage.name from stage join ticket on stage.id = ticket.stage_id and title = 'Test Ticket' limit 1";
        String selectCompanyName = "select company.name from company join ticket on company.id = ticket.id and name = 'Snowball'";
        String selectContact = "select concat(contact.first_name, ' ', contact.last_name) as full_name from contact join ticket on contact.id = ticket.contact_id and title = 'Test Ticket' limit 1";
        String selectPriority = "select priority from ticket where title = 'Test Ticket' limit 1";

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Page load delay
        GlobalHelpers.sleepWait(5000);

        // Fills all fields and submit the form for new ticket
        tickets.fillAllFieldsForTicket(newTicketTitle, newTicketCategory, newTicketStage, newTicketCompany, newTicketContact, newTicketPriority);

        // Checks whether a new ticket has been created
        tickets.findNewTicket();

        // Checks data in the table and DB
        Assertions.assertEquals(newTicket.ticketTitle(selectTitle), newTicketTitle);
        Assertions.assertEquals(newTicket.ticketCategory(selectCategoryName), newTicketCategory);
        Assertions.assertEquals(newTicket.ticketStage(selectStageName), newTicketStage);
        Assertions.assertEquals(newTicket.ticketCompany(selectCompanyName), newTicketCompany);
        Assertions.assertEquals(newTicket.ticketContact(selectContact), newTicketContact);
        Assertions.assertEquals(newTicket.ticketTitle(selectTitle), newTicketTitle);
        Assertions.assertEquals(newTicket.ticketPriority(selectPriority), newTicketPriority);

        Log.logger();
    }

    @Test
    public void createNewInnerTicket() throws SQLException, ClassNotFoundException {

        // Test data
        String newInnerTicketTitle = "Test inner ticket";
        String selectInnerTicketTitle = "select title from ticket where title = 'Test inner ticket' limit 1";

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Page load delay
        GlobalHelpers.sleepWait(2000);

        // Fills title field and submit the form for new inner ticket
        tickets.fillTheFormForInnerTicket(newInnerTicketTitle);

        // Checks whether a new inner ticket has been created
        tickets.findNewInnerTicket();

        // Checks data in the table and DB
        Assertions.assertEquals(newTicket.ticketInnerTitle(selectInnerTicketTitle), newInnerTicketTitle);

        Log.logger();
    }

    @Test
    public void createNewCompany() throws SQLException, ClassNotFoundException {

        // Test data
        String newCompanyTitle = "Containership";
        String newCompanyCountry = "UK";
        String newCompanyCity = "Odesa";
        String newCompanyPhone = "+380482389330";
        String selectCompanyTitle = "select name from company where name = 'Containership' limit 1";

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Open Companies page
        companies.enterDepartmentsPage();// Page load delay

        // Fills all fields and submit the form for new company
        companies.fillAllFieldsForDepartment(newCompanyTitle, newCompanyCountry, newCompanyCity, newCompanyPhone);

        // Checks whether a new company has been created
        companies.findNewCompany();

        // Checks data in the table and DB by criteria Title
        Assertions.assertEquals(newCompany.companyTitle(selectCompanyTitle), newCompanyTitle);

        Log.logger();
    }

    @Test
    public void createNewManager() throws SQLException, ClassNotFoundException {

        // Test data
        String firstName = "TestFirstName";
        String lastName = "TestLastName";
        String email = "testemail@gmail.com";
        String department = "Managers";
        String phoneNumber = "+380482389330";
        String skype = "testManager";
        String selectManagerFirstName = "select first_name from manager join department on manager.department_id = department.id and first_name = 'TestFirstName' and department.name = 'Managers' limit 1";
        String selectManagerLastName = "select last_name from manager join department on manager.department_id = department.id and last_name = 'TestLastName' and department.name = 'Managers' limit 1;";
        String selectManagerDepartment = "select department.name from department where department.name = 'Managers'";

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Open Managers page
        managers.enterManagersPage();

        // Page load delay
        GlobalHelpers.sleepWait(5000);

        // Fills all fields and submit the form for new manager
        managers.fillAllFieldsForManager(firstName, lastName, email, department, phoneNumber, skype);

        // Finds the created manager and open information
        managers.searchManager(firstName);

        // Checks data in the table and DB by criteria First Name, Last Name and Department Name
        Assertions.assertEquals(newManager.managerFirstName(selectManagerFirstName), firstName);
        Assertions.assertEquals(newManager.managerLastName(selectManagerLastName), lastName);
        Assertions.assertEquals(newManager.managerDepartment(selectManagerDepartment), department);

        Log.logger();
    }

    @Test
    public void createNewCategory() throws SQLException, ClassNotFoundException {

        // Test data
        String newCategoryTitle = "New Test Category";
        String selectCategoryTitle = "select category.name from category where name = 'New Test Category' limit 1";

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Open Categories page
        categories.enterCategoriesPage();

        // Fills all fields and submit the form for new category
        categories.fillAllFieldsForCategory(newCategoryTitle);

        // Open Categories page
        categories.enterCategoriesPage();

        // Page load delay
        GlobalHelpers.sleepWait(3000);

        // Finds the created category and open information
        categories.findNewCategory(newCategoryTitle);

        // Checks data in the table and DB
        Assertions.assertEquals(newCategory.newCategory(selectCategoryTitle), newCategoryTitle);

        Log.logger();
    }
}
