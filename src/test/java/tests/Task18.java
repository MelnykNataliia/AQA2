package tests;

import database.DataBase;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class Task18 {
    protected static DataBase managers = new DataBase();

    @Test
    public static void selectManagersWithContactData() throws SQLException, ClassNotFoundException {

        // Select the Full name from the table on Managers page where phone is not empty and email contains @gmail.com
        System.out.println(managers.getManager("select concat(manager.first_name, ' ', manager.last_name) as full_name, phone, email from manager where phone is not null and email like '%@gmail.com'"));
    }

    @Test
    public static void selectManagerWithDepartmentName() throws SQLException, ClassNotFoundException {

        // Select the Full name from the table on Managers page where Department = "Комната добра"
        System.out.println(managers.getFullName("select concat(manager.first_name, ' ', manager.last_name) as full_name, department.name from manager join department on manager.department_id = department.id where department.name = 'Комната добра'").values());
    }

    @Test
    public static void selectIdOfFinanceCategory() throws SQLException, ClassNotFoundException {

        // Select the ID from the table on dashboard page Done Deadline tab where Created from 19.04.2018 to 03.05.2018 and Category = "Финансы"
        System.out.println(managers.getId("select ticket.id, category.name from ticket join category on ticket.category_id = category.id and ticket.done_deadline between '19.04.2018' and '03.05.2018' and category.name = 'Финансы'"));
    }
}