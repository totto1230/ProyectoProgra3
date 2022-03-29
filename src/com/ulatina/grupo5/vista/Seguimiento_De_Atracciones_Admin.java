/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ulatina.grupo5.vista;

/**
 *
 * @author josep
 */
public class Seguimiento_De_Atracciones_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Seguimiento_De_Atracciones_Admin
     */
    public Seguimiento_De_Atracciones_Admin() {
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

        jPane_Regist_Atra_Admin = new javax.swing.JPanel();
        jLabel_Nombre_Atraccion_Seguimiento_Atrac = new javax.swing.JLabel();
        jLabel_Revisor_Seguimiento_Atrac = new javax.swing.JLabel();
        jLabel_Fecha_de_Instalacion = new javax.swing.JLabel();
        jLabel_Error_Presente = new javax.swing.JLabel();
        jLabel_Descrip_Error_Segui_Atra_Admin = new javax.swing.JLabel();
        jLabel_Soluc_Comenta_Seg_Atrac_Admi = new javax.swing.JLabel();
        jButton_Agregar_Seguimiento_Atra_Admin = new javax.swing.JButton();
        jButton_volver_seguimiento_atracciones_admin = new javax.swing.JButton();
        jTextField_Revisor_Segui_De_Atra_Admin = new javax.swing.JTextField();
        Date_Fecha_Revi_Seguimiento = new com.toedter.calendar.JDateChooser();
        jCheckBox_Error = new javax.swing.JCheckBox();
        jTextField_Atrac_Seguimiento_Atrc_Admin = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Solc_Comenta_Segui_De_Atrac_Admin = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_Descrip_Error_Segui_Atra_Admi = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Seguimiento_atrac = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Seguimiento_Atracciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nombre_Atraccion_Seguimiento_Atrac.setText("Atracción");

        jLabel_Revisor_Seguimiento_Atrac.setText("Revisor");

        jLabel_Fecha_de_Instalacion.setText("Fecha de Revisión");

        jLabel_Error_Presente.setText("Error Presente");

        jLabel_Descrip_Error_Segui_Atra_Admin.setText("Descripción Del Error");

        jLabel_Soluc_Comenta_Seg_Atrac_Admi.setText("Solución o Comentario");

        jButton_Agregar_Seguimiento_Atra_Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/agregar.png"))); // NOI18N
        jButton_Agregar_Seguimiento_Atra_Admin.setContentAreaFilled(false);

        jButton_volver_seguimiento_atracciones_admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/previous1.png"))); // NOI18N
        jButton_volver_seguimiento_atracciones_admin.setContentAreaFilled(false);

        jTextArea_Solc_Comenta_Segui_De_Atrac_Admin.setColumns(20);
        jTextArea_Solc_Comenta_Segui_De_Atrac_Admin.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Solc_Comenta_Segui_De_Atrac_Admin);

        jTextArea_Descrip_Error_Segui_Atra_Admi.setColumns(20);
        jTextArea_Descrip_Error_Segui_Atra_Admi.setRows(5);
        jScrollPane3.setViewportView(jTextArea_Descrip_Error_Segui_Atra_Admi);

        javax.swing.GroupLayout jPane_Regist_Atra_AdminLayout = new javax.swing.GroupLayout(jPane_Regist_Atra_Admin);
        jPane_Regist_Atra_Admin.setLayout(jPane_Regist_Atra_AdminLayout);
        jPane_Regist_Atra_AdminLayout.setHorizontalGroup(
            jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nombre_Atraccion_Seguimiento_Atrac)
                            .addComponent(jLabel_Revisor_Seguimiento_Atrac)
                            .addComponent(jLabel_Fecha_de_Instalacion)
                            .addComponent(jLabel_Error_Presente)
                            .addComponent(jLabel_Descrip_Error_Segui_Atra_Admin)
                            .addComponent(jLabel_Soluc_Comenta_Seg_Atrac_Admi)))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton_volver_seguimiento_atracciones_admin)))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Agregar_Seguimiento_Atra_Admin)
                        .addGap(131, 131, 131))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Atrac_Seguimiento_Atrc_Admin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Revisor_Segui_De_Atra_Admin)
                    .addComponent(Date_Fecha_Revi_Seguimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Error))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );
        jPane_Regist_Atra_AdminLayout.setVerticalGroup(
            jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre_Atraccion_Seguimiento_Atrac)
                    .addComponent(jTextField_Atrac_Seguimiento_Atrc_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Revisor_Segui_De_Atra_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Revisor_Seguimiento_Atrac))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Date_Fecha_Revi_Seguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Fecha_de_Instalacion)))
                .addGap(17, 17, 17)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Error_Presente)
                    .addComponent(jCheckBox_Error))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                                .addComponent(jLabel_Descrip_Error_Segui_Atra_Admin)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Soluc_Comenta_Seg_Atrac_Admi))
                        .addGap(83, 83, 83)
                        .addComponent(jButton_volver_seguimiento_atracciones_admin)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Agregar_Seguimiento_Atra_Admin)
                        .addGap(51, 51, 51))))
        );

        jLabel_Seguimiento_atrac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/Seguimiento de atrac.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Seguimiento_atrac, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Seguimiento_atrac, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable_Seguimiento_Atracciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Atraccion", "Revisor", "Fecha", "Error Presente", "Descripcion", "Solucion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Seguimiento_Atracciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPane_Regist_Atra_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPane_Regist_Atra_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Seguimiento_De_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seguimiento_De_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seguimiento_De_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seguimiento_De_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seguimiento_De_Atracciones_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser Date_Fecha_Revi_Seguimiento;
    public javax.swing.JButton jButton_Agregar_Seguimiento_Atra_Admin;
    public javax.swing.JButton jButton_volver_seguimiento_atracciones_admin;
    public javax.swing.JCheckBox jCheckBox_Error;
    private javax.swing.JLabel jLabel_Descrip_Error_Segui_Atra_Admin;
    private javax.swing.JLabel jLabel_Error_Presente;
    private javax.swing.JLabel jLabel_Fecha_de_Instalacion;
    private javax.swing.JLabel jLabel_Nombre_Atraccion_Seguimiento_Atrac;
    private javax.swing.JLabel jLabel_Revisor_Seguimiento_Atrac;
    private javax.swing.JLabel jLabel_Seguimiento_atrac;
    private javax.swing.JLabel jLabel_Soluc_Comenta_Seg_Atrac_Admi;
    private javax.swing.JPanel jPane_Regist_Atra_Admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable_Seguimiento_Atracciones;
    public javax.swing.JTextArea jTextArea_Descrip_Error_Segui_Atra_Admi;
    public javax.swing.JTextArea jTextArea_Solc_Comenta_Segui_De_Atrac_Admin;
    public javax.swing.JTextField jTextField_Atrac_Seguimiento_Atrc_Admin;
    public javax.swing.JTextField jTextField_Revisor_Segui_De_Atra_Admin;
    // End of variables declaration//GEN-END:variables
}
