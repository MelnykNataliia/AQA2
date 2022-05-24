package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    //Locator for tickets field
    By tickets = By.id("menu-tickets");

    //Method to enter tickets
    public void enterTicketsPage() {
        driver.findElement(tickets).click();
    }

    public static String getTextId() {
        String getId = driver.findElement(By.xpath("//tbody/tr[1]/th[2]")).getText();
        return getId;
    }

    public static String getTextTitle() {
        String getTitle = driver.findElement(By.xpath("//tbody/tr[1]/th[3]")).getText();
        return getTitle;
    }

    public static String getTextAssignee() {
        String getAssignee = driver.findElement(By.xpath("//th[contains(text(),'Assignee')]")).getText();
        return getAssignee;
    }

    public static String getTextStage() {
        String getStage = driver.findElement(By.xpath("//tbody/tr[1]/th[7]")).getText();
        return getStage;
    }

    public static String getTextValueId() {
        String getValueId = driver.findElement(By.xpath("//span[contains(text(),'INN-66')]")).getText();
        return getValueId;
    }

    public static String getTextValueTitle() {
        String getValueTitle = driver.findElement(By.xpath("//tbody/tr[2]/td[3]")).getText();
        return getValueTitle;
    }

    public static String getTextValueAssignee() {
        String getValueAssignee = driver.findElement(By.xpath("//tbody/tr[2]/td[6]")).getText();
        return getValueAssignee;
    }

    public static String getTextValueStage() {
        String getValueStage = driver.findElement(By.xpath("//tbody/tr[2]/td[7]/span[1]")).getText();
        return getValueStage;
    }
}


