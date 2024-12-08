import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Popup");
        JButton showDialogButton = new JButton("Abrir Popup");

        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criando o JDialog customizado
                JDialog dialog = new JDialog(frame, "Inserir Informações", true);
                dialog.setLayout(new GridLayout(3, 2));
                
                JLabel nameLabel = new JLabel("Nome:");
                JTextField nameField = new JTextField();
                
                JLabel emailLabel = new JLabel("Email:");
                JTextField emailField = new JTextField();
                
                JButton submitButton = new JButton("Executar");
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Função executada após clicar no botão
                        String name = nameField.getText();
                        String email = emailField.getText();
                        JOptionPane.showMessageDialog(dialog, "Nome: " + name + "\nEmail: " + email);
                        dialog.dispose();  // Fechar o dialog
                    }
                });

                dialog.add(nameLabel);
                dialog.add(nameField);
                dialog.add(emailLabel);
                dialog.add(emailField);
                dialog.add(submitButton);
                
                dialog.setSize(300, 200);
                dialog.setVisible(true);
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.add(showDialogButton);
        frame.setVisible(true);
    }
}
