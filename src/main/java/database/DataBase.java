package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DataBase {
    public void getConnection () {

        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection;

        try {
            InputStream input = new FileInputStream("src\\main\\java\\database\\DBConfig.properties");
            Properties prop = new Properties();
            prop.load(input);

            String db_name = prop.getProperty("db_name");
            String db_user = prop.getProperty("db_user");
            String db_pass = prop.getProperty("db_pass");

            try {
                connection = DriverManager
                        .getConnection(db_name, db_user, db_pass);

            } catch (SQLException e) {
                System.out.println("Connection Failed");
                e.printStackTrace();
                return;
            }

            if (connection != null) {
                System.out.println("You successfully connected to database now");
            } else {
                System.out.println("Failed to make connection to database");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

