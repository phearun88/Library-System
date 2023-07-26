package repository;

import controller.ConnectManager;
import model.Role;
import model.UserAccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccountRepository {
    private Connection connection;

    public UserAccount login(String username, String password) throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select * from user_account where username = '%s' and password = '%s'", username, password);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            throw new Exception("Username or password is incorrect.");

        return new UserAccount(rs.getInt("id"),
                rs.getString("username"),
                getRole(rs.getInt("role_id")));
    }
    private Role getRole(int id) throws SQLException, Exception {

        connection = ConnectManager.getConnection();
        String query = String.format("select * from role where id = '%s'", id);
        PreparedStatement stat = connection.prepareStatement(query);
        ResultSet rs = stat.executeQuery();

        if (!rs.next())
            throw new Exception("Role id is not correct.");

        return new Role(rs.getInt("id"),
                rs.getString("name"));
    }
}
