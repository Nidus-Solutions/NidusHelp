package model;

/**
 * Classe modelo para o usuário.
 * Representa a entidade 'Usuario' no sistema.
 * Segue o princípio da Responsabilidade Única (SRP) de SOLID.
 */

public class User {
    private int id;
    private String username;
    private String email;
    private String userType;

    public User(String username, String email, String userType) {
        this.username = username;
        this.email = email;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
