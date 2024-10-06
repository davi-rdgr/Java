package javafxapplication4;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import entities.Cliente;
import java.util.ArrayList;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private Label foreachLabel;

    @FXML
    private TextField inputname;

    @FXML
    private TextField inputemail;

    @FXML
    private TextField inputpassword;

    ArrayList<Cliente> AC = new ArrayList<>();

    private boolean emailExists(String email) {
        for (Cliente cliente : AC) {
            if (cliente.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String iptName = inputname.getText();
        String iptEmail = inputemail.getText();
        String iptPass = inputpassword.getText();

        if (!emailExists(iptEmail)) {
            Cliente cliente = new Cliente(iptName, iptEmail, iptPass);
            AC.add(cliente);
            label.setText("Cadastro bem sucedido!");

        } else {
            label.setText("Email já cadastrado!");
        }
    }

    @FXML
    private void forEachAction(ActionEvent event) {

        StringBuilder nomes = new StringBuilder();

        for (Cliente cliente : AC) {
            nomes.append(cliente.getName()).append("\n");
        }
        foreachLabel.setText(nomes.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
