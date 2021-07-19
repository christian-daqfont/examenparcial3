/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.exam.model;

/**
 *
 * @author Nick Meza
 */
public class Venta {
    private int idventa;
    private String fecha;
    private String tipodoc;
    private int idsucursal;
    private int idcliente;

    public Venta() {
    }

    public Venta(int idventa, String fecha, String tipodoc, int idsucursal, int idcliente) {
        this.idventa = idventa;
        this.fecha = fecha;
        this.tipodoc = tipodoc;
        this.idsucursal = idsucursal;
        this.idcliente = idcliente;
    }

    public int getIdventa() {
        return idventa;
    }

    public void setIdventa(int idventa) {
        this.idventa = idventa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public int getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(int idsucursal) {
        this.idsucursal = idsucursal;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    
}
