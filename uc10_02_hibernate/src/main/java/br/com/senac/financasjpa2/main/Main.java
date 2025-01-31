package br.com.senac.financasjpa2.main;

import br.com.senac.financasjpa2.persistencia.LoginDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * Classe principal responsável por direcionar o login do usuário
 *
 * @author Davi Rodeghiero Souza
 */
public class Main extends javax.swing.JFrame {

    private EntityManagerFactory emf;
    private EntityManager em;

    /**
     * Classe responsável por atualizar as informações dos filmes selecionados.
     *
     * Executa a acessibilidade, conecta ao arquivo persistence.xml
     */
    public Main() {
        initComponents();
        gerarAcessibilidade();
        emf = Persistence.createEntityManagerFactory("uc10_02_hibernate");
        em = emf.createEntityManager();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main_cenaflix = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        main_login = new javax.swing.JTextField();
        main_login_button = new javax.swing.JButton();
        main_senha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_cenaflix.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        main_cenaflix.setText("CENAFLIX");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Senha:");

        main_login_button.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        main_login_button.setText("Logar");
        main_login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_login_buttonActionPerformed(evt);
            }
        });

        jLabel3.setText("alt + enter para:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addComponent(main_cenaflix)
                .addGap(220, 220, 220))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(main_login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(main_login, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(main_senha)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(main_cenaflix)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(main_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Verifica se os campos estão vazios e chama o método de executar login, do
     * LoginDAO.
     */
    private void main_login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_login_buttonActionPerformed

        if (main_login.getText().isEmpty() || main_senha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Login e Senha não podem ser um campo vazio!");
        } else {
            String login = main_login.getText();
            String senha = new String(main_senha.getPassword());

            LoginDAO LG = new LoginDAO(this, em);
            LG.executeLogin(login, senha);
        }
    }//GEN-LAST:event_main_login_buttonActionPerformed
    /**
     * Gera acessibilidade para facilitar o login com alt + enter.
     */
    public void gerarAcessibilidade() {
        main_login_button.setMnemonic(KeyEvent.VK_ENTER);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_cenaflix;
    private javax.swing.JTextField main_login;
    private javax.swing.JButton main_login_button;
    private javax.swing.JPasswordField main_senha;
    // End of variables declaration//GEN-END:variables
}
