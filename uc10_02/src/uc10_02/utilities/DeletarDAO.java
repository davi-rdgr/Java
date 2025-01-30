package uc10_02.utilities;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uc10_02.Produtos;

public class DeletarDAO extends javax.swing.JFrame {

    private Integer index;
    private User user;
    private String podname;
    private Produtos produtos;
    Connection conn = ConnectionDAO.getConnection();

    public DeletarDAO(Integer index, User user, String podname, Produtos produtos) {
        this.index = index;
        this.user = user;
        this.podname = podname;
        this.produtos = produtos;
        initComponents();
        introducao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deletar_voltar = new javax.swing.JButton();
        deletar_excluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        deletar_podcastnome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        deletar_voltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deletar_voltar.setText("Voltar");
        deletar_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_voltarActionPerformed(evt);
            }
        });

        deletar_excluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deletar_excluir.setText("Excluir");
        deletar_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_excluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Deseja excluir os dados do Podcast");

        deletar_podcastnome.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(deletar_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(deletar_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletar_podcastnome)
                            .addComponent(jLabel1))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletar_podcastnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletar_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletar_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void introducao() {
        deletar_podcastnome.setText(podname);
    }

    private void deletar_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_deletar_voltarActionPerformed

    private void deletar_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_excluirActionPerformed
        // TODO add your handling code here:
        String SQL = "DELETE FROM podcast WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, index);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(rootPane, "Dados do Podcast foram excluídos!");

            produtos.iniciarTabela();
            this.dispose();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar ao banco de dados!");
            this.dispose();
        }
    }//GEN-LAST:event_deletar_excluirActionPerformed

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
            java.util.logging.Logger.getLogger(DeletarDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeletarDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeletarDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeletarDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Integer index = 1;
                String podname = "";
                Produtos produtos = new Produtos();
                new DeletarDAO(index, null, podname, produtos).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletar_excluir;
    private javax.swing.JLabel deletar_podcastnome;
    private javax.swing.JButton deletar_voltar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
