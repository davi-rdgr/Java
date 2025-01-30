package uc10_01;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uc10_01.utilities.DBConnectionDAO;

/**
 * Classe responsável por deletar um filme selecionado.
 *
 * @author Davi Rodeghiero Souza
 */
public class Deletar extends javax.swing.JFrame {

    private Integer index = null;
    private Connection conn;
    private Filmes_cadastrados main;

    /**
     * Construtor iniciando os componentes e verificando se há conexão com o
     * banco.
     *
     * é executado um teste para saber se o índice foi selecionado. Caso não
     * (indice -1), retorna um aviso e não executa o restante do construtor.
     *
     * @param index é o valor da getSelectedRow() recebida para saber qual o
     * índice do filme para ser excluído.
     * @param main é a classe Filmes_cadastrados, instanciada para poder usar
     * seus métodos.
     */
    public Deletar(Integer index, Filmes_cadastrados main) {
        if (index == -1) {
            JOptionPane.showMessageDialog(rootPane, "Filme não selecionado!");
            return;
        }
        this.index = index;
        this.main = main;
        this.conn = DBConnectionDAO.getConnection();
        if (this.conn != null) {
            System.out.println("Conexão efetuada");
        } else {
            System.out.println("Conexão não efetuada.");
        }

        initComponents();
        enunciado();
    }

    /**
     * construtor sem parametros para poder utilizar o método reorganizarTabela
     * na tela main, após fazer uma nova inserção no banco.
     */
    public Deletar() {
        this.conn = DBConnectionDAO.getConnection();
    }

    String id = "";
    String nome = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        delete_enunciado = new javax.swing.JLabel();
        deletar_deletar = new javax.swing.JButton();
        deletar_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        delete_enunciado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        deletar_deletar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deletar_deletar.setText("Deletar");
        deletar_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_deletarActionPerformed(evt);
            }
        });

        deletar_voltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deletar_voltar.setText("Voltar");
        deletar_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(deletar_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletar_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete_enunciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(delete_enunciado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deletar_deletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletar_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
     * fecha a tela dos filmes cadastrados, voltando para a anterior.
     *
     * @param evt
     */
    private void deletar_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_voltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_deletar_voltarActionPerformed

    /**
     * utilizando do index trazido da classe anterior, faz um Delete no banco
     * com a cláusula WHERE, chama o método ReorganizaTabela para arrumar os
     * indices do banco.
     *
     * @param evt
     */
    private void deletar_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_deletarActionPerformed
        String SQL = "DELETE FROM filmes WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, index);
            stmt.executeUpdate();

            main.carregarTabela();
            this.dispose();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar ao banco de dados");
        }

    }//GEN-LAST:event_deletar_deletarActionPerformed

    /**
     * faz uma consulta no banco com a cláusula WHERE para exibir na tela de
     * exclusão de filmes o nome e o id do filme, para que o usuário tenha uma
     * experiência melhor ao saber o que será deletado.
     */
    private void enunciado() {
        String SQL = "SELECT id, nome FROM filmes WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, index);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    nome = resultado.getString("nome");
                    id = resultado.getString("id");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao conectar ao banco de dados");
        }
        delete_enunciado.setText("id " + id + ": Deseja excluir o filme " + nome + "?");
    }

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
            java.util.logging.Logger.getLogger(Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Integer index = 1;
                new Deletar(index, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletar_deletar;
    private javax.swing.JButton deletar_voltar;
    private javax.swing.JLabel delete_enunciado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
