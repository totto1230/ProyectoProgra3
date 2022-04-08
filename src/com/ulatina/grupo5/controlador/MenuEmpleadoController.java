package com.ulatina.grupo5.controlador;

import com.ulatina.grupo5.vista.BookeoView;
import com.ulatina.grupo5.vista.AtraccionesListadoView;
import com.ulatina.grupo5.vista.LoginView;
import com.ulatina.grupo5.vista.MenuEmpleadoView;
import com.ulatina.grupo5.vista.MantenimientoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuEmpleadoController implements ActionListener {

    SeguimientoController seguimiento;
    BuscarAtraccionesController buscarAtrac;
    LoginController loginC;
    BookeoController bookeoC;

    //BaseDAO dao = new AtraccionesDAOImpl();
    MenuEmpleadoView vista = new MenuEmpleadoView();
    BookeoView bookeoView = new BookeoView();

    AtraccionesListadoView buscarAtracVista = new AtraccionesListadoView();
    MantenimientoView seguimientoAtraVist = new MantenimientoView();
    LoginView loginVista = new LoginView();

    public MenuEmpleadoController(MenuEmpleadoView vista) {
        this.vista = vista;
        this.vista.jButton5_back_main_menu_empleado.addActionListener(this);
        this.vista.btnSeguimiento.addActionListener(this);
        this.vista.btnBuscar.addActionListener(this);
        this.vista.btnBookeo.addActionListener(this);
    }
    
    public void init()
    {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnSeguimiento) {
            seguimiento = new SeguimientoController(seguimientoAtraVist);
            seguimiento.iniciar();
            seguimientoAtraVist.setVisible(true);
            vista.dispose();
        } else if (e.getSource() == vista.btnBuscar) {
            buscarAtrac = new BuscarAtraccionesController(buscarAtracVista);
            buscarAtrac.iniciar();
            buscarAtracVista.setVisible(true);
            vista.dispose();
        } else if (e.getSource() == vista.jButton5_back_main_menu_empleado) {
            loginC = new LoginController(loginVista);
            loginC.iniciar();
            loginVista.setVisible(true);
            vista.dispose();
        } else if (e.getSource() == vista.btnBookeo) {
            bookeoC = new BookeoController(bookeoView);
            bookeoC.iniciar();
            bookeoView.setVisible(true);
            vista.dispose();
        }

    }
}
