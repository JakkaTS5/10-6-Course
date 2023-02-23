import java.sql.Connection;

import connectSQL.ConnectDB;
import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello");
        ConnectDB connectDB = new ConnectDB();
        Connection conn = connectDB.connect();
    }
    public
}
