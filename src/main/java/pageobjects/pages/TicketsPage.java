package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "menu-tickets")
    WebElement tickets;

    @FindBy(id = "OPEN")
    WebElement ticketsOpen;

    @FindBy(id = "IN PROGRESS")
    WebElement ticketsInProgress;

    @FindBy(id = "DONE")
    WebElement ticketsDone;

    @FindBy(id = "stage-total")
    WebElement ticketsTotal;

    @FindBy(id = "stage-closed")
    WebElement ticketsClosed;

    public void enterTickets() {
        tickets.click();
    }

    public void enterTicketsInProgress() {
        ticketsInProgress.click();
    }

    public void enterTicketsDone() {
        ticketsDone.click();
    }

    public void enterTicketsTotal() {
        ticketsTotal.click();
    }

    public void enterTicketsClosed() {
        ticketsClosed.click();
    }


    public static String getTextId() {
        String textId = driver.findElement(By.xpath("//tbody/tr[1]/th[2]")).getText();
        return textId;
    }

    public static String getCompanyId() {
        String companyId = driver.findElement(By.xpath("//tbody/tr[2]/td[2]")).getText();
        return companyId;
    }

    public static String getTextTitle() {
        String textTitle = driver.findElement(By.xpath("//tbody/tr[1]/th[3]")).getText();
        return textTitle;
    }

    public static String getCompanyTitle() {
        String companyTitle = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
        return companyTitle;
    }

    public static String getTextAssignee() {
        String textAssignee = driver.findElement(By.xpath("//th[contains(text(),'Assignee')]")).getText();
        return textAssignee;
    }

    public static String getCompanyAssignee() {
        String companyAssignee = driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText();
        return companyAssignee;
    }

    public static String getTextStage() {
        String textStage = driver.findElement(By.xpath("//tbody/tr[1]/th[7]")).getText();
        return textStage;
    }

    public static String getCompanyStage() {
        String companyStage = driver.findElement(By.xpath("//tbody/tr[2]/td[7]")).getText();
        return companyStage;
    }
}
