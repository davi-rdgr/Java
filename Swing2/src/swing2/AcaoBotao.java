package swing2;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListner {

    private JTextField campoNome;

    public AcaoBotao(JTextField campoNome) {
        this.campoNome = campoNome;
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Boas vindas " + campoNome.getText() + "!");
    }
}
