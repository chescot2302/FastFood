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
public class DaoProducto {
    
    public static ArrayList beanProducto(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=beanproducto(?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
        public static ArrayList ListarProducto(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=listarproducto()}";
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
