package pageobjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.GlobalHelpers;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactsPage extends BasePage {
	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	public static ContactsPage using(WebDriver driver) {
		return new ContactsPage(driver);
	}

	Logger logger = Logger.getLogger(ContactsPage.class.getName());

	// Locators for contacts field
	By contacts = By.id("menu-contacts");
	By newContact = By.id("new-contact");
	By firstName = By.id("firstName");
	By lastName = By.id("lastName");
	By email = By.id("email");
	By prefix = By.id("ticketPrefix");
	By submit = By.id("contact-form-submit");

	// Method to enter contacts page
	public ContactsPage enterContactsPage() {

		logger.info("Navigating to the Contacts page");

		driver.findElement(contacts).click();

		logger.info("Navigation to the Contacts page successfully completed");
		return this;
	}

	public ContactsPage enterNewContact() {
		driver.findElement(newContact).click();
		return this;
	}

	public ContactsPage getFirstName(String contactFirstName) {
		driver.findElement(firstName).sendKeys(contactFirstName);
		return this;
	}

	public ContactsPage getLastName(String contactLastName) {
		driver.findElement(lastName).sendKeys(contactLastName);
		return this;
	}

	public ContactsPage getEmail(String contactEmail) {
		driver.findElement(email).sendKeys(contactEmail);
		return this;
	}

	public ContactsPage getPrefix() {
		driver.findElement(prefix);
		return this;
	}

	public void submitButton() {
		GlobalHelpers.sleepWait(3000);
		driver.findElement(submit).click();
	}

	public boolean isEmailValid(String input) {
		boolean isValid = false;

		String expression = "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
				+ "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
				+ "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
				+ "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
				+ "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
				+ "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

		Pattern pattern = Pattern.compile(expression,
				Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(input);

		if (matcher.matches()) {
			isValid = true;
		}

		return isValid;
	}

	public boolean isEmailEmpty(String input) {
		return input.isEmpty();
	}

	public boolean validLogin(int length) {
		return length >= 2;
	}

	public boolean validPrefix(String input) {
		return input.length() >= 3 && input.length() <= 6;
	}

	public boolean validLastName(int length) {
		return length >= 2;
	}
}

