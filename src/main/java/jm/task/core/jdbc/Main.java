package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        UserDao user  = new UserDaoJDBCImpl();

        user.createUsersTable();

        user.saveUser("Фёдор", "Скворцов", (byte) 43);
        user.saveUser("Александра", "Жукова", (byte) 25);
        user.saveUser("Дарья", "Лопатина", (byte) 15);
        user.saveUser("Маргарита", "Иванова", (byte) 97);

        System.out.println(user.getAllUsers());

        user.cleanUsersTable();
        user.dropUsersTable();

    }
}
