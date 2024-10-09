package javafx_paginacao;

import entities.Cliente;

import javafx_paginacao.InicialController;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import utilities.EntrarDAO;
import utilities.IsAdminDAO;

public class EntrarController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField inputemail;

    @FXML
    private TextField inputpassword;

    @FXML
    private Label label;

    @FXML
    public void handleButtonEnter(ActionEvent event) throws SQLException {
        String iptEmail = inputemail.getText();
        String iptPass = inputpassword.getText();

        EntrarDAO entrardao = new EntrarDAO();
        IsAdminDAO isadmindao = new IsAdminDAO();

        boolean loginValid = entrardao.loginVerify(iptEmail, iptPass);
        boolean status = isadmindao.UserIsAdmin(iptEmail);

        System.out.println(status);

        if (iptEmail.isEmpty() || iptPass.isEmpty()) {
            label.setText("Insira valores válidos!");
        } else {
            if (!loginValid) {
                label.setText("Email ou senha não conferem!");
            } else {
                label.setText("Login bem-sucedido");

                try {

                    // Carregar o novo arquivo FXML
                    //Parent root = FXMLLoader.load(getClass().getResource("Inicial.fxml"));
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Inicial.fxml"));
                    Parent root = loader.load();

                    // Obter a janela (Stage) atual
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    // Definir a nova cena
                    Scene scene = new Scene(root);
                    stage.setScene(scene);

                    InicialController inicialcontroller = loader.getController();
                    inicialcontroller.setStatus(status);

                    // Exibir a nova tela
                    stage.show();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @FXML
    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
