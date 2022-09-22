package pageobjects.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.$;

public class BasePage_Selenide {
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		Configuration.browser = "chrome";
		Configuration.driverManagerEnabled = true;
		Configuration.browserSize = "1366x768";
		Configuration.headless = false;
	}

	public static void open(){
		Selenide.open("http://176.36.27.131:8180/#/login");
	}

	public static void login(String userName, String userPassword) {
		$("#username").sendKeys(userName);
		$("#password").sendKeys(userPassword);
		$("#login-signin").click();
	}

	@Before
	public void init(){
		setUp();
	}

	@After
	public void tearDown(){
		try {
			Thread.sleep(5000);
		} catch (
				InterruptedException e) {
			e.printStackTrace();
		}
		Selenide.closeWebDriver();
	}
}
