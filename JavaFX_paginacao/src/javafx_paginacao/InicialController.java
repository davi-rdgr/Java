package javafx_paginacao;

import utilities.ClienteDAO;
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
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;
import utilities.SessionManeger;

public class InicialController implements Initializable {

    @FXML
    private ListView<Cliente> listViewClientes;  // ListView no FXML
    private ClienteDAO clienteDAO = new ClienteDAO();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Cliente> clientesList = clienteDAO.getAllClientes();
        listViewClientes.setItems(clientesList);  // Vincula a lista ao ListView
    }

    @FXML
    private MenuItem menuItemLogout;  // Supondo que você tem um MenuItem para logout

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
