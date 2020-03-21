package org.mirrane.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    private static MyConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/clinic";
    private String username = "root";
    private String password = "";

    private MyConnection() throws SQLException {
        //Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(url, username, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public static MyConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new MyConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new MyConnection();
        }

        return instance;
    }
}
