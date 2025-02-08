package dao;

import Model.User;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {


    @Override
    public void createUsersTable() throws SQLException {

    }

    @Override
    public void dropUsersTable() throws SQLException {

    }

    @Override
    public void saveUser(long id,String name, String lastName) throws SQLException {

    }

    @Override
    public void removeUserById(long id) throws SQLException {

    }

    @Override
    public List<User> getAllUsers() throws SQLException {
        return List.of();
    }

    @Override
    public void cleanUsersTable() {

    }
}
