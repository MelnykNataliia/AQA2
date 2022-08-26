package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.logging.Logger;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    Logger logger = Logger.getLogger(TicketsPage.class.getName());

    // Locators for tickets field
    By ticketsList = By.id("menu-tickets");
    By createNewTicketButton = By.id("create-new-ticket");
    By createNewInnerTicketButton = By.id("new-inner-ticket");
    By ticketInnerTitle = By.id("title");
    By ticketTitle = By.id("title");
    By ticketCategory = By.id("categoryId");
    By ticketStage = By.id("stageId");
    By ticketCompany = By.id("company");
    By ticketContact = By.id("contactId");
    By ticketPriority = By.id("priority");
    By submitNewTicketButton = By.id("submit-btn");
    By submitNewInnerTicketButton = By.id("submit-btn");
    By checkNewTicket = By.partialLinkText("Test Ticket");
    By checkNewInnerTicket = By.partialLinkText("Test inner ticket");

    // Locators for title names and values of columns
    public static By titles = By.xpath("//tbody/tr[1]/th[contains(text(),'  ')]");
    public static By valuesID = By.xpath("//tbody/tr/td[2]");
    public static By valuesTitle = By.xpath("//tbody/tr/td[3]/a[1]");
    public static By valuesAssignee = By.xpath("//tbody/tr/td[6]");
    public static By valuesStage = By.xpath("//tbody/tr/td[7]");

    // Methods describe actions with elements
    public void fillAllFieldsForTicket(String newTicketTitle, String newTicketCategory, String newTicketStage, String newTicketCompany, String newTicketContact, String newTicketPriority) {

        logger.info("Filling in all fields to create a new ticket and submitting the form");

        driver.findElement(createNewTicketButton).click();
        driver.findElement(ticketTitle).sendKeys(newTicketTitle);
        driver.findElement(ticketCategory).sendKeys(newTicketCategory);
        driver.findElement(ticketStage).sendKeys(newTicketStage);
        driver.findElement(ticketCompany).sendKeys(newTicketCompany);
        driver.findElement(ticketContact).sendKeys(newTicketContact);
        driver.findElement(ticketPriority).sendKeys(newTicketPriority);
        driver.findElement(submitNewTicketButton).click();

        logger.info("New ticket form successfully submitted");
    }

    public void fillTheFormForInnerTicket(String newInnerTicketTitle) {
        driver.findElement(createNewTicketButton).click();
        driver.findElement(createNewInnerTicketButton).click();
        driver.findElement(ticketInnerTitle).sendKeys(newInnerTicketTitle);
        driver.findElement(submitNewInnerTicketButton).click();
    }

    // Method to enter tickets page
    public void enterTicketsPage() {
        driver.findElement(ticketsList).click();
    }

    // Method finds the created ticket
    public void findNewTicket() {

        logger.info("Searching for a created ticket");

        driver.findElement(checkNewTicket).click();

        logger.info("A new ticket was successfully found in the tickets list");
    }

    public void findNewInnerTicket() {
        driver.findElement(checkNewInnerTicket).click();
    }

    // Getting list of elements and printing to the console
    public void getAllTitlesAndValues(By webElements) {
        List<WebElement> titleNames = driver.findElements(webElements);
        for (int i = 1; i < titleNames.size(); i++) {
            System.out.println(titleNames.get(i).getText());
        }
    }
}






