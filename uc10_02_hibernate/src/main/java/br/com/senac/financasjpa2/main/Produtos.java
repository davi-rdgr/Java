package br.com.senac.financasjpa2.main;

import br.com.senac.financasjpa2.persistencia.DeletarDAO;
import br.com.senac.financasjpa2.main.Main;
import br.com.senac.financasjpa2.main.Cadastrar;
import br.com.senac.financasjpa2.entities.Podcast;
import br.com.senac.financasjpa2.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Produtos extends javax.swing.JFrame {

    private User user;
    private EntityManager em;

    public Produtos() {
        initComponents();
        inicializar_user();
        iniciarTabela();
    }

    /**
     * Construtor para receber a classe User e o EneityManager
     *
     * @param user recebe a classe entidade User
     * @param em recebe o Entity Manager
     */
    public Produtos(User user, EntityManager em) {
        this.user = user;
        this.em = em;

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

    /**
     * Método para iniciar a mensagem de boas vindas da tela principal pós login
     * e gerenciando as permissões por usuário
     */
    private void inicializar_user() {
        JOptionPane.showMessageDialog(rootPane, "Olá " + user.getNome() + ", sua permissão é de " + user.getRole() + ". Seja bem-vindo!");

        if (user.getRole().getRole_name().equals("Usuário")) {
            produtos_cadastrar.setEnabled(false);
            produtos_excluir.setEnabled(false);
        } else if (user.getRole().getRole_name().equals("Operador")) {
            produtos_excluir.setEnabled(false);
        }
    }

    private void produtos_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_pesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtos_pesquisarActionPerformed
    /**
     * Instancia a classe de cadastro de Podcast, mandando por parametro o user
     * e produtos para o uso de metodos.
     */
    private void produtos_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_cadastrarActionPerformed
        Cadastrar cadastrar = new Cadastrar(user, this);
        cadastrar.setVisible(true);
        cadastrar.setLocationRelativeTo(this);
    }//GEN-LAST:event_produtos_cadastrarActionPerformed
    /**
     * Instancia a classe Main (principal), fechando a atual, gerando um logoff.
     */
    private void produtos_deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_deslogarActionPerformed
        // TODO add your handling code here:
        Main main = new Main();
        main.setVisible(true);
        main.setLocationRelativeTo(this);
        this.dispose();
    }//GEN-LAST:event_produtos_deslogarActionPerformed

    /**
     * Salvo a linha escolhida para exclusão com o getSelectedRow, capturo o id
     * e nome e intancio o DeletarDAO para exclusão do podcast.
     */
    private void produtos_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_excluirActionPerformed
        // TODO add your handling code here:
        Integer index_podcast = produtos_table.getSelectedRow();
        Integer id_line = (Integer) produtos_table.getValueAt(index_podcast, 0);
        String podname = (String) produtos_table.getValueAt(index_podcast, 1);

        DeletarDAO deletar = new DeletarDAO(id_line, user, podname, this);
        deletar.setVisible(true);
        deletar.setLocationRelativeTo(this);
    }//GEN-LAST:event_produtos_excluirActionPerformed
    /**
     * Metodo para limpar a barra de pesquisa e reconfigurar a tabela com todos
     * podcast.
     */
    private void produtos_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_limparActionPerformed
        // TODO add your handling code here:
        produtos_pesquisar.setText("");
        iniciarTabela();

    }//GEN-LAST:event_produtos_limparActionPerformed

    /**
     * Pego o nome do podcast da barra de pesquisa e chamo o método passando por
     * parametro.
     */
    private void produtos_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtos_buscarActionPerformed
        // TODO add your handling code here:
        String produtoNome = produtos_pesquisar.getText();
        iniciarTabelaUnica(produtoNome);
    }//GEN-LAST:event_produtos_buscarActionPerformed

    /**
     * Metodo que faz o foreach nos podcasts do banco e apresenta na JTable (não
     * consegui fazer funcionar senão deixando aqui)
     */
    public void iniciarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) produtos_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT p FROM Podcast p";

        try {
            Query consulta = em.createQuery(SQL);

            List<Podcast> listpodcast = consulta.getResultList();

            for (Podcast p : listpodcast) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getProdutor(),
                    p.getNome_ep(),
                    p.getNum_ep(),
                    p.getDuracao(),
                    p.getUrl()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo que faz o foreach nos podcasts do banco e apresenta na JTable
     * usando a cláusula WHERE para trazer um resultado específico (não consegui
     * fazer funcionar senão deixando aqui)
     */
    public void iniciarTabelaUnica(String produtoNome) {
        DefaultTableModel modelo = (DefaultTableModel) produtos_table.getModel();
        modelo.setRowCount(0);

        String SQL = "SELECT p FROM Podcast p WHERE p.produtor = :produtoNome";

        try {
            Query consulta = em.createQuery(SQL);

            consulta.setParameter("produtoNome", produtoNome);

            List<Podcast> listpodcast = consulta.getResultList();

            for (Podcast p : listpodcast) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getProdutor(),
                    p.getNome_ep(),
                    p.getNum_ep(),
                    p.getDuracao(),
                    p.getUrl()
                });
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                User user = new User("defaultUser", "defaultEmail@example.com");
                EntityManager em = null;
                new Produtos(user, em).setVisible(true);
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
