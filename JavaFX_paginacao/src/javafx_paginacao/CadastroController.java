package javafx_paginacao;

import utilities.CadastroDAO;

import entities.Cliente;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

// sql

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utilities.DBConnection;

public class CadastroController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private TextField inputname;

    @FXML
    private TextField inputlastname;

    @FXML
    private DatePicker inputdate;

    @FXML
    private TextField inputemail;

    @FXML
    private TextField inputpassword;

    @FXML
    private boolean emailExists(String email) {
        String sql = "SELECT email FROM Cliente WHERE email = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, email);

            try (ResultSet rs = stmt.executeQuery()) {
                 // Retorna true se houver pelo menos uma linha no resultado, indicando que o email existe
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    // paginação ////////////
    @FXML
    public void switchToScene2(ActionEvent event) throws IOException {
        // carregando o FXML da cena 2
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Entrar.fxml"));
        Parent root = loader.load();

        EntrarController scene2controller = loader.getController();

        //trocando de cena
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // funcionalidade dos botões
    @FXML
    public void handleButtonAction(ActionEvent event) {

        boolean iptAdmin = false;
        String iptName = inputname.getText();
        String iptLastName = inputlastname.getText();
        LocalDate iptDate = inputdate.getValue();
        String iptEmail = inputemail.getText();
        String iptPass = inputpassword.getText();

        if (iptName.isEmpty() || iptLastName.isEmpty() || iptDate == null || iptEmail.isEmpty() || iptPass.isEmpty()) {
            label.setText("Insira valores válidos");
        } else {
            if (!emailExists(iptEmail)) {
                Cliente cliente = new Cliente(iptAdmin, iptName, iptLastName, iptDate, iptEmail, iptPass);

                // adicionando ao banco de dados:
                CadastroDAO cadastrodao = new CadastroDAO();
                cadastrodao.insertClient(cliente);

                label.setText("Cadastro bem sucedido!");

            } else {
                label.setText("Email já cadastrado!");
            }
        }
    }
}
