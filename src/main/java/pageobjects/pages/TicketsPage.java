package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    // Locator for tickets field
    By ticketsList = By.id("menu-tickets");
    By createNewTicket = By.id("create-new-ticket");
    By ticketTitle = By.id("title");
    By ticketDescription = By.id("description");
    By ticketCategory = By.xpath("//select[@id='categoryId']/option[7]");
    By ticketStage = By.xpath("//select[@id='stageId']/option[2]");
    By ticketCompany = By.id("company");
    By ticketContact = By.id("contactId");
    By ticketPriority = By.xpath("//select[@id='priority']/option[4]");
    By ticketDepartment = By.id("department");
    By ticketManager = By.id("manager");
    By ticketAddFiles = By.id("add-files");
    By submitNewTicket = By.id("submit-btn");

    // Locators for title names and values of columns
    public static By titles = By.xpath("//tbody/tr[1]/th[contains(text(),'  ')]");
    public static By valuesID = By.xpath("//tbody/tr/td[2]");
    public static By valuesTitle = By.xpath("//tbody/tr/td[3]/a[1]");
    public static By valuesAssignee = By.xpath("//tbody/tr/td[6]");
    public static By valuesStage = By.xpath("//tbody/tr/td[7]");


    public void enterTicketsPage() {
        driver.findElement(ticketsList).click();
    }

    public void clickButtonNewTicket() {
        driver.findElement(createNewTicket).click();
    }

    public void inputTicketTitle() {
        driver.findElement(ticketTitle).sendKeys("New Ticket");
    }

    public void inputTicketDescription() {
        driver.findElement(ticketDescription);
    }

    public void selectTicketCategory() {
        driver.findElement(ticketCategory).click();
    }


    public void selectTicketStage() {
        driver.findElement(ticketStage).click();
    }

    public void inputTicketCompany() {
        driver.findElement(ticketCompany).sendKeys("Snowball");
    }

    public void selectTicketContact() {
        driver.findElement(ticketContact).sendKeys("Nataliia Melnyk");
    }

    public void selectTicketPriority() {
        driver.findElement(ticketPriority).click();
    }

    public void inputTicketDepartment() {
        driver.findElement(ticketDepartment).sendKeys("Managers");
    }

    public void inputTicketManager() {
        driver.findElement(ticketManager);
    }

    public void selectTicketFiles() {
        driver.findElement(ticketAddFiles);
    }

    public void submitNewTicket() {
        driver.findElement(submitNewTicket).click();
    }

    // Getting list of elements and printing to the console
    public void getAllTitlesAndValues(By webElements) {
        List<WebElement> titleNames = driver.findElements(webElements);
        for (int i = 1; i < titleNames.size(); i++) {
            System.out.println(titleNames.get(i).getText());
        }
    }
}






