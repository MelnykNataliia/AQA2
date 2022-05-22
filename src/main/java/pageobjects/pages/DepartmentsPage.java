package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartmentsPage extends BasePage {
    public DepartmentsPage(WebDriver driver) {
        super(driver);
    }

    //Locator for departments field
    By departments = By.id("menu-departments");

    //Method to enter departments
    public void enterDepartmentsPage() {
        driver.findElement(departments).click();
    }
}
