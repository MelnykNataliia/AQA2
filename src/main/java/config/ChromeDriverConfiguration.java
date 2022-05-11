package config;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.pages.AtlassianLoginPage;
import pageobjects.pages.BasePage;
import pageobjects.pages.TrelloLoginPage;
import testdata.TestData;

import java.time.Duration;

import static pageobjects.pages.BasePage.driver;

public class ChromeDriverConfiguration {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mikhail\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    protected BasePage basePage = new BasePage(driver);
    protected TrelloLoginPage loginName = new TrelloLoginPage(driver);
    protected AtlassianLoginPage password = new AtlassianLoginPage(driver);
    protected TestData testData = new TestData();

    @BeforeEach
    public void start() {
        //Navigate to url
        basePage.open("https://trello.com/login");

        //Initialise Element
        PageFactory.initElements(driver, loginName);

        //Open login page with username
        loginName.loginTrello(testData.getUserName());

        //Navigate to url
        basePage.open("https://id.atlassian.com/login?application=trello&continue=https%3A%2F%2Ftrello.com%2Fauth%2Fatlassian%2Fcallback%3FreturnUrl%3D%252F%26display%3D%26aaOnboarding%3D%26updateEmail%3D%26traceId%3D626ed246b77157104bab75eafffa3404%26migrateGoogle%3D%26ssoVerified%3D&email=goodlucknat97%40gmail.com&errorCode&login_hint=goodlucknat97%40gmail.com&restrict=true");

        //Initialise Element
        PageFactory.initElements(driver, password);

        //Open login page with user password
        password.loginAtlassian(testData.getUserPassword());
    }

    @AfterEach
    public void finish() {
        try {
            Thread.sleep(5000);
        } catch (
                InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
