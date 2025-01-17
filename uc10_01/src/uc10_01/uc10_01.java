package uc10_01;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import uc10_01.utilities.DBConnectionDAO;

/**
 * Classe principal do programa, responsável por cadastrar filmes e mostrar
 * opções do ecossistema do programa.
 *
 * @author Davi Rodeghiero Souza
 */
public class uc10_01 extends javax.swing.JFrame {

    /**
     * Construtor iniciando os componentes e verificando se há conexão com o
     * banco. O OptionPane só aparecerá na tela caso não haja conexão. Caso
     * contrário não, para motivos de melhor usabilidade.
     */
    public uc10_01() {
        initComponents();
        Connection conn = DBConnectionDAO.getConnection();

        if (conn != null) {
            System.out.println("Conexão efetuada");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Conexão não efetuada!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filme_cadastrar = new javax.swing.JButton();
        filme_limpar = new javax.swing.JButton();
        filme_nome = new javax.swing.JTextField();
        filme_lancamento = new javax.swing.JTextField();
        filme_categoria = new javax.swing.JTextField();
        filmes_listar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("CENAFLIX");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("CADASTRO DE FILME");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome do Filme:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Data de Lançamento:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Categoria:");

        filme_cadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        filme_cadastrar.setText("Cadastrar");
        filme_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filme_cadastrarActionPerformed(evt);
            }
        });

        filme_limpar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        filme_limpar.setText("Limpar");
        filme_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filme_limparActionPerformed(evt);
            }
        });

        filme_nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        filme_lancamento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        filme_categoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        filmes_listar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        filmes_listar.setText("Filmes cadastrados");
        filmes_listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmes_listarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(filme_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(filme_categoria)
                                    .addComponent(filme_lancamento)
                                    .addComponent(filme_nome)
                                    .addComponent(filme_limpar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                            .addComponent(filmes_listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(filme_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(filme_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(filme_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filme_limpar)
                    .addComponent(filme_cadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filmes_listar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método para limpar os campos da tela principal.
     *
     * @param evt clique para o botão limpar.
     */
    private void filme_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filme_limparActionPerformed
        filme_nome.setText("");
        filme_categoria.setText("");
        filme_lancamento.setText("");
    }//GEN-LAST:event_filme_limparActionPerformed
    /**
     * Método para realizar o tratamento dos campos e inserção de dados no
     * banco. Ao finalizar, chamo um método da classe Deletar que reorganiza a
     * ordem dos IDs no banco de dados, explicada mais para frente.
     *
     * @param evt clique para o botão cadastrar.
     */
    private void filme_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filme_cadastrarActionPerformed
        if (filme_nome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "'Nome do Filme' não pode ser um campo vazio!");
        } else if (filme_lancamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "'Data de lançamento' não pode ser um campo vazio!");
        } else if (!validarData(filme_lancamento.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Data de lançamento inválida. Use o formato dd/MM/yyyy!");
        } else if (filme_categoria.getText().isEmpty() || filme_categoria.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(rootPane, "'Categoria' não pode ser um campo vazio e não pode ser numérico!");
        } else {

            String nome = filme_nome.getText();
            String lancamento = filme_lancamento.getText();
            String categoria = filme_categoria.getText();
            String dataReformat = null;

            // _________________________________________________
            // não entendo a utilidade disso, mas o Netbeans me obriga a usar para formatar a data, então vou deixar assim por hora:
            try {
                dataReformat = formatarData(lancamento);
            } catch (ParseException ex) {
                Logger.getLogger(uc10_01.class.getName()).log(Level.SEVERE, null, ex);
            }
            // _________________________________________________

            Connection conn = DBConnectionDAO.getConnection();

            if (conn != null) {
                String SQL = "INSERT INTO filmes (nome, datalancamento, categoria) VALUES (?, ?, ?)";

                try (PreparedStatement ps = conn.prepareStatement(SQL)) {

                    ps.setString(1, nome);
                    ps.setString(2, dataReformat);
                    ps.setString(3, categoria);

                    int rowsAffected = ps.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Filme cadastrado com sucesso!");
                        filme_nome.setText("");
                        filme_lancamento.setText("");
                        filme_categoria.setText("");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao inserir");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao inserir: " + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao conectar ao banco");
            }
            Deletar del = new Deletar();
            del.reorganizarTabela();

        }

    }//GEN-LAST:event_filme_cadastrarActionPerformed
    /**
     * Abre a JTable dos filmes cadastrados
     *
     * @param evt clique para o botão de abrir a tela de filmes cadastrados.
     */
    private void filmes_listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmes_listarActionPerformed
        Filmes_cadastrados fc = new Filmes_cadastrados();
        fc.setVisible(true);
        fc.setLocationRelativeTo(this);
    }//GEN-LAST:event_filmes_listarActionPerformed
    /**
     * Valida a data no modelo dd/MM/yyyy
     *
     * @param data resultado do getText() do campo data do filme cadastrado.
     * @return true se a data for validada; false caso não for validada.
     */
    private boolean validarData(String data) {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        dateform.setLenient(false);

        try {
            dateform.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     *
     * @param data resultado da validação do método validarData.
     * @return uma string com a data formatada para o padrão yyyy/MM/dd, para
     * ser inserida corretamente no banco.
     * @throws ParseException se a data não estiver no formato correto.
     */
    private String formatarData(String data) throws ParseException {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat datereform = new SimpleDateFormat("yyyy/MM/dd");

        Date dataConvert = dateform.parse(data);
        return datereform.format(dataConvert);

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
            java.util.logging.Logger.getLogger(uc10_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uc10_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uc10_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uc10_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uc10_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton filme_cadastrar;
    private javax.swing.JTextField filme_categoria;
    private javax.swing.JTextField filme_lancamento;
    private javax.swing.JButton filme_limpar;
    private javax.swing.JTextField filme_nome;
    private javax.swing.JButton filmes_listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
