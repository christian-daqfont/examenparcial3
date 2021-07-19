/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.exam.dao;

import java.util.List;
import java.util.Map;

import com.upeu.exam.model.Venta;

/**
 *
 * @author Nick Meza
 */
public interface VentaDao {
    int crate(Venta p);
    int delete(int id);
    List<Map<String,Object>> readAll();
}
