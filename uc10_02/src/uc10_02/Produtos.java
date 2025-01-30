package uc10_02;

import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uc10_02.utilities.ConnectionDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import uc10_02.utilities.DeletarDAO;

public class Produtos extends javax.swing.JFrame {

    private User user;
    Connection conn = ConnectionDAO.getConnection();

    public Produtos() {
        initComponents();
        inicializar_user();
        iniciarTabela();
    }

    public Produtos(User user) {
        this.user = user;
        initComponents();
        inicializar_user();
        iniciarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        main_cenaflix = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        produtos_pesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtos_table = new javax.swing.JTable();
        produtos_cadastrar = new javax.swing.JButton();
        produtos_excluir = new javax.swing.JButton();
        produtos_deslogar = new javax.swing.JButton();
        produtos_buscar = new javax.swing.JButton();
        produtos_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_cenaflix.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        main_cenaflix.setText("CENAFLIX");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("LISTAGEM");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Pesquisar podcast por produtor");

        produtos_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_pesquisarActionPerformed(evt);
            }
        });

        produtos_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produtor", "Nome do Ep", "N° do Epl", "Duração", "URL do Repo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtos_table);

        produtos_cadastrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        produtos_cadastrar.setText("Cadastrar");
        produtos_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_cadastrarActionPerformed(evt);
            }
        });

        produtos_excluir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        produtos_excluir.setText("Excluir");
        produtos_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_excluirActionPerformed(evt);
            }
        });

        produtos_deslogar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        produtos_deslogar.setText("Deslogar");
        produtos_deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_deslogarActionPerformed(evt);
            }
        });

        produtos_buscar.setText("Buscar");
        produtos_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_buscarActionPerformed(evt);
            }
        });

        produtos_limpar.setText("Limpar");
        produtos_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtos_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtos_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(produtos_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(produtos_deslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(244, 244, 244))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(main_cenaflix)
                                .addGap(220, 220, 220))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(produtos_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(produtos_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(main_cenaflix)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(produtos_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtos_buscar)
                    .addComponent(produtos_limpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(produtos_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(produtos_deslogar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(produtos_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializar_user() {
        JOptionPane.showMessageDialog(rootPane, "Olá " + user.getNome() + ", sua permissão é de " + user.getRoleId() + ". Seja bem-vindo!");

        if (user.getRoleId().equals("Usuário")) {
            produtos_cadastrar.setEnabled(false);
            produtos_excluir.setEnabled(false);
        } else if (user.getRoleId().equals("Operador")) {
            produtos_excluir.setEnabled(false);
        }
    }

    private void produtos_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtos_pesquisarActionPerformed

    private void produtos_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_cadastrarActionPerformed
        Cadastrar cadastrar = new Cadastrar(user, this);
        cadastrar.setVisible(true);
        cadastrar.setLocationRelativeTo(this);
    }//GEN-LAST:event_produtos_cadastrarActionPerformed

    private void produtos_deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_deslogarActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        main.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_produtos_deslogarActionPerformed

    private void produtos_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_excluirActionPerformed
        // TODO add your handling code here:
        Integer index_podcast = produtos_table.getSelectedRow();
        Integer id_line = (Integer) produtos_table.getValueAt(index_podcast, 0);
        String podname = (String) produtos_table.getValueAt(index_podcast, 1);

        DeletarDAO deletar = new DeletarDAO(id_line, user, podname, this);
        deletar.setVisible(true);
        deletar.setLocationRelativeTo(this);
    }//GEN-LAST:event_produtos_excluirActionPerformed

    private void produtos_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_limparActionPerformed
        // TODO add your handling code here:
        produtos_pesquisar.setText("");
        iniciarTabela();

    }//GEN-LAST:event_produtos_limparActionPerformed

    private void produtos_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_buscarActionPerformed
        // TODO add your handling code here:
        String produtoNome = produtos_pesquisar.getText();
        iniciarTabelaUnica(produtoNome);

    }//GEN-LAST:event_produtos_buscarActionPerformed

    public void iniciarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) produtos_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT id, produtor, nome_ep, num_ep, duracao, url FROM podcast";

        try (PreparedStatement stmt = conn.prepareStatement(SQL); ResultSet resultado = stmt.executeQuery()) {
            while (resultado.next()) {
                modelo.addRow(new Object[]{
                    resultado.getInt("id"),
                    resultado.getString("produtor"),
                    resultado.getString("nome_ep"),
                    resultado.getString("num_ep"),
                    resultado.getString("duracao"),
                    resultado.getString("url")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void iniciarTabelaUnica(String produtoNome) {
        DefaultTableModel modelo = (DefaultTableModel) produtos_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT id, produtor, nome_ep, num_ep, duracao, url FROM podcast WHERE ? = produtor";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, produtoNome);

            try (ResultSet resultado = stmt.executeQuery()) {
                while (resultado.next()) {
                    modelo.addRow(new Object[]{
                        resultado.getInt("id"),
                        resultado.getString("produtor"),
                        resultado.getString("nome_ep"),
                        resultado.getString("num_ep"),
                        resultado.getString("duracao"),
                        resultado.getString("url")
                    });
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // ajustar essa merda depois
                User user = new User("defaultUser", "defaultEmail@example.com");
                new Produtos(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel main_cenaflix;
    private javax.swing.JButton produtos_buscar;
    private javax.swing.JButton produtos_cadastrar;
    private javax.swing.JButton produtos_deslogar;
    private javax.swing.JButton produtos_excluir;
    private javax.swing.JButton produtos_limpar;
    private javax.swing.JTextField produtos_pesquisar;
    private javax.swing.JTable produtos_table;
    // End of variables declaration//GEN-END:variables
}
