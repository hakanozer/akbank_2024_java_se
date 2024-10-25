package src.useDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {

    // driver, url, username, password
    private final String driver = "org.h2.Driver";
    private final String url = "jdbc:h2:file:~/akbank_2024_java_se";
    private final String username = "sa";
    private final String password = "sa";

    private Connection conn = null;

    public Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("DB Connection");
            }
        }catch (Exception ex) {
            System.err.println("getConnection: " + ex.getMessage());
        }
        return conn;
    }

    public void close() {
        try {
            if ( conn != null && !conn.isClosed() ) {
                conn.close();
            }
        }catch (Exception ex) {
            System.err.println("close: " + ex.getMessage());
        }
    }

}
