package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

public class DataBase {
    Connection con;

    // Database connection method
    public void connection() throws ClassNotFoundException {
        try {
            InputStream input = new FileInputStream("src\\main\\java\\database\\DBConfig.properties");
            Properties prop = new Properties();
            prop.load(input);

            String db_name = prop.getProperty("db_name");
            String db_user = prop.getProperty("db_user");
            String db_pass = prop.getProperty("db_pass");
            try {
                Class.forName("org.postgresql.Driver");
                con = DriverManager.getConnection(db_name, db_user, db_pass);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // SQL request method that return String
    public String getManager() throws ClassNotFoundException, SQLException {
        String sql = "select concat(manager.first_name, ' ', manager.last_name) as full_name, phone, email from manager where phone is not null and email like '%@gmail.com'";

        this.connection();

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        StringBuilder managersFullName = new StringBuilder();

        while (resultSet.next()) {
            String manager = resultSet.getString("full_name");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");

            managersFullName.append(manager).append(" ").append(phone).append(" ").append(email);
        }

        return managersFullName.toString();
    }

    // SQL request method that return Map
    public Map<String, String> getFullName() throws ClassNotFoundException, SQLException {
        Map<String, String> map = new HashMap<>();
        String sql = "select concat(manager.first_name, ' ', manager.last_name) as full_name, department.name from manager join department on manager.department_id = department.id where department.name = 'Комната добра'";

        this.connection();

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) map.put(resultSet.getString("name"), resultSet.getString("full_name"));

        return map;
    }

    // SQL request method that return List
    public List<String> getId() throws ClassNotFoundException, SQLException {
        List<String> financeId = new ArrayList<>();

        String sql = "select ticket.id, category.name from ticket join category on ticket.category_id = category.id and ticket.done_deadline between '19.04.2018' and '03.05.2018' and category.name = 'Финансы'";

        this.connection();

        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String category = resultSet.getString("name");

            financeId.add(id);
            financeId.add(category);
        }

        return financeId;
    }
}

