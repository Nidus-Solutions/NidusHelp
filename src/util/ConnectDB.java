package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe utilitária para gerenciar a conexão com o banco de dados.
 * Centraliza a lógica de conexão, facilitando manutenção e testes.
 * Segue o princípio da Responsabilidade Única (SRP) de SOLID.
 */
public class ConnectDB {
    private static final String URL = "jdbc:mysql://localhost:3306/helpdesk"; 
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
