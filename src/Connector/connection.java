package Connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    static String databasename = "bugdb";
    static String url = "jdbc:mysql://localhost:3306/";
    static String user = "root";
    static String pass = "root";

    public static Connection getConnection(String database) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url + database, user, pass);
        return con;

    }
}
