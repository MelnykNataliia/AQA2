package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class DepartmentsPage extends BasePage {
    public DepartmentsPage(WebDriver driver) {
        super(driver);
    }

    Logger logger = Logger.getLogger(DepartmentsPage.class.getName());

    // Locators for departments field
    By departmentsList = By.id("menu-departments");
    By createNewDepartmentButton = By.id("new-department");
    By departmentTitle = By.id("name");
    By departmentAddInfo = By.id("department-form-additional-info");
    By departmentPhone = By.id("phone");
    By departmentEmail = By.id("email");
    By departmentCountry = By.id("country");
    By departmentCity = By.id("city");
    By submitNewDepartmentButton = By.id("department-form-submit");
    By checkNewDepartment = By.partialLinkText("Logistics Department");

    // Methods describe actions with elements
    public void fillAllFieldsForDepartment(String newDepartmentTitle, String newDepartmentPhone, String newDepartmentEmail, String newDepartmentCountry, String newDepartmentCity) {
        driver.findElement(createNewDepartmentButton).click();
        driver.findElement(departmentTitle).sendKeys(newDepartmentTitle);
        driver.findElement(departmentAddInfo).click();
        driver.findElement(departmentPhone).sendKeys(newDepartmentPhone);
        driver.findElement(departmentEmail).sendKeys(newDepartmentEmail);
        driver.findElement(departmentCountry).sendKeys(newDepartmentCountry);
        driver.findElement(departmentCity).sendKeys(newDepartmentCity);
        driver.findElement(submitNewDepartmentButton).click();
    }

    // Method to enter departments page
    public void enterDepartmentsPage() {
        logger.info("Navigating to the Departments page");

        driver.findElement(departmentsList).click();

        logger.info("Navigation to the Departments page successfully completed");
    }

    // Method finds the created department
    public void findNewDepartment() {
        logger.info("Searching for a created department");

        driver.findElement(checkNewDepartment).click();

        logger.info("A new department was successfully found in the departments list");
    }
}
