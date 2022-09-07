package tests;

import config.ChromeDriverConfiguration;
import database.DataBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import pageobjects.pages.LoginPage;
import pageobjects.pages.ManagersPage;
import testdata.TestData;
import utils.GlobalHelpers;
import utils.Listener;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Logger;

@Listeners(Listener.class)
public class Task21 extends ChromeDriverConfiguration {
	protected WebDriver driver = ChromeDriverConfiguration.createDriver();
	protected ManagersPage managers = new ManagersPage(driver);
	protected DataBase newManager = new DataBase();

	Logger logger = Logger.getLogger(Task21.class.getName());

	@Test
	public void createManager() throws SQLException, ClassNotFoundException {

		logger.info("Running a test to create a new manager and compare the entered value and created parameters in the table \n" +
				"and compare the created parameters and DB parameters in the table");

		HashMap<String, String> hashMap = new HashMap<>();

		// Test data
		String firstName = "Oliver";
		String lastName = "Williams";
		String email = "oli_wi87@gmail.com";
		String department = "Managers";
		String phoneNumber = "+13475474258";
		String skype = "OliWilli_87";

		// Saves data
		hashMap.put("firstName", firstName);
		hashMap.put("lastName", lastName);
		hashMap.put("email", email);
		hashMap.put("department", department);
		hashMap.put("phoneNumber", phoneNumber);
		hashMap.put("skype", skype);

		// SQL Queries
		String selectFullName = "select concat (first_name, ' ', last_name) as full_name\n" +
				"from manager\n" +
				"    join department\n" +
				"        on manager.department_id = department.id\n" +
				"               and first_name = 'Oliver'\n" +
				"               and department.name = 'Managers'\n" +
				"limit 1;";

		String selectEmail = "select manager.login\n" +
				"from manager\n" +
				"where first_name = 'Oliver'\n" +
				"limit 1;";

		String selectDepartment = "select department.name from department\n" +
				"    join manager m\n" +
				"        on department.id = m.department_id\n" +
				"               and m.first_name = 'Oliver'\n" +
				"limit 1;";

		String selectPhoneNumber = "select manager.phone from manager\n" +
				"where first_name = 'Oliver'\n" +
				"limit 1;";

		String selectSkype = "select manager.skype from manager\n" +
				"where first_name = 'Oliver'\n" +
				"limit 1;";

		// Website login
		LoginPage.using(driver)
				 .login(TestData.userName, TestData.userPassword);

		// Open Managers page
		managers.enterManagersPage();

		// Page load delay
		GlobalHelpers.sleepWait(5000);

		// Fills all fields and submit the form for new manager
		managers.fillAllFieldsForManager(hashMap.get("firstName"), hashMap.get("lastName"), hashMap.get("email"), hashMap.get("department"), hashMap.get("phoneNumber"), hashMap.get("skype"));

		// Finds the created manager and open information
		managers.searchManager(hashMap.get("firstName"));

		logger.info("Comparing the entered value and created parameters in the table on the managers page using the assertion methods");

		// Comparing the entered value and created parameters in the table on the managers page using the assertion methods
		Assertions.assertEquals(driver.findElement(ManagersPage.name).getText(), hashMap.get("firstName") + " " + hashMap.get("lastName"));
		Assertions.assertEquals(driver.findElement(ManagersPage.email).getText(), hashMap.get("email"));
		Assertions.assertEquals(driver.findElement(ManagersPage.department).getText(), hashMap.get("department"));
		Assertions.assertEquals(driver.findElement(ManagersPage.phone).getText(), hashMap.get("phoneNumber"));
		Assertions.assertEquals(driver.findElement(ManagersPage.skype).getText(), hashMap.get("skype"));

		logger.info("Comparing was successfully passed, entered value match created parameters in the table");

		// Page load delay
		GlobalHelpers.sleepWait(5000);

		logger.info("Comparing the created parameters and DB parameters in the table on the managers page using the assertion methods");

		// Comparing the created parameters and DB parameters in the table on the managers page using the assertion methods
		Assertions.assertEquals(newManager.managerFirstName(selectFullName), hashMap.get("firstName") + " " + hashMap.get("lastName"));
		Assertions.assertEquals(newManager.managerEmail(selectEmail), hashMap.get("email"));
		Assertions.assertEquals(newManager.managerDepartment(selectDepartment), hashMap.get("department"));
		Assertions.assertEquals(newManager.managerPhone(selectPhoneNumber), hashMap.get("phoneNumber"));
		Assertions.assertEquals(newManager.managerSkype(selectSkype), hashMap.get("skype"));

		logger.info("Comparing was successfully passed, created parameters match DB parameters in the table");

		logger.info("The test was successfully passed, entered value match created parameters in the table," +
				"created parameters match DB parameters in the table");
	}
}
