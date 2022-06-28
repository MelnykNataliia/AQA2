package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.GlobalHelpers;

public class ManagersPage extends BasePage {
    public ManagersPage(WebDriver driver) {
        super(driver);
    }

    // Locators for managers field
    By managersList = By.id("menu-managers");
    By createNewManagerButton = By.id("managers-new-manager");
    By managerFirstName = By.id("firstName");
    By managerLastName = By.id("lastName");
    By managerEmail = By.id("email");
    By managerDepartment = By.id("manager-form-department-select");
    By managerPhoneNumber = By.id("phone");
    By managerSkype = By.id("skype");
    By submitNewManagerButton = By.id("manager-form-submit");
    By searchBar = By.id("search-manager-firstname");
    By filterButton = By.id("search-manager-filter");

    // Method to enter managers page
    public void enterManagersPage() {
        driver.findElement(managersList).click();
    }

    // Methods describe actions with elements
    public void fillAllFieldsForManager(String firstName, String lastName, String email, String department, int phoneNumber, String skype) {
        driver.findElement(createNewManagerButton).click();
        driver.findElement(managerFirstName).sendKeys(firstName);
        driver.findElement(managerLastName).sendKeys(lastName);
        driver.findElement(managerEmail).sendKeys(email);
        driver.findElement(managerDepartment).sendKeys(department);
        driver.findElement(managerPhoneNumber).sendKeys(String.valueOf(phoneNumber));
        driver.findElement(managerSkype).sendKeys(skype);
        driver.findElement(submitNewManagerButton).click();
    }

    // Method finds the created manager and open information
    public void searchManager(String firstName) {
        driver.findElement(searchBar).sendKeys(firstName);
        GlobalHelpers.sleepWait(3000);
        driver.findElement(filterButton).click();
        driver.findElement(By.partialLinkText(firstName)).click();
    }
}
