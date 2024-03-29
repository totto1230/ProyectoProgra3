package com.ulatina.grupo5.dao.impl;

import com.ulatina.grupo5.dao.BaseDAO;
import com.ulatina.grupo5.helpers.Conexion;
import com.ulatina.grupo5.modelo.Atracciones;
import com.ulatina.grupo5.modelo.BookeoAtracciones;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AtraccionesDAOImpl implements BaseDAO {

    Conexion conectar = new Conexion();

    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    Atracciones p = new Atracciones();

    @Override
    public Boolean insertar(Object obj) {

        p = (Atracciones) obj;

        String sql = "INSERT INTO Atracciones (idAtracciones, nombreAtraccion, fechaInstalacion, capacidad, seccion, edadMinima,edadMaxima, precioNormal,activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {

            conectar.connectar();

            con = conectar.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getIdAtracciones());
            ps.setString(2, p.getNombreAtraccion());
            ps.setDate(3, p.getFechaInstalacion());
            ps.setInt(4, p.getCapacidad());
            ps.setString(5, p.getSeccion());
            ps.setInt(6, p.getEdadMin());
            ps.setInt(7, p.getEdadMax());
            ps.setFloat(8, p.getPrecioNormal());
            ps.setBoolean(9, p.getActivo());

            int registros = ps.executeUpdate();

            if (registros > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        }

    }

    @Override
    public Boolean actualizar(Object obj) {

        p = (Atracciones) obj;

        String sql = "UPDATE SET Atracciones nombreAtraccion = ?, fechaInstalacion = ?, capacidad = ?, seccion = ?, edadMinima = ?, edadMaxima = ? precioNormal = ?, activo = ? WHERE idAtracciones = ?";
        try {

            conectar.connectar();

            con = conectar.getConnection();
            ps = con.prepareStatement(sql);

            
            ps.setString(1, p.getNombreAtraccion());
            ps.setDate(2, p.getFechaInstalacion());
            ps.setInt(3, p.getCapacidad());
            ps.setString(4, p.getSeccion());
            ps.setInt(5, p.getEdadMin());
            ps.setInt(6, p.getEdadMax());
            ps.setFloat(7, p.getPrecioNormal());
            ps.setBoolean(8, p.getActivo());
            ps.setInt(9, p.getIdAtracciones());

            int registros = ps.executeUpdate();

            if (registros > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public Boolean eliminar(Object obj) {

        p = (Atracciones) obj;

        String sql = "DELETE FROM Atracciones WHERE idAtracciones = ?";

        try {

            conectar.connectar();
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getIdAtracciones());

            int registros = ps.executeUpdate();

            if (registros > 0) {
                con.close();
                return true;
            } else {
                con.close();
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }

    @Override
    public Boolean eliminarTodos(Integer id) {
        return null;
    }

    @Override
    public void listar(JTable table) {
        String[] titulos = {"Id de Atracción", "Nombre Atracción", "Fecha de Instalación", "Capacidad", "Sección", "Edad Mínima", "Edad Mínima", "Precio Normal", "Activo"};
        String[] registros = new String[titulos.length];
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        String sql = "SELECT idAtracciones, nombreAtraccion, fechaInstalacion, capacidad, seccion, edadMinima, edadMaxima, precioNormal, activo FROM Atracciones";

        try {
            conectar.connectar();
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                registros[0] = rs.getString("idAtracciones");
                registros[1] = rs.getString("nombreAtraccion");
                registros[2] = rs.getString("fechaInstalacion");
                registros[3] = rs.getString("capacidad");
                registros[4] = rs.getString("seccion");
                registros[5] = rs.getString("edadMinima");
                registros[6] = rs.getString("edadMaxima");
                registros[7] = rs.getString("precioNormal");
                registros[8] = rs.getString("activo");
                model.addRow(registros);

            }
            table.setModel(model);

            con.close();

        } catch (Exception ex) {
            System.out.println("Error");
        }

    }

    @Override
    public Object listarUno(Integer id) {
        String sql = "SELECT idAtracciones, nombreAtraccion, fechaInstalacion, capacidad, seccion, edadMinima, edadMaxima, precioNormal, activo FROM Atracciones where idAtracciones = ?";
        try {

            conectar.connectar();
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                p.setIdAtracciones(rs.getInt("idAtracciones"));
                p.setNombreAtraccion(rs.getString("nombreAtraccion"));
                p.setFechaInstalacion(rs.getDate("fechaInstalacion"));
                p.setCapacidad(rs.getInt("capacidad"));
                p.setSeccion(rs.getString("seccion"));
                p.setEdadMin(rs.getInt("edadMinima"));
                p.setEdadMax(rs.getInt("edadMaxima"));
                p.setPrecioNormal(rs.getInt("precioNormal"));
                p.setActivo(rs.getBoolean("activo"));
            }
            con.close();

        } catch (Exception ex) {
            System.out.println("Error");
        }
        return p;
    }

    @Override
    /**
     * Trae todas la atracciones por estado activo. El parametro es booleano
     */
    public Object[] listarPor(Object obj) {
        String sql = "SELECT idAtracciones, nombreAtraccion, fechaInstalacion, capacidad, seccion, edadMinima, edadMaxima, precioNormal, activo FROM Atracciones where activo = ?";
        Boolean parameter = (Boolean) obj;
        ArrayList<Atracciones> atracciones = new ArrayList<Atracciones>();
        try {
            conectar.connectar();
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setBoolean(1, parameter);
            rs = ps.executeQuery();
            while (rs.next()) {
                Atracciones atraccion = new Atracciones();
                atraccion.setIdAtracciones(rs.getInt("idAtracciones"));
                atraccion.setNombreAtraccion(rs.getString("nombreAtraccion"));
                atraccion.setFechaInstalacion(rs.getDate("fechaInstalacion"));
                atraccion.setCapacidad(rs.getInt("capacidad"));
                atraccion.setSeccion(rs.getString("seccion"));
                atraccion.setEdadMin(rs.getInt("edadMinima"));
                atraccion.setEdadMax(rs.getInt("edadMaxima"));
                atraccion.setPrecioNormal(rs.getInt("precioNormal"));
                atraccion.setActivo(rs.getBoolean("activo"));
                atracciones.add(atraccion);
            }
            con.close();

        } catch (Exception ex) {
            System.out.println("Error");
        }
        return (Object[])atracciones.toArray();
    }

    @Override
    public int nextID() {
        String sql = "select COALESCE(max(idAtracciones),0) + 1 as nextCode from Atracciones";
        Integer nextCode = 0;
        try {
            conectar.connectar();
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                nextCode = rs.getInt("nextCode");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error");
            return -1;
        }
        return nextCode;
    }
}
