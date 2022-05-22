package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.pages.BasePage;
import pageobjects.pages.LoginPage;

import java.time.Duration;

import static pageobjects.pages.BasePage.driver;

public class ChromeDriverConfiguration {
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    protected BasePage basePage = new BasePage(driver);
    protected LoginPage login = new LoginPage(driver);

    @BeforeEach
    public void start() {
        //Website open
        basePage.open("http://176.36.27.131:8180/#/login");

        //Enter login & password
        login.enterUsername("thadmin");
        login.enterPassword("tickethub");

        //Click on signIn button
        login.clickSignIn();
    }

    @AfterEach
    public void finish() {
        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
