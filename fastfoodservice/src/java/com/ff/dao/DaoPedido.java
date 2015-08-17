/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class DaoPedido {
    public static ArrayList beanPedido(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=beanpedido(?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList listarPedido(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=listarpedido(?,?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList registrarPedido(ArrayList param) {        
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=registrarpedido(?,?,?,?,?,?,?,?,?,?,?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList obtenerSeqPedido(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=obtenerseqpedido()}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList actualizarEstado(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=updateestadopedido(?,?)}";
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
