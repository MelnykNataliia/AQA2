package config;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.pages.BasePage;

import java.io.File;
import java.io.IOException;
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
        basePage.open("http://176.36.27.131:8180/#/login");
    }

    @AfterEach
    public void finish() {
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            // now copy the  screenshot to desired location using copyFile //method
            FileUtils.copyFile(src, new File("src/main/java/screenshot/Task21_2.png"));
        }

        catch (IOException e)
        {
            System.out.println(e.getMessage());

        }

        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
