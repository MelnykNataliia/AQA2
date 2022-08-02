package tests;

import database.DataBase;
import org.testng.annotations.Test;

public class Task18 extends DataBase {
    protected static DataBase conn = new DataBase();

    @Test
    public void db_connection() {
        conn.getConnection();
    }
}