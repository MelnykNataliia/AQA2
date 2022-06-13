package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testdata.TestData;

public class СompaniesPage extends BasePage {
    public СompaniesPage(WebDriver driver) {
        super(driver);
    }

    // Locator for companies field
    By companiesList = By.id("menu-companies");
    By createNewCompanyButton = By.id("new-company");
    By companyTitle = By.id("name");
    By companyAddInfo = By.id("company-additional-information");
    By companyCountry = By.id("company-country");
    By companyCity = By.id("company-city");
    By companyPhone= By.id("company.phone");
    By companyServiceProgram= By.id("company-sla-level-1");
    By submitNewCompanyButton = By.id("company-submit-btn");

    // Methods describe actions with elements
    public void fillAllFieldsForDepartment() {
        driver.findElement(createNewCompanyButton).click();
        driver.findElement(companyTitle).sendKeys(TestData.ticketCompany);
        driver.findElement(companyAddInfo).click();
        driver.findElement(companyCountry).sendKeys(TestData.departmentCountry);
        driver.findElement(companyCity).sendKeys(TestData.departmentCity);
        driver.findElement(companyPhone).sendKeys(TestData.departmentPhone);
        driver.findElement(companyServiceProgram).click();
        driver.findElement(submitNewCompanyButton).click();
    }

    //Method to enter companies page
    public void enterDepartmentsPage() {
        driver.findElement(companiesList).click();
    }
}

