package uc10_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import uc10_01.utilities.DBConnectionDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Classe responsável por exibir, pesquisar, deletar, atualizar filmes
 * cadastrados no banco.
 *
 * @author Davi Rodeghiero Souza
 */
public class Filmes_cadastrados extends javax.swing.JFrame {

    private Connection conn;

    /**
     * Construtor iniciando os componentes e verificando se há conexão com o
     * banco. Dessa vez não exibe um JOptionePane caso não efetue a conexão,
     * pois fica subentendido que a conexão se manterá caso tenha chegado a esta
     * tela sem problemas.
     */
    public Filmes_cadastrados() {
        initComponents();

        this.conn = DBConnectionDAO.getConnection();

        if (this.conn != null) {
            System.out.println("Conexão efetuada");
        } else {
            System.out.println("Conexão não efetuada.");
        }

        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fc_voltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        filmes_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fc_atualizar = new javax.swing.JButton();
        fc_deletar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        fc_campo = new javax.swing.JTextField();
        fc_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fc_voltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fc_voltar.setText("Voltar");
        fc_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc_voltarActionPerformed(evt);
            }
        });

        filmes_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Lançamento", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(filmes_table);
        if (filmes_table.getColumnModel().getColumnCount() > 0) {
            filmes_table.getColumnModel().getColumn(0).setResizable(false);
            filmes_table.getColumnModel().getColumn(1).setResizable(false);
            filmes_table.getColumnModel().getColumn(2).setResizable(false);
            filmes_table.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Filmes cadastrados");

        fc_atualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fc_atualizar.setText("Atualizar");
        fc_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc_atualizarActionPerformed(evt);
            }
        });

        fc_deletar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fc_deletar.setText("Deletar");
        fc_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc_deletarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fc_campo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fc_campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc_campoActionPerformed(evt);
            }
        });

        fc_refresh.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fc_refresh.setText("Limpar");
        fc_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fc_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fc_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fc_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fc_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fc_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(fc_campo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc_refresh))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fc_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fc_atualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fc_deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
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
    /**
     * fecha a tela dos filmes cadastrados, voltando para a anterior.
     *
     * @param evt
     */
    private void fc_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_fc_voltarActionPerformed
    /**
     * abre a tela para atualizar dados do filme selecionado, passando por
     * parametro seus dados.
     *
     * @param evt
     */
    private void fc_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc_atualizarActionPerformed
        Integer index_filme = filmes_table.getSelectedRow();

        Atualizar at = new Atualizar(index_filme, this);
        at.setVisible(true);
        at.setLocationRelativeTo(this);
    }//GEN-LAST:event_fc_atualizarActionPerformed
    /**
     * abre a tela para deletar dados do filme selecionado, passando por
     * parametro seus dados.
     *
     * @param evt
     */
    private void fc_deletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc_deletarActionPerformed
        Integer index_filme = filmes_table.getSelectedRow();
        Deletar dl = new Deletar(index_filme, this);
        dl.setVisible(true);
        dl.setLocationRelativeTo(this);
    }//GEN-LAST:event_fc_deletarActionPerformed

    private void fc_campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc_campoActionPerformed
    }//GEN-LAST:event_fc_campoActionPerformed
    /**
     * chama o método carregarTabelaUnica, responsável por retornar uma pesquisa
     * singular do banco.
     *
     * @param evt
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarTabelaUnica();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * o botão de redefinir a lista chama novamente o método carregarTabela,
     * desfazendo o resultado da carregarTabelaUnica.
     *
     * @param evt
     */
    private void fc_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc_refreshActionPerformed
        carregarTabela();
    }//GEN-LAST:event_fc_refreshActionPerformed

    /**
     * faz a consulta no banco de dados e executa um while para cada consulta
     * encontrada, mostrando seus dados na JTable.
     */
    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) filmes_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT id, nome, datalancamento, categoria FROM filmes";

        try (PreparedStatement stmt = conn.prepareStatement(SQL); ResultSet resultado = stmt.executeQuery()) {
            while (resultado.next()) {
                modelo.addRow(new Object[]{
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getDate("datalancamento"),
                    resultado.getString("categoria")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * faz a consulta singular no banco de dados com o uso da cláusula WHERE,
     * obtendo o resultado a partir do nome do filme em questão.
     */
    public void carregarTabelaUnica() {
        DefaultTableModel modelo = (DefaultTableModel) filmes_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT id, nome, datalancamento, categoria FROM filmes WHERE nome = ?";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, fc_campo.getText());

            try (ResultSet resultado = stmt.executeQuery()) {
                while (resultado.next()) {
                    modelo.addRow(new Object[]{
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getDate("datalancamento"),
                        resultado.getString("categoria")
                    });
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar ao banco de dados!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Filmes_cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Filmes_cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Filmes_cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Filmes_cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Filmes_cadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fc_atualizar;
    private javax.swing.JTextField fc_campo;
    private javax.swing.JButton fc_deletar;
    private javax.swing.JButton fc_refresh;
    private javax.swing.JButton fc_voltar;
    private javax.swing.JTable filmes_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
