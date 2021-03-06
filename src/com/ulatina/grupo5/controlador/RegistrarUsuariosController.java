package com.ulatina.grupo5.controlador;

import com.ulatina.grupo5.dao.BaseDAO;
import com.ulatina.grupo5.dao.impl.UsuariosDAOImpl;
import com.ulatina.grupo5.modelo.Usuarios;
import com.ulatina.grupo5.vista.MenuAdminView;
import com.ulatina.grupo5.vista.UsuariosView;
import com.ulatina.grupo5.vista.UsuariosListadoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;

class RegistrarUsuariosController implements ActionListener {

    BaseDAO dao = new UsuariosDAOImpl();
    UsuariosView vista = new UsuariosView();
    Usuarios user = new Usuarios();

    Menu_AdminController menuAdminCtrl;
    UsuariosController verUsuarios;
    
    MenuAdminView menuVista = new MenuAdminView();
    UsuariosListadoView verUsuarioVista = new UsuariosListadoView();
    
    int sender = 0;

    public RegistrarUsuariosController(UsuariosView vista) {
        this.vista = vista;
        this.vista.jButton_create_user.addActionListener(this);
        this.vista.jButton_previous_register.addActionListener(this);
        this.vista.btnActualizar.addActionListener(this);
    }

    public void iniciar() {
        vista.txtCed.setText("");
        vista.txtContra.setText("");
        vista.txtCorreo.setText("");
        vista.txtNombre.setText("");
        vista.txtPrimerApe.setText("");
        vista.txtSegundoApe.setText("");
        vista.btnActualizar.setVisible(false);
        sender = 0;
    }

    public void iniciar(Usuarios user) {
        vista.txtCed.setText(user.getCedula().toString());
        vista.txtContra.setText(user.getPassword());
        vista.txtCorreo.setText(user.getEmail());
        vista.txtNombre.setText(user.getNombre());
        vista.txtPrimerApe.setText(user.getApellido1());
        vista.txtSegundoApe.setText(user.getAppellido2());
        vista.dtpFechaCumpleanos.setDate(user.getFechaNacimiento());
        vista.ddlTipoUser.setSelectedIndex(user.getTipoUsuario() - 1);
        vista.btnActualizar.setVisible(true);
        vista.jButton_create_user.setVisible(false);
        sender = 1;

    }

    public Usuarios devolverUsers() {
        int cedula = Integer.parseInt(vista.txtCed.getText());
        String password = String.valueOf(vista.txtContra.getPassword());
        String email = vista.txtCorreo.getText();
        String nombre = vista.txtNombre.getText();
        String apellido1 = vista.txtPrimerApe.getText();
        String appellido2 = vista.txtSegundoApe.getText();
        Date fechaCumpleanos = vista.dtpFechaCumpleanos.getDate();
        int tipoUsuario = vista.ddlTipoUser.getSelectedIndex() + 1;

        return user = new Usuarios(cedula, password, email, nombre, apellido1, appellido2, fechaCumpleanos, tipoUsuario);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jButton_previous_register) {
            if (sender == 0) {
                menuAdminCtrl = new Menu_AdminController(menuVista);
                menuVista.setVisible(true);
                
            }else
            {
                verUsuarios = new UsuariosController(verUsuarioVista);
                verUsuarios.iniciar();
                verUsuarioVista.setVisible(true);
            }
            vista.dispose();       
        } else if (e.getSource() == vista.jButton_create_user) {

            user = devolverUsers();

            boolean resultado = dao.insertar(user);

            if (resultado) {
                JOptionPane.showMessageDialog(vista, "Agregado Correctamente");
                iniciar(user);
            } else {
                JOptionPane.showMessageDialog(vista, "Error al ingresar, por favor intente de nuevo");
            }
        } else if (e.getSource() == vista.btnActualizar) {
            user = devolverUsers();

            boolean resultado = dao.actualizar(user);

            if (resultado) {
                JOptionPane.showMessageDialog(vista, "Actualizado Correctamente");
            } else {
                JOptionPane.showMessageDialog(vista, "Error al ingresar, por favor intente de nuevo");
            }
        }

    }
}
