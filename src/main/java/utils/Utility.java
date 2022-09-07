package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import static pageobjects.pages.BasePage.driver;

public class Utility {
	public static void captureScreenshot() {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			FileHandler.copy(src, new File("src/main/java/captureScreenshot/Screenshot_" + timestamp() + ".png"));

			System.out.println("Screenshot taken");
		} catch (Exception e) {

			System.out.println("Exception while taking screenshot " + e.getMessage());
		}
	}

	private static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd; HH-mm-ss").format(new Date());
	}

}

