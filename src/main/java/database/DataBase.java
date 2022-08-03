package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DataBase {
    Connection con;
    Statement stmt;

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

    public Statement getStatement() {
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stmt;
    }
}

