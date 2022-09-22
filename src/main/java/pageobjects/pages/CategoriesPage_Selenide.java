package pageobjects.pages;

import com.codeborne.selenide.Selenide;
import utils.GlobalHelpers;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CategoriesPage_Selenide extends BasePage_Selenide {

	Logger logger = Logger.getLogger(CategoriesPage_Selenide.class.getName());

	// Method to enter categories page
	public void enterCategoriesPage() {
		logger.info("Navigating to the Categories page");

		$("#menu-categories").click();

		logger.info("Navigation to the Categories page successfully completed");
	}

	public void fillAllFieldsForCategory(String newCategoryTitle) {
		logger.info("Opening a form to create a new category, filling in all fields to create a new category and submitting the form");

		$("#new-category-btn").click();
		$("#name").sendKeys(newCategoryTitle);
		$("#category-form-submit").click();

		logger.info("New category form successfully submitted");
	}

	// Method finds the created category
	public void findNewCategory(String newCategoryTitle) {
		logger.info("Searching for a created category");

		$("#search-bar").sendKeys(newCategoryTitle);
		GlobalHelpers.sleepWait(3000);
		$("#search-bar-submit").click();

		logger.info("A new category was successfully found in the categories list");
	}

	// Method deletes the created category
	public void deleteCategory() {
		logger.info("Deleting category");

		$("#category-delete-btn").click();
		GlobalHelpers.sleepWait(3000);
		Selenide.switchTo().alert().accept();

		logger.info("The category was successfully delete");
	}

	// Method edits the created category
	public void editCategory(String newCategoryTitle, String newCategoryColor, String newCategoryStage) {
		logger.info("Editing a created category");

		$("#category-stage-edit-btn").click();
		$(byClassName("category-details_mini-wrap-edit-button")).click();
		$("#name").clear();
		$("#name").sendKeys(newCategoryTitle);
		GlobalHelpers.sleepWait(3000);
		$("#color").clear();
		$("#color").sendKeys(newCategoryColor);
		$("#category-form-submit").click();
		GlobalHelpers.sleepWait(3000);
		$("#stages-new-stage").click();
		$("#name").sendKeys(newCategoryStage);
		$("#stage-form-submit-btn").click();

		logger.info("The category was successfully edit");
	}

	// Method edits the category Stage
	public void editCategoryStage(String newCategoryStage) {
		logger.info("Editing category stage");

		$x("(//a[contains(text(),'New Category')])[1]").pressEnter();
		$("#category-details-edit").click();
		$("#category-form-submit").click();
		GlobalHelpers.sleepWait(3000);
		$("#stages-edit-btn").click();
		$("#name").clear();
		$("#name").sendKeys(newCategoryStage);
		$("#stage-form-submit-btn").click();

		logger.info("The category stage was successfully edit");
	}

	// Method deletes the category Stage
	public void deleteCategoryStage() {
		logger.info("Deleting category stage");

		$("#stages-delete-btn").click();
		Selenide.switchTo().alert().accept();

		logger.info("The category stage was successfully delete");
	}
}
