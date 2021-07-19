/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.exam.daoImpl;

import com.upeu.exam.config.Conexion;
import com.upeu.exam.dao.VentaDao;
import com.upeu.exam.model.Venta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
public class VentasDaoImp implements VentaDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx = null;
    @Override
    public int crate(Venta p) {
        int x = 0;
        String SQL="INSERT INTO venta (idventa, fecha, tipodoc, idsucursal, idcliente) VALUES (NULL, ?, ?, ?, ?);";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setString(1, p.getFecha());
            ps.setString(2, p.getTipodoc());
            ps.setInt(3, p.getIdsucursal());
            ps.setInt(4, p.getIdcliente());
            x = ps.executeUpdate();
            System.out.println(x);
        } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
        }
        return x;
    }

    @Override
    public int delete(int id) {
        int x = 0;
        String SQL = "DELETE FROM venta WHERE idventa = ?";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            ps.setInt(1, id);
            x = ps.executeUpdate();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        return x;
    }

    @Override
    public List<Map<String, Object>> readAll() {
        List<Map<String, Object>> lista = new ArrayList<>();
        String SQL= "SELECT v.idventa, s.nomsucursal, c.nombres, c.apellidos, v.fecha, v.tipodoc FROM venta v, cliente c, sucursal s WHERE c.idcliente=v.idcliente AND s.idsucursal=v.idsucursal;";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery(SQL);
            while(rs.next()) {
                Map<String,Object> map = new HashMap<>();
                map.put("idventa",rs.getString("idventa"));
                map.put("nomsucursal",rs.getString("nomsucursal"));
                map.put("nombre",rs.getString("nombres")+" "+rs.getString("apellidos"));
                map.put("fecha",rs.getString("fecha"));
                map.put("tipodoc",rs.getString("tipodoc"));
                lista.add(map);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
