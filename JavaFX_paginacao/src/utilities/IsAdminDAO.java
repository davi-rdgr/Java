package utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IsAdminDAO {

    public boolean UserIsAdmin(String email) throws SQLException {
        boolean status = false;

        String sql = "SELECT superUser FROM Cliente where email = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);  
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
              
                status = rs.getBoolean("superUser");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return status;
    }
}
