package Main;

import entities.Clientes;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PC
 */
public class DetalhesConsulta extends javax.swing.JFrame {

    private ArrayList<Clientes> cadastro;
    private Clientes cliente;
    private String propCpf;
    private Main_2 main;

    /**
     * Creates new form DetalhesConsulta
     */
    public DetalhesConsulta(ArrayList<Clientes> cadastro, String propCpf, Main_2 main) {
        this.cadastro = cadastro;
        this.propCpf = propCpf;
        this.main = main;
        initComponents();
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
        detalhesconsulta_realizada = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalhesconsulta_textarea = new javax.swing.JTextArea();
        detalhesconsulta_finalizar = new javax.swing.JButton();
        cadastrarconsulta_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Detalhes da Consulta");

        detalhesconsulta_realizada.setText("Consulta Realizada");

        jLabel2.setText("Receita e observações:");

        detalhesconsulta_textarea.setColumns(20);
        detalhesconsulta_textarea.setRows(5);
        jScrollPane1.setViewportView(detalhesconsulta_textarea);

        detalhesconsulta_finalizar.setText("Finalizar");
        detalhesconsulta_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detalhesconsulta_finalizarActionPerformed(evt);
            }
        });

        cadastrarconsulta_voltar.setText("Voltar");
        cadastrarconsulta_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarconsulta_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(detalhesconsulta_realizada)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(detalhesconsulta_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarconsulta_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(detalhesconsulta_realizada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarconsulta_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detalhesconsulta_finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarconsulta_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarconsulta_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cadastrarconsulta_voltarActionPerformed

    private void detalhesconsulta_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detalhesconsulta_finalizarActionPerformed
        // TODO add your handling code here:

        try {
            // Verificar se `propCpf` está preenchido
            if (propCpf == null || propCpf.isEmpty()) {
                System.out.println("CPF não pode ser vazio ou nulo.");
                return;
            }

            long intCpf = Long.parseLong(propCpf);
            String receita = detalhesconsulta_textarea.getText();

            for (Clientes cliente : cadastro) {

                if (cliente.getCPF() == null || cliente.getCPF().isEmpty()) {
                    System.out.println("CPF do cliente está vazio.");
                    continue;
                }

                long cpfCliente = Long.parseLong(cliente.getCPF());
                if (cpfCliente == intCpf) {
                    // Cliente encontrado

                    detalhesconsulta_realizada.setSelected(true);
                    cliente.setConsulta(true);

                    cliente.setReceita(receita);
                    System.out.println(cliente.getReceita());

                    main.carregarTabela();

                    break;

                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro no formato do CPF ou em outro dado: " + e);
        }
        dispose();
    }//GEN-LAST:event_detalhesconsulta_finalizarActionPerformed

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
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetalhesConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ArrayList<Clientes> cadastro = new ArrayList<>();
                String propCpf = null;
                Main_2 mainInstance = new Main_2();

                new DetalhesConsulta(cadastro, propCpf, mainInstance).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarconsulta_voltar;
    private javax.swing.JButton detalhesconsulta_finalizar;
    private javax.swing.JCheckBox detalhesconsulta_realizada;
    private javax.swing.JTextArea detalhesconsulta_textarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
