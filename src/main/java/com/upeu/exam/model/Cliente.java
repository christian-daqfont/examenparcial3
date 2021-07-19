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
public class Cliente {
    private int idcliente;
    private String nombre;
    private String apellido;
    private String numero;

    public Cliente() {
    }

    public Cliente(int idcliente, String nombre, String apellido, String numero) {
        this.idcliente = idcliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
