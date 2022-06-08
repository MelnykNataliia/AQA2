package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.pages.BasePage;

import java.time.Duration;

import static pageobjects.pages.BasePage.driver;

public class ChromeDriverConfiguration {
    public static WebDriver createDriver() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    protected BasePage basePage = new BasePage(driver);

    @BeforeEach
    public void start() {
        //Website open
        basePage.open("http://176.36.27.131:8180/#/login");
    }

    @AfterEach
    public void finish() {
        try {
            Thread.sleep(20000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
