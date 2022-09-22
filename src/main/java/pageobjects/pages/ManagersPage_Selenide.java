package pageobjects.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import utils.GlobalHelpers;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selenide.$;

public class ManagersPage_Selenide extends BasePage_Selenide {
	Logger logger = Logger.getLogger(ManagersPage_Selenide.class.getName());

	// Method to enter managers page
	public void enterManagersPage() {
		logger.info("Navigating to the Managers page");

		$("#menu-managers").click();

		logger.info("Navigation to the Managers page successfully completed");
	}

	public void fillAllFieldsForManager(String firstName, String lastName, String email, String department, String phoneNumber, String skype) {
		logger.info("Opening a form to create a new manager, filling in all fields to create a new manager and submitting the form");

		$("#managers-new-manager").click();
		$("#firstName").sendKeys(firstName);
		$("#lastName").sendKeys(lastName);
		GlobalHelpers.sleepWait(2000);
		$("#email").sendKeys(email);
		$("#manager-form-department-select").sendKeys(department);
		$("#phone").sendKeys(phoneNumber);
		$("#skype").sendKeys(skype);
		$("#manager-form-submit").click();

		logger.info("New manager form successfully submitted");
	}

	// Method finds the created manager and open information
	public void searchManager(String firstName) {
		logger.info("Searching for a created manager");

		$("#search-manager-firstname").sendKeys(firstName);
		GlobalHelpers.sleepWait(3000);
		$("#search-manager-filter").click();
		$(By.partialLinkText(firstName)).click();

		logger.info("A new manager was successfully found in the managers list");
	}

	// Method finds the created manager and open information
	public void filterManager(String firstName, String lastName, String department) {
		logger.info("Searching for a created manager");

		$("#search-manager-firstname").sendKeys(firstName);
		$("#search-manager-lastname").sendKeys(lastName);
		$("#search-manager-department").sendKeys(department);
		GlobalHelpers.sleepWait(3000);
		$("#search-manager-filter").click();

		logger.info("A new manager was successfully found in the managers list");
	}

	// Method edits the created manager
	public void editManager(String firstName, String lastName) {
		logger.info("Editing a created manager");

		$("#managers-edit-btn").click();
		$("#firstName").clear();
		$("#firstName").sendKeys(firstName);
		GlobalHelpers.sleepWait(3000);
		$("#lastName").clear();
		$("#lastName").sendKeys(lastName);
		GlobalHelpers.sleepWait(3000);
		$("#manager-form-submit").click();

		logger.info("The contact was successfully edit");
	}

	// Method deletes the created manager
	public void deleteManager() {
		$("#managers-delete-btn").click();
		GlobalHelpers.sleepWait(3000);
		Selenide.switchTo().alert().accept();
	}

	public void errorDelete() {
		$("#infoModal").shouldBe(Condition.visible);
		{
			System.out.println("Internal Server Error");
		}
	}

	// Method clears filters
	public void clearFilter() {
		$("#search-manager-clear").click();
	}

	// Method sorts managers by full name
	public void sortByFullName() {
		$("#managers-fullname-sort-asc").click();
	}

	// Method sorts managers by department
	public void sortByDepartment() {
		$("#managers-department-sort-asc").click();
	}

	// Pagination
	public void moveThroughPages(int offsetFromActual) {
		SelenideElement ul = $(By.className("ngx-pagination"));
		ElementsCollection col = ul.$$x(".//li");
		SelenideElement active = col.find(Condition.cssClass("current"));
		int index = col.indexOf(active);
		index = index + offsetFromActual;
		col.get(index).$x(".//a").click();
	}

}
