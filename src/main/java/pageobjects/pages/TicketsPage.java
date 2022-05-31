package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.LinkedList;
import java.util.List;

public class TicketsPage extends BasePage {
    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    // Locator for tickets field
    By tickets = By.id("menu-tickets");

    // Method to enter tickets
    public void enterTicketsPage() {
        driver.findElement(tickets).click();
    }

    // Locators and methods for column values
    public WebElement getIdTitle() {
        WebElement titleId = driver.findElement(By.xpath("//tbody/tr[1]/th[2]"));
        return titleId;
    }

    public WebElement getTitle() {
        WebElement title = driver.findElement(By.xpath("//tbody/tr[1]/th[3]"));
        return title;
    }

    public WebElement getAssigneeTitle() {
        WebElement titleAssignee = driver.findElement(By.xpath("//th[contains(text(),'Assignee')]"));
        return titleAssignee;
    }

    public WebElement getStageTitle() {
        WebElement titleStage = driver.findElement(By.xpath("//tbody/tr[1]/th[7]"));
        return titleStage;
    }

    public WebElement getValueId() {
        WebElement valueId = driver.findElement(By.xpath("//tbody/tr[2]/td[2]"));
        return valueId;
    }

    public WebElement getValueTitle() {
        WebElement valueTitle = driver.findElement(By.xpath("//tbody/tr[2]/td[3]"));
        return valueTitle;
    }

    public WebElement getValueAssignee() {
        WebElement valueAssignee = driver.findElement(By.xpath("//tbody/tr[2]/td[6]"));
        return valueAssignee;
    }

    public WebElement getValueStage() {
        WebElement valueStage = driver.findElement(By.xpath("//tbody/tr[2]/td[7]"));
        return valueStage;
    }

    // Return a List<WebElement> of title names
    public List<WebElement> getTitleOfColumns() {
        List<WebElement> titleNames = new LinkedList<>();
        titleNames.add(getIdTitle());
        titleNames.add(getTitle());
        titleNames.add(getAssigneeTitle());
        titleNames.add(getStageTitle());
        return titleNames;
    }

    // Return a List<WebElement> of values
    public List<WebElement> getValueOfColumns() {
        List<WebElement> valueColumns = new LinkedList<>();
        valueColumns.add(getValueId());
        valueColumns.add(getValueTitle());
        valueColumns.add(getValueAssignee());
        valueColumns.add(getValueStage());
        return valueColumns;
    }

    // Gets List<WebElement> and prints title names to the console
    public void getTitleNames(List<WebElement> webElements) {
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
        }
    }

    // Gets List<WebElement> and prints the values to the console
    public void getColumnsValue(List<WebElement> webElements) {
        for (int i = 0; i < webElements.size(); i++) {
            System.out.println(webElements.get(i).getText());
        }
    }
}



