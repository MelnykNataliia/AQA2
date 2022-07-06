package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.ContactsPage;
import pageobjects.pages.LoginPage;
import testdata.TestData;
import utils.RandomGenerator;


public class Task13 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();


    @Test
    public void createNewContact() {
        RandomGenerator randomManager = new RandomGenerator();

        // Test data
        String contactFirstName = randomManager.getRandomString(7);
        String contactLastName = randomManager.getRandomString(9);
        String contactEmail = randomManager.getRandomEmail(6);

        // Website login
        LoginPage.using(driver)
                .enterUsername(TestData.userName)
                .enterPassword(TestData.userPassword)
                .clickSignIn();

        // Fills all fields and submit the form for new contact
        ContactsPage.using(driver)
                .enterContactsPage()
                .enterNewContact()
                .getFirstName(contactFirstName)
                .getLastName(contactLastName)
                .getEmail(contactEmail)
                .submitButton();
    }
}
