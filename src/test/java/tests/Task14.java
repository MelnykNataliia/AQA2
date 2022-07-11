package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.pages.DevicesPage;
import pageobjects.pages.LoginPage;
import testdata.TestData;


public class Task14 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();

    @Test
    public void createNewDevice() {

        // Website login
        LoginPage.using(driver)
                .login(TestData.userName, TestData.userPassword);

        // Opens devices page and form for creation of new device
        DevicesPage.using(driver)
                .enterDevicesPage()
                .newDeviceButton();

        // Fills in all form fields for a new device
        DevicesPage newDevice = new DevicesPage.Builder()
                .withTitle("device")
                .withIp("LP-CRM:")
                .withPort("241.123.201.100:7887")
                .withPassword("NewDevice")
                .withCompany("Snowball")
                .withContact("Nataliia Melnyk")
                .build();
    }
}
