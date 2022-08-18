package tests;

import config.ChromeDriverConfiguration;
import database.DataBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.LoginPage;
import pageobjects.pages.TicketsPage;
import testdata.TestData;
import utils.GlobalHelpers;

import java.sql.SQLException;
import java.util.regex.Pattern;

public class Task19 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();
    protected TicketsPage tickets = new TicketsPage(driver);
    protected DataBase newTicket = new DataBase();

    @Test
    public void createNewTicket() throws SQLException, ClassNotFoundException {

        // Test data
        String newTicketTitle = "Test Ticket";
        String newTicketCategory = "Test";
        String newTicketStage = "OPEN";
        String newTicketCompany = "Snowball";
        String newTicketContact = "Nataliia Melnyk";
        String newTicketPriority = "P4";

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
        System.out.println(Pattern.matches(newTicket.ticketTitle("select title from ticket where title = 'Test Ticket' limit 1"), newTicketTitle));
        System.out.println(Pattern.matches(newTicket.ticketCategory("""
                select category.name
                from category join ticket on category.id = ticket.category_id
                    and title = 'Test Ticket'
                limit 1"""), newTicketCategory));
        System.out.println(Pattern.matches(newTicket.ticketStage("""
                select stage.name
                from stage join ticket on stage.id = ticket.stage_id
                    and title = 'Test Ticket'
                limit 1"""), newTicketStage));
        System.out.println(Pattern.matches(newTicket.ticketCompany("""
                select company.name
                from company join ticket
                    on company.id = ticket.id
                        and name = 'Snowball'"""), newTicketCompany));
        System.out.println(Pattern.matches(newTicket.ticketContact("""
                select concat(contact.first_name, ' ', contact.last_name) as full_name
                from contact join ticket on contact.id = ticket.contact_id
                    and title = 'Test Ticket'
                limit 1"""), newTicketContact));
        System.out.println(Pattern.matches(newTicket.ticketPriority("select priority from ticket where title = 'Test Ticket' limit 1"), newTicketPriority));
    }

    @Test
    public void createNewInnerTicket() throws SQLException, ClassNotFoundException {

        // Test data
        String newInnerTicketTitle = "Test inner ticket";

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
        System.out.println(Pattern.matches(newTicket.ticketInnerTitle("""
                select title
                from ticket
                where title = 'Test inner ticket'
                limit 1"""), newInnerTicketTitle));
    }
}
