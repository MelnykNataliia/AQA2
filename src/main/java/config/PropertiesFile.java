package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    static Properties prop;

    static {
        prop = new Properties();
    }

    public static void main(String[] args) {

        try (InputStream input = new FileInputStream("C:\\Users\\Mikhail\\IdeaProjects\\test-maven-project\\src\\main\\java\\config\\config.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            prop.getProperty("url");
            prop.getProperty("browserChrome");
            prop.getProperty("browserFirefox");
            prop.getProperty("login");
            prop.getProperty("password");

            prop.forEach((k, v) -> System.out.println("Key : " + k + ", Value : " + v));

        } catch (
                IOException io) {
            io.printStackTrace();
        }
    }
}
