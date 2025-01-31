package br.com.senac.financasjpa2.main;

import br.com.senac.financasjpa2.entities.Podcast;
import br.com.senac.financasjpa2.entities.User;
import br.com.senac.financasjpa2.persistencia.PodcastDAO;
import javax.swing.JOptionPane;
import java.time.LocalTime;
import java.sql.Time;

public class Cadastrar extends javax.swing.JFrame {

    private User user;
    private Produtos produtos;

    /**
     * Recebo a classe de User e a classe Produtos.
     *
     * @param user recebe a classe User
     * @param produtos recebe a classe Produtos
     */
    public Cadastrar(User user, Produtos produtos) {
        this.produtos = produtos;
        this.user = user;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main_cenaflix = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cadastrar_produtor = new javax.swing.JTextField();
        cadastrar_nomeEp = new javax.swing.JTextField();
        cadastrar_numEp = new javax.swing.JTextField();
        cadastra_duracaoEp = new javax.swing.JTextField();
        cadastrar_URL = new javax.swing.JTextField();
        cadastrar_listagem = new javax.swing.JButton();
        cadastrar_cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_cenaflix.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        main_cenaflix.setText("CENAFLIX");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("CADASTRAR PODCAST");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Produtor");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome do episódio");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("N° do episódio");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Duração");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("URL do repositório");

        cadastrar_produtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_produtorActionPerformed(evt);
            }
        });

        cadastrar_listagem.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cadastrar_listagem.setText("Ver Listagem");
        cadastrar_listagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_listagemActionPerformed(evt);
            }
        });

        cadastrar_cadastrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cadastrar_cadastrar.setText("Cadastrar");
        cadastrar_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_cadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cadastrar_URL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addComponent(cadastra_duracaoEp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadastrar_numEp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadastrar_nomeEp, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cadastrar_produtor, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(201, 201, 201))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cadastrar_listagem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(cadastrar_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(main_cenaflix)
                        .addGap(220, 220, 220))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(main_cenaflix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar_produtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(cadastrar_nomeEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(cadastrar_numEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(cadastra_duracaoEp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar_URL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar_listagem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_produtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_produtorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrar_produtorActionPerformed

    private void cadastrar_listagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_listagemActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cadastrar_listagemActionPerformed
    /**
     * Recebo os campos para inserir um novo podcast. Trata os dados, instancio
     * o podcastDAO passando os valores para o Insert, atualizo a tabela, limpo
     * os campos.
     */
    private void cadastrar_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_cadastrarActionPerformed
        // TODO add your handling code here:
        if (cadastrar_produtor.getText().isEmpty() || cadastrar_nomeEp.getText().isEmpty() || cadastrar_numEp.getText().isEmpty() || cadastra_duracaoEp.getText().isEmpty() || cadastrar_URL.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Os campos de cadastro de podcast não podem estar vazios!");
            return;
        }
        try {
            int numeroEp = Integer.parseInt(cadastrar_numEp.getText());

            String duracaoEp = cadastra_duracaoEp.getText();

            LocalTime localTime = LocalTime.parse(duracaoEp);
            Time formatDuracao = Time.valueOf(localTime);

            String nomeProdutor = cadastrar_produtor.getText();
            String nomeEp = cadastrar_nomeEp.getText();
            String URL = cadastrar_URL.getText();

            PodcastDAO IPD = new PodcastDAO();
            Podcast pod = new Podcast(nomeProdutor, nomeEp, numeroEp, duracaoEp, URL);
            IPD.cadastrar(pod);

            produtos.iniciarTabela();

            cadastrar_produtor.setText("");
            cadastrar_nomeEp.setText("");
            cadastrar_numEp.setText("");
            cadastra_duracaoEp.setText("");
            cadastrar_URL.setText("");

            JOptionPane.showMessageDialog(rootPane, "Podcast cadastrado com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Número do episódio e duração do episódio devem ser numéricos!");
            System.out.println(e);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cadastrar_cadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User user = new User("defaultUser", "defaultEmail@example.com");
                Produtos produtos = new Produtos();
                new Cadastrar(user, produtos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cadastra_duracaoEp;
    private javax.swing.JTextField cadastrar_URL;
    private javax.swing.JButton cadastrar_cadastrar;
    private javax.swing.JButton cadastrar_listagem;
    private javax.swing.JTextField cadastrar_nomeEp;
    private javax.swing.JTextField cadastrar_numEp;
    private javax.swing.JTextField cadastrar_produtor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_cenaflix;
    // End of variables declaration//GEN-END:variables
}
