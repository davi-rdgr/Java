package uc10_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uc10_01.utilities.DBConnectionDAO;

/**
 * Classe responsável por atualizar as informações dos filmes selecionados.
 *
 * @author Davi Rodeghiero Souza
 */
public class Atualizar extends javax.swing.JFrame {

    private Integer index = null;
    private Connection conn;
    private Filmes_cadastrados main;

    /**
     * Construtor iniciando os componentes e verificando se há conexão com o
     * banco.
     *
     * @param index é o valor da getSelectedRow() recebida para saber qual o
     * índice do filme para ser atualizado.
     * @param main é a classe Filmes_cadastrados, instanciada para poder usar
     * seus métodos.
     */
    public Atualizar(Integer index, Filmes_cadastrados main) {
        this.index = index;
        this.conn = DBConnectionDAO.getConnection();
        this.main = main;
        if (this.conn != null) {
            System.out.println("Conexão efetuada");
        } else {
            System.out.println("Conexão não efetuada.");
        }

        initComponents();
        carregarInformacoes();
    }

    String nome = "";
    String datalanc = "";
    String categoria = "";

    /**
     * consulta na tabela as informações do filme selecionado usando da cláusula
     * WHERE com o índice do filme, ao mesmo tempo usando os métodos get das
     * informações vindas e as as inserindo na tela com o setText.
     */
    public void carregarInformacoes() {
        String SQL = "SELECT nome, datalancamento, categoria FROM filmes WHERE id = ?";

        if (index == null) {
            System.out.println("tratar erro aqui");
            return;
        }

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, index);

            try (ResultSet resultado = stmt.executeQuery()) {
                if (resultado.next()) {
                    nome = resultado.getString("nome");
                    datalanc = resultado.getString("datalancamento");
                    categoria = resultado.getString("categoria");

                    atualizar_nome.setText(nome);
                    atualizar_datalanc.setText(datalanc);
                    atualizar_categoria.setText(categoria);

                } else {
                    System.out.println("filme não encontrado");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atualizar_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        atualizar_datalanc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        atualizar_categoria = new javax.swing.JTextField();
        atualizar_atualizar = new javax.swing.JButton();
        atualizar_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Atualizar filme");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nome do Filme:");

        atualizar_nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Data de Lançamento:");

        atualizar_datalanc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Categoria:");

        atualizar_categoria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        atualizar_atualizar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atualizar_atualizar.setText("Atualizar");
        atualizar_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_atualizarActionPerformed(evt);
            }
        });

        atualizar_voltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        atualizar_voltar.setText("Voltar");
        atualizar_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizar_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(atualizar_voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(atualizar_atualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(atualizar_datalanc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizar_nome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizar_categoria))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(atualizar_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(atualizar_datalanc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(atualizar_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizar_atualizar)
                    .addComponent(atualizar_voltar))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * faz a revisão dos dados alterados pelos campos onde no método
     * carregarInformacoes, foram enviados para tela. Usando do getText() nos
     * campos específicos ele atualiza as informações da SQL String, realiza o
     * Update, chama o método carregarTabela() para aplicar a atualização.
     *
     * @param evt
     */
    private void atualizar_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_atualizarActionPerformed
        // TODO add your handling code here:

        if (atualizar_nome.getText().isEmpty() || atualizar_datalanc.getText().isEmpty() || atualizar_categoria.getText().isEmpty()) {
            System.out.println("campos vazios");
            return;
        }

        String SQL = "UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? WHERE id = ?";

        try (PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, atualizar_nome.getText());
            stmt.setString(2, atualizar_datalanc.getText());
            stmt.setString(3, atualizar_categoria.getText());
            stmt.setString(4, index.toString());

            stmt.executeUpdate();
            main.carregarTabela();
            this.dispose();
        } catch (SQLException ex) {
            System.out.println("num deu");
        }


    }//GEN-LAST:event_atualizar_atualizarActionPerformed
    /**
     * fecha a tela de atualização, voltando para a anterior.
     *
     * @param evt
     */
    private void atualizar_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizar_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_atualizar_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                Integer index = 1;
                new Atualizar(index, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizar_atualizar;
    private javax.swing.JTextField atualizar_categoria;
    private javax.swing.JTextField atualizar_datalanc;
    private javax.swing.JTextField atualizar_nome;
    private javax.swing.JButton atualizar_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
