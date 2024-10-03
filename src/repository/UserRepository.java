package repository;

import java.util.List;
import model.User;

/**
 * Interface do repositório de usuários.
 * Define as operações CRUD para 'Usuario'.
 * Segue o princípio da Inversão de Dependência (DIP) de SOLID.
 */

public interface UserRepository {
    void insertUser(User user);

    User findUserById(int id);

    List<User> listUsers();

    void updateUser();

    void deleteUser(int id);
}
