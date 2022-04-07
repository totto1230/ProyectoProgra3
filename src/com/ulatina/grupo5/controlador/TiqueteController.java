package com.ulatina.grupo5.controlador;

import com.ulatina.grupo5.dao.BaseDAO;
import com.ulatina.grupo5.dao.impl.AtraccionesDAOImpl;
import com.ulatina.grupo5.dao.impl.BookeoAtraccionesDAOImpl;
import com.ulatina.grupo5.dao.impl.BookeoDAOImpl;
import com.ulatina.grupo5.dao.impl.BookeoPersonaDAOImpl;
import com.ulatina.grupo5.dao.impl.PrecioDAOImpl;
import com.ulatina.grupo5.dao.impl.UsuariosDAOImpl;
import com.ulatina.grupo5.modelo.Bookeo;
import com.ulatina.grupo5.modelo.BookeoPersona;
import com.ulatina.grupo5.modelo.Usuarios;
import com.ulatina.grupo5.vista.BookeoView;
import com.ulatina.grupo5.vista.Menu_Admin;
import com.ulatina.grupo5.vista.TiquetesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TiqueteController implements ActionListener{
    
    TiquetesView vista = new TiquetesView();
    BookeoView main = new BookeoView();
    
    Bookeo bookeo = new Bookeo();
    
    BaseDAO daoAtracciones = new AtraccionesDAOImpl();
    PrecioDAOImpl daoPrecios = new PrecioDAOImpl(); // para poder crear la subclase parametros
    BaseDAO daoBookeo = new BookeoDAOImpl();
    BaseDAO daoBookeoAtracciones = new BookeoAtraccionesDAOImpl();
    BaseDAO daoBookeoPersonas = new BookeoPersonaDAOImpl();
    BaseDAO daoUsuarios = new UsuariosDAOImpl();
    
    public TiqueteController(TiquetesView vista) {
        this.vista = vista;
        this.vista.btnBackTiquetes.addActionListener(this);
        this.vista.chkPaseEspecial.addActionListener(this);
        iniciar(bookeo);
        
    }
    
    public void iniciar(Bookeo bookeo){
        this.bookeo= bookeo;
        int tiquete = bookeo.getTicket();
        int usuario= bookeo.getCedula();
        String fechaVisita= bookeo.getFechaVisita().toString();
        boolean paseEspe= bookeo.isPaseEspecial();
        vista.lblTiquete.setText(String.valueOf(tiquete));
        vista.lblUsuario.setText(String.valueOf(usuario));
        vista.lblFechaDeVisita.setText(fechaVisita);
        vista.chkPaseEspecial.setText(String.valueOf(paseEspe));
    }
    
    
    public void personas(Bookeo bookeo){
       Usuarios usrSearch = new Usuarios(vista.lblUsuario.getText(), "", "", vista.txtUsuarioAtraccion.getText(), vista.txtUsuarioAtraccion.getText(), vista.txtUsuarioAtraccion.getText(), null, 0);
       Usuarios[] usuarios = (Usuarios[]) daoUsuarios.listarPor(usrSearch);
        
       
        
    }
    
    
     public void volver() {
        main.setVisible(true);
        vista.dispose();
    }
    
   
            
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == vista.btnBackTiquetes) {
           volver();
        } else if (e.getSource() == vista.chkPaseEspecial) {
            vista.tblAtraccion.setVisible(!vista.chkPaseEspecial.isSelected());
        }    
        
    }
    
}
