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
public class Sucursal {
    private int idsucursa;
    private String nomsucursal;

    public Sucursal() {
    }

    public Sucursal(int idsucursa, String nomsucursal) {
        this.idsucursa = idsucursa;
        this.nomsucursal = nomsucursal;
    }

    public int getIdsucursa() {
        return idsucursa;
    }

    public void setIdsucursa(int idsucursa) {
        this.idsucursa = idsucursa;
    }

    public String getNomsucursal() {
        return nomsucursal;
    }

    public void setNomsucursal(String nomsucursal) {
        this.nomsucursal = nomsucursal;
    }
    
}
