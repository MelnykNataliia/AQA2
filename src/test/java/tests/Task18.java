package tests;

import database.DataBase;
import org.testng.annotations.Test;

public class Task18 {
    protected static DataBase conn = new DataBase();

    @Test
    public void db_connection() {
        try {
            conn.connection();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}