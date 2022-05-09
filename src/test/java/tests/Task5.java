package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {
    @Test
    public void testOpenWebsiteInChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://217.66.99.253:8180/#/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    @Test
    public void testOpenWebsiteInFirefoxBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mikhail\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://217.66.99.253:8180/#/login");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

