package connectSQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {
    private final String url = "jdbc:postgresql://localhost:5432/postgres";
    private final String user = "postgres";
    private final String password = "50111993";

    public Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connect to postgresql server successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}