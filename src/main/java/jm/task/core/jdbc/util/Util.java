package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String u = "root";
    private static final String p = "root";
    private static final String url = "jdbc:mysql://localhost:3306/test";

    public static Connection connect() {

        try {
            return DriverManager.getConnection(url, u, p);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
