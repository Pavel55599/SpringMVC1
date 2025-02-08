package dao;

import Model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    void createUsersTable() throws SQLException;                                   //создание таблицы юзеров

    void dropUsersTable() throws SQLException;                                     //удалить таблицу юзеров

    void saveUser(long id,String name, String lastName) throws SQLException;     //созранить юзера

    void removeUserById(long id) throws SQLException;                              //удальть юзера по ид

    List<User> getAllUsers() throws SQLException;                                  //получить всех пользователей список юзеров

    void cleanUsersTable();
}
