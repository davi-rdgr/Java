package utilities;

import entities.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EntrarDAO {

    public boolean loginVerify(String email, String senha) {
        String sql = "SELECT * FROM Cliente WHERE email = ? AND password = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            // substituindo pelos parametros
            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setName(rs.getString("name"));
                cliente.setLastName(rs.getString("lastname"));
                cliente.setBorn(rs.getDate("born").toLocalDate());
                cliente.setEmail(email);
                cliente.setPassword("password");
                
                SessionManeger.getInstance().login(cliente);
                return true;
            }
            
            //verificando se há registros
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
