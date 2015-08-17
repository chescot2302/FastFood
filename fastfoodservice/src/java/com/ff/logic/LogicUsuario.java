/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.logic;

import com.ff.dao.Conexion;
import com.ff.dao.DaoUsuario;
import com.ff.entity.BeanUsuario;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Administrador
 */
public class LogicUsuario {
    public static BeanUsuario beanUsuario(String codigo) {
        BeanUsuario objUsuario = new BeanUsuario();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(codigo);
            ArrayList objetos = DaoUsuario.beanUsuario(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objUsuario.setCodigo(rs.getString("COD_USUARIO"));
                    objUsuario.setNombre(rs.getString("NOMBRE"));
                    objUsuario.setAlias(rs.getString("NICK"));
                    objUsuario.setClave(rs.getString("CLAVE"));                                                            
                    objUsuario.setObjSucursal(LogicSucursal.beanSucursal(rs.getString("COD_SUCURSAL")));                    
                }
                rs.close();
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (cnx != null) {
                    cnx.destroy();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getCause());
            }
        }
        return objUsuario;
    }
    
    public static BeanUsuario logearUsuario(String usuario, String clave) {
        BeanUsuario objUsuario = new BeanUsuario();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(usuario);
            param.add(clave);
            ArrayList objetos = DaoUsuario.beanUsuarioValidado(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objUsuario.setCodigo(rs.getString("COD_USUARIO"));
                    objUsuario.setNombre(rs.getString("NOMBRE"));
                    objUsuario.setAlias(rs.getString("NICK"));
                    objUsuario.setClave(rs.getString("CLAVE"));                                                            
                    objUsuario.setObjSucursal(LogicSucursal.beanSucursal(rs.getString("COD_SUCURSAL")));                    
                }
                rs.close();
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (cst != null) {
                    cst.close();
                }
                if (cnx != null) {
                    cnx.destroy();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getCause());
            }
        }
        return objUsuario;
    }
}
