package pageobjects.repo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesObject {
    public static void main(String[] args) throws IOException {

        Properties obj = new Properties();
        FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "\\<Object_Repo.properties>");
        obj.load(objfile);

        String username = obj.getProperty("bigom.login.username.xpath");
        String password = obj.getProperty("bigom.login.password.xpath");
        String SignIn = obj.getProperty("bigom.login.SignIn.xpath");
        String Dashboard = obj.getProperty("bigom.menu.Dashboard.xpath");
        String Tickets = obj.getProperty("bigom.menu.Tickets.xpath");
        String Companies = obj.getProperty("bigom.menu.Companies.xpath");
        String Contacts = obj.getProperty("bigom.menu.Contacts.xpath");
        String Devices = obj.getProperty("bigom.menu.Devices.xpath");
        String Departments = obj.getProperty("bigom.menu.Departments.xpath");
        String Managers = obj.getProperty("bigom.menu.Managers.xpath");
        String Categories = obj.getProperty("bigom.menu.Categories.xpath");
        String NewTicket = obj.getProperty("bigom.page.Tickets.NewTicket.xpath");
        String NewContact = obj.getProperty("bigom.page.Contacts.NewContact.xpath");
        String NewDepartment = obj.getProperty("bigom.page.Departments.NewDepartment.xpath");
        String NewCategory = obj.getProperty("bigom.page.Categories.NewCategory.xpath");
    }
}
