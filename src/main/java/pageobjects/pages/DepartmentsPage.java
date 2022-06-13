package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testdata.TestData;

public class DepartmentsPage extends BasePage {
    public DepartmentsPage(WebDriver driver) {
        super(driver);
    }

    //Locator for departments field
    By departmentsList = By.id("menu-departments");
    By createNewDepartmentButton = By.id("new-department");
    By departmentTitle = By.id("name");
    By departmentAddInfo = By.id("department-form-additional-info");
    By departmentPhone = By.id("phone");
    By departmentEmail = By.id("email");
    By departmentCountry = By.id("country");
    By departmentCity = By.id("city");
    By submitNewDepartmentButton = By.id("department-form-submit");

    // Methods describe actions with elements
    public void fillAllFieldsForDepartment() {
        driver.findElement(createNewDepartmentButton).click();
        driver.findElement(departmentTitle).sendKeys(TestData.departmentTitle);
        driver.findElement(departmentAddInfo).click();
        driver.findElement(departmentPhone).sendKeys(TestData.departmentPhone);
        driver.findElement(departmentEmail).sendKeys(TestData.departmentEmail);
        driver.findElement(departmentCountry).sendKeys(TestData.departmentCountry);
        driver.findElement(departmentCity).sendKeys(TestData.departmentCity);
        driver.findElement(submitNewDepartmentButton).click();
    }

    //Method to enter departments page
    public void enterDepartmentsPage() {
        driver.findElement(departmentsList).click();
    }
}
