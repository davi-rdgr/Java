package javafx_paginacao;

import entities.Cliente;
import java.io.IOException;
import java.net.URL;
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
    public void handleButtonEnter(ActionEvent event) {
        String iptEmail = inputemail.getText();
        String iptPass = inputpassword.getText();

        EntrarDAO entrardao = new EntrarDAO();
        boolean loginValid = entrardao.loginVerify(iptEmail, iptPass);

        if (iptEmail.isEmpty() || iptPass.isEmpty()) {
            label.setText("Insira valores válidos!");
        } else {
            if (!loginValid) {
                label.setText("Email ou senha não conferem!");
            } else {
                label.setText("Login bem-sucedido");

                try {
                    
                    // Carregar o novo arquivo FXML
                    Parent root = FXMLLoader.load(getClass().getResource("Inicial.fxml"));

                    // Obter a janela (Stage) atual
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    // Definir a nova cena
                    Scene scene = new Scene(root);
                    stage.setScene(scene);

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
