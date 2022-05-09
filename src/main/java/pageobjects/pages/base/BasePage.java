package pageobjects.pages.base;

import org.openqa.selenium.WebDriver;

public class BasePage {
    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public BasePage() {
    }

    public void open(String url) {
        driver.get(url);
    }

}
