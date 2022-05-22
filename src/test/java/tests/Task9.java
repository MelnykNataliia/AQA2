package tests;

import config.ChromeDriverConfiguration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Task9 extends ChromeDriverConfiguration {
    protected WebDriver driver = ChromeDriverConfiguration.createDriver();

    @Test
    public void testGetTitleNames() {

        List<WebElement> ticketId = driver.findElements(By.xpath("//td[2]"));
        for (WebElement e : ticketId){
            System.out.println("Id" + " " + e.getText());
        }

        List<WebElement> ticketTitle = driver.findElements(By.xpath("//td[3]"));
        for (WebElement e : ticketTitle) {
            System.out.println("Title" + " " + e.getText());
        }

        List<WebElement> ticketAssignee = driver.findElements(By.xpath("//td[6]"));
        for (WebElement e : ticketAssignee) {
            System.out.println("Assignee" + " " + e.getText());
        }

        List<WebElement> ticketStage = driver.findElements(By.xpath("//td[7]"));
        for (WebElement e : ticketStage) {
            System.out.println("Stage" + " " + e.getText());
        }
    }
}
