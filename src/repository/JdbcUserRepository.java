package repository;

import model.User;
import util.ConnectDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface UsuarioRepository utilizando JDBC.
 * Segue o princípio Aberto/Fechado (OCP) de SOLID, permitindo extensão com
 * outras implementações.
 */

public class JdbcUserRepository implements UserRepository {

    @Override
    public void updateUser() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void insertUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertUser'");
    }

    @Override
    public User findUserById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserById'");
    }

    @Override
    public List<User> listUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listUsers'");
    }

}
