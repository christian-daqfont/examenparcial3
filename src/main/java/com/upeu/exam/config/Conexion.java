/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.upeu.exam.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost:3306/ventas?useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER="root";
	private static final String PASS="root";
	private static final String DRIVER="com.mysql.cj.jdbc.Driver";
	private static Connection cx = null;
	
	public static Connection getConexion() {
		try {
			Class.forName(DRIVER);
			if(cx==null) {
				cx = DriverManager.getConnection(URL, USER, PASS);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
		return cx;
	}
	public void desconectar() {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
