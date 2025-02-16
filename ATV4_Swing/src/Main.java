
import Entities.Consulta;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.awt.event.KeyEvent;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        carregarTabela();
        gerarAcessibilidade();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        med_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        med_data = new javax.swing.JTextField();
        med_hora = new javax.swing.JTextField();
        med_presSis = new javax.swing.JTextField();
        med_presDia = new javax.swing.JTextField();
        med_salvar = new javax.swing.JButton();
        med_limpar = new javax.swing.JButton();
        med_estresse = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setToolTipText("Insira os dados para cadastro!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        med_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Hora", "P Sistólica", "P Diastólica", "Estresse"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        med_table.setToolTipText("Informações cadastradas");
        jScrollPane2.setViewportView(med_table);
        if (med_table.getColumnModel().getColumnCount() > 0) {
            med_table.getColumnModel().getColumn(0).setResizable(false);
            med_table.getColumnModel().getColumn(1).setResizable(false);
            med_table.getColumnModel().getColumn(2).setResizable(false);
            med_table.getColumnModel().getColumn(3).setResizable(false);
            med_table.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Dados da medição");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setLabelFor(med_data);
        jLabel2.setText("Data (dd/mm/yyyy):");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setLabelFor(med_hora);
        jLabel3.setText("Hora (hh:mm):");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setLabelFor(med_presSis);
        jLabel4.setText("Pressão sistólica:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setLabelFor(med_estresse);
        jLabel5.setText("Situação de estresse:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setLabelFor(med_presDia);
        jLabel6.setText("Pressão diastólica:");

        med_data.setToolTipText("Insira a data atual");

        med_hora.setToolTipText("Insira a data do cadastro");
        med_hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med_horaActionPerformed(evt);
            }
        });

        med_presDia.setToolTipText("Insira a pressão diastólica");

        med_salvar.setText("Salvar");
        med_salvar.setToolTipText("Clique para executar cadastro");
        med_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med_salvarActionPerformed(evt);
            }
        });

        med_limpar.setText("Limpar");
        med_limpar.setToolTipText("Clique para limpar informações não salvas");
        med_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                med_limparActionPerformed(evt);
            }
        });

        med_estresse.setToolTipText("Marque se há situação de estresse");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(med_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(med_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(med_data, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addComponent(med_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(med_presSis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(med_presDia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(med_estresse))))
                .addGap(102, 102, 102)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(med_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(med_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(med_presSis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(med_presDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(med_limpar)
                            .addComponent(med_salvar)))
                    .addComponent(med_estresse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        med_data.getAccessibleContext().setAccessibleName("Data");
        med_hora.getAccessibleContext().setAccessibleName("Hora");
        med_presSis.getAccessibleContext().setAccessibleName("Pressão sistólica");
        med_presDia.getAccessibleContext().setAccessibleName("");
        med_estresse.getAccessibleContext().setAccessibleName("Estresse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ArrayList<Consulta> ArrayConsulta = new ArrayList<>();

    public void carregarTabela() {
        DefaultTableModel modelo = (DefaultTableModel) med_table.getModel();
        modelo.setRowCount(0);

        for (Consulta consultas : ArrayConsulta) {
            modelo.addRow(new Object[]{
                consultas.getData(),
                consultas.getHora(),
                consultas.getPresSistolica(),
                consultas.getPresDiastolica(),
                consultas.getEstresse()
            });
        }
    }

    public void gerarAcessibilidade() {
        med_salvar.setMnemonic(KeyEvent.VK_D);
        med_limpar.setMnemonic(KeyEvent.VK_C);
    }
    private void med_horaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_horaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_med_horaActionPerformed

    private void med_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_salvarActionPerformed
        // TODO add your handling code here:
        try {
            String presHora = med_hora.getText();
            String presData = med_data.getText();
            int presSis = Integer.parseInt(med_presSis.getText());
            int presDia = Integer.parseInt(med_presDia.getText());
            Boolean estresse = med_estresse.isSelected();

            if (presData.isEmpty() || presHora.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Insira valores válidos para data e hora!");
                return;
            }

            if (med_presSis.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Pressão sistólica não pode estar vazia!");
                return;
            }

            if (med_presDia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Pressão diastólica não pode estar vazia!");
                return;
            }

            if (presSis <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Insira valores válidos para pressão sistólica!");
                return;
            }
            if (presDia <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Insira valores válidos para pressão diastólica!");
                return;
            }

            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");

            Date novaData = dateFormatter.parse(presData);
            LocalTime novaHora = LocalTime.parse(presHora, timeFormatter);

            Consulta consulta = new Consulta(novaData, novaHora, presSis, presDia, estresse);
            ArrayConsulta.add(consulta);

            JOptionPane.showMessageDialog(rootPane, "Consulta cadastrada com sucesso!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Insira valores válidos para as pressões!");
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(rootPane, "Formato de data inválido! Use o formato dd/mm/yyyy.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao processar os dados:");
        }

        carregarTabela();
    }//GEN-LAST:event_med_salvarActionPerformed

    private void med_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_med_limparActionPerformed
        // TODO add your handling code here:
        med_hora.setText("");
        med_data.setText("");
        med_presSis.setText("");
        med_presDia.setText("");
        med_estresse.setSelected(false);

    }//GEN-LAST:event_med_limparActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField med_data;
    private javax.swing.JCheckBox med_estresse;
    private javax.swing.JTextField med_hora;
    private javax.swing.JButton med_limpar;
    private javax.swing.JTextField med_presDia;
    private javax.swing.JTextField med_presSis;
    private javax.swing.JButton med_salvar;
    private javax.swing.JTable med_table;
    // End of variables declaration//GEN-END:variables
}
