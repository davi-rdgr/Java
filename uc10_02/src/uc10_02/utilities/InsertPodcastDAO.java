package uc10_02.utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uc10_02.Produtos;

public class InsertPodcastDAO {

    Connection conn = ConnectionDAO.getConnection();

    public void insertPodcast(String produtor, String nome_ep, int numero_ep, String duracao, String url) {

        if (conn != null) {

            String SQL = "INSERT INTO podcast (produtor, nome_ep, num_ep, duracao, url) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement ps = conn.prepareStatement(SQL)) {
                ps.setString(1, produtor);
                ps.setString(2, nome_ep);
                ps.setInt(3, numero_ep);
                ps.setString(4, duracao);
                ps.setString(5, url);

                int rowsAffected = ps.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Podcast cadastrado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao inserir podcast!");
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao inserir podcast com o banco! " + e.getMessage());
            }
        }
    }

}
