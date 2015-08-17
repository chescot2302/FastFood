/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class DaoDetallePedido {
    public static ArrayList beanDetallePedido(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=beandetallepedido(?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList listarDetallePedido(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=listardetallepedido(?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList registrarDetallePedido(ArrayList param,Conexion objCnx) {        
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=registrardetallepedido(?,?,?,?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
}
