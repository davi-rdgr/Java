package javafx_paginacao;

import utilities.ClienteDAO;
import utilities.IsAdminDAO;

import entities.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;
import utilities.SessionManeger;

public class InicialController implements Initializable {

    @FXML
    private ListView<Cliente> listViewClientes;  // ListView no FXML
    private ClienteDAO clienteDAO = new ClienteDAO();

    @FXML
    private Button barButton;
    private boolean status;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Cliente> clientesList = clienteDAO.getAllClientes();
        listViewClientes.setItems(clientesList);  // Vincula a lista ao ListView

    }

    // recebendo o status de admin ou não vindo do EntrarController
    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("Status recebido: " + status);

        if (status) {
            barButton.setVisible(status);
        } else {
            barButton.setVisible(status);
        }
    }

    @FXML
    private MenuItem menuItemLogout;

    @FXML
    public void logout(ActionEvent event) throws IOException {

        // Fazer o logout do sistema
        SessionManeger.getInstance().logout();

        // Obter a janela atual a partir de qualquer nó visível na tela
        // Nesse caso, você pode usar `menuItemLogout.getParentPopup().getOwnerWindow()`
        Stage stage = (Stage) menuItemLogout.getParentPopup().getOwnerWindow();

        // Carregar a tela de login
        Parent root = FXMLLoader.load(getClass().getResource("Entrar.fxml"));

        // Definir a nova cena
        Scene scene = new Scene(root);
        stage.setScene(scene);

        // Exibir a nova tela (Entrar.fxml)
        stage.show();

        System.out.println("Logout feito");
    }

}
