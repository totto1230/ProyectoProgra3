/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ulatina.grupo5.vista;

/**
 *
 * @author josep
 */
public class Registro_Atracciones_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Atracciones_Admin
     */
    public Registro_Atracciones_Admin() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPane_Regist_Atra_Admin = new javax.swing.JPanel();
        jLabel_Nombre_Atraccion = new javax.swing.JLabel();
        jLabel_Identificador_Atraccion = new javax.swing.JLabel();
        jLabel_Fecha_de_Instalacion = new javax.swing.JLabel();
        jLabel_Capacidad = new javax.swing.JLabel();
        jLabel_Sección = new javax.swing.JLabel();
        jLabel_Rango_de_Edad_Permitido = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel_Precio_Por_Persona = new javax.swing.JLabel();
        txtNombreAtraccion = new javax.swing.JTextField();
        txtCodigoAtraccion = new javax.swing.JTextField();
        dtpFechaInstalacion = new com.toedter.calendar.JDateChooser();
        ddlSeccion = new javax.swing.JComboBox<>();
        ddlRangoEdad = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jLabel4_Simbolo_Colones_Regist_Atra_Admin = new javax.swing.JLabel();
        sldCapacidad = new javax.swing.JSlider();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtracciones = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nombre_Atraccion.setText("Nombre atracción");

        jLabel_Identificador_Atraccion.setText("Identificador atracción");

        jLabel_Fecha_de_Instalacion.setText("Fecha de instalación");

        jLabel_Capacidad.setText("Capacidad");

        jLabel_Sección.setText("Sección");

        jLabel_Rango_de_Edad_Permitido.setText("Rango de edad permitido");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/agregar.png"))); // NOI18N
        btnAgregar.setContentAreaFilled(false);

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/previous1.png"))); // NOI18N
        btnVolver.setContentAreaFilled(false);

        jLabel_Precio_Por_Persona.setText("Precio por persona");

        ddlSeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantil", "Adultos", "Familiar" }));

        ddlRangoEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));

        jLabel4_Simbolo_Colones_Regist_Atra_Admin.setText("₡");

        sldCapacidad.setMajorTickSpacing(20);
        sldCapacidad.setPaintLabels(true);
        sldCapacidad.setPaintTicks(true);

        javax.swing.GroupLayout jPane_Regist_Atra_AdminLayout = new javax.swing.GroupLayout(jPane_Regist_Atra_Admin);
        jPane_Regist_Atra_Admin.setLayout(jPane_Regist_Atra_AdminLayout);
        jPane_Regist_Atra_AdminLayout.setHorizontalGroup(
            jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nombre_Atraccion)
                            .addComponent(jLabel_Identificador_Atraccion)
                            .addComponent(jLabel_Fecha_de_Instalacion)
                            .addComponent(jLabel_Capacidad)
                            .addComponent(jLabel_Sección)
                            .addComponent(jLabel_Rango_de_Edad_Permitido)
                            .addComponent(jLabel_Precio_Por_Persona)))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver)))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                                .addComponent(sldCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(txtNombreAtraccion)
                            .addComponent(txtCodigoAtraccion)
                            .addComponent(dtpFechaInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ddlSeccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                                        .addComponent(jLabel4_Simbolo_Colones_Regist_Atra_Admin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ddlRangoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPane_Regist_Atra_AdminLayout.setVerticalGroup(
            jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Nombre_Atraccion)
                    .addComponent(txtNombreAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoAtraccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Identificador_Atraccion))
                .addGap(12, 12, 12)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dtpFechaInstalacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Fecha_de_Instalacion))
                .addGap(18, 18, 18)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Capacidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Sección)
                    .addComponent(ddlSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Rango_de_Edad_Permitido)
                    .addComponent(ddlRangoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel_Precio_Por_Persona))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4_Simbolo_Colones_Regist_Atra_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPane_Regist_Atra_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnVolver)
                        .addGap(17, 17, 17))
                    .addGroup(jPane_Regist_Atra_AdminLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnAgregar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/images/registrodeatrac.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblAtracciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre Atraccion", "Identificador Atraccion", "Fecha Instalacion", "Capacidad", "Seccion", "Rango Edad", "Precio Persona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAtracciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPane_Regist_Atra_Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPane_Regist_Atra_Admin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            java.util.logging.Logger.getLogger(Registro_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Atracciones_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Atracciones_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnVolver;
    public javax.swing.JComboBox<String> ddlRangoEdad;
    public javax.swing.JComboBox<String> ddlSeccion;
    public com.toedter.calendar.JDateChooser dtpFechaInstalacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4_Simbolo_Colones_Regist_Atra_Admin;
    private javax.swing.JLabel jLabel_Capacidad;
    private javax.swing.JLabel jLabel_Fecha_de_Instalacion;
    private javax.swing.JLabel jLabel_Identificador_Atraccion;
    private javax.swing.JLabel jLabel_Nombre_Atraccion;
    private javax.swing.JLabel jLabel_Precio_Por_Persona;
    private javax.swing.JLabel jLabel_Rango_de_Edad_Permitido;
    private javax.swing.JLabel jLabel_Sección;
    private javax.swing.JPanel jPane_Regist_Atra_Admin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JSlider sldCapacidad;
    public javax.swing.JTable tblAtracciones;
    public javax.swing.JTextField txtCodigoAtraccion;
    public javax.swing.JTextField txtNombreAtraccion;
    public javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
