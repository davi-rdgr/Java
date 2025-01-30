package uc10_02.utilities;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LoginDAO {

    public LoginDAO() {
    }

    public User executeLogin(String login, String senha) {

        String nomeuser;
        String role_iduser;

        String SQL = "SELECT u.nome AS nome, r.role_name AS role FROM usuarios u INNER JOIN role r ON u.role_id = r.id WHERE u.nome = ? AND u.senha = ?";

        try (Connection conn = ConnectionDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    return new User(resultado.getString("nome"), resultado.getString("role"));
                } else {
                    JOptionPane.showMessageDialog(null, "As credenciais não estão corretas!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao executar login: " + e.getMessage());
        }
        return null;
    }
}
