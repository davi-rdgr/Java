package uc10_02.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Classe de conexão com o banco de dados
 *
 * @author Davi Rodeghiero Souza
 */
public class ConnectionDAO {

    /**
     *
     * @return retorna um objeto caso tenha sido efetuada, null caso não tenha
     * sido conectada.
     */
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/uc10_02", "root", "corpcapsule1");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não disponível");
            return null;
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
            return null;
        }

    }
}
