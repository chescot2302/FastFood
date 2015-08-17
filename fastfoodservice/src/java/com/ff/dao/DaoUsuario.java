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
public class DaoUsuario {
    
    public static ArrayList beanUsuario(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=beanusuario(?)}";
                objetos= Consultas.funcion(proc, param, objCnx.getCnx());
                objetos.add(objCnx);
                return objetos;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        }
        return null;
    }
    
    public static ArrayList beanUsuarioValidado(ArrayList param) {
        ObjetoConexion cnxOra = new ObjetoConexion();
        Conexion objCnx = cnxOra.conectarORACLE();
        ArrayList objetos;
        try {
            if (!objCnx.getCnx().isClosed()) {
                String proc = "{call ?:=logearusuario(?,?)}";
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
