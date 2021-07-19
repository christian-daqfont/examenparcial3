/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.exam.daoImpl;

import com.upeu.exam.config.Conexion;
import com.upeu.exam.dao.ClienteDao;

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
public class ClientesDaoImp implements ClienteDao{
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx = null;
    @Override
    public List<Map<String, Object>> readAll() {
        List<Map<String, Object>> lista = new ArrayList<>();
        String SQL= "SELECT * FROM cliente";
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery(SQL);
            while(rs.next()) {
                Map<String,Object> map = new HashMap<>();
                map.put("idcliente",rs.getInt("idcliente"));
                map.put("nombre",rs.getString("nombres")+" "+rs.getString("apellidos"));
                lista.add(map);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: "+e);
        }
        return lista;
    }
    
}
