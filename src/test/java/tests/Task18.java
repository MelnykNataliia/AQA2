package tests;

import database.DataBase;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class Task18 {
    protected static DataBase managers = new DataBase();

    @Test
    public static void selectManagersWithContactData() throws SQLException, ClassNotFoundException {

        // Select the Full name from the table on Managers page where phone is not empty and email contains @gmail.com
        System.out.println(managers.getManager());
    }

    @Test
    public static void selectManagerWithDepartmentName() throws SQLException, ClassNotFoundException {

        // Select the Full name from the table on Managers page where Department = "Комната добра"
        System.out.println(managers.getFullName().values());
    }

    @Test
    public static void selectIdOfFinanceCategory() throws SQLException, ClassNotFoundException {

        // Select the ID from the table on dashboard page Done Deadline tab where Created from 19.04.2018 to 03.05.2018 and Category = "Финансы"
        System.out.println(managers.getId());
    }
}