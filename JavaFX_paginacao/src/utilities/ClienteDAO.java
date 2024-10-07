package utilities;

import entities.Cliente;
import java.sql.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import utilities.DBConnection;

public class ClienteDAO {

    public ObservableList<Cliente> getAllClientes() {
        ObservableList<Cliente> clientesList = FXCollections.observableArrayList();

        String sql = "SELECT superUser, name, email FROM Cliente";

        try (Connection conn = DBConnection.getConnection(); 
             Statement stmt = conn.createStatement(); 
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                String name = rs.getString("name");
                boolean superUser = rs.getBoolean("superUser"); // Agora como boolean
                String email = rs.getString("email");

                // Caso a classe Cliente use String para superUser
                Cliente cliente = new Cliente(superUser, name, email);

                // Adiciona o cliente na lista
                clientesList.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientesList;
    }
}
