package org.mirrane.dao;

import org.mirrane.model.Secretary;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SecretaryDaoImp implements SecretaryDao {

    MyConnection myConnection;
    Connection connection;
    Statement statement;
    String sql;
    ResultSet rs;


    @Override
    public List<Secretary> getSecretaryList() {
        ArrayList<Secretary> secretaries = new ArrayList<>();
        try {
            myConnection = MyConnection.getInstance();
            connection = myConnection.getConnection();
            statement = connection.createStatement();

            sql = "SELECT cin, firstName, lastName FROM secretary";
            rs = statement.executeQuery(sql);

            while (rs.next()) {
                String cin = rs.getString("cin");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                secretaries.add(new Secretary(cin, firstName, lastName));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return secretaries;
    }

    @Override
    public void removeSecretary(String cin) {

    }

    @Override
    public void addSecretary(Secretary secretary) {

    }

    @Override
    public void updateSecretary(Secretary secretary) {

    }

    @Override
    public void getSecretary(String cin) {

    }
}
