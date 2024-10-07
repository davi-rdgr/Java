package utilities;

import entities.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

public class CadastroDAO {
    public void insertClient(Cliente cliente) {
        String sql = "INSERT INTO Cliente (name, lastname, born, email, password) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // para formatar o DateTime para String
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedBorn = cliente.getBorn().format(formatter); 

            stmt.setString(1, cliente.getName());
            stmt.setString(2, cliente.getLastName());
            stmt.setString(3, formattedBorn); 
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getPassword());

            stmt.executeUpdate(); 

        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }
}
