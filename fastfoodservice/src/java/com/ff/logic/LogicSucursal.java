/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.logic;

import com.ff.dao.Conexion;
import com.ff.dao.DaoSucursal;
import com.ff.entity.BeanSucursal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Administrador
 */
public class LogicSucursal {
    public static BeanSucursal beanSucursal(String codigo) {
        BeanSucursal objSucursal = new BeanSucursal();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(codigo);
            ArrayList objetos = DaoSucursal.beanSucursal(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objSucursal.setCodigo(rs.getString("COD_SUCURSAL"));
                    objSucursal.setNombre(rs.getString("NOMBRE"));
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
        return objSucursal;
    }
    
    public static ArrayList<BeanSucursal> listarSucursal() {  
        ArrayList<BeanSucursal> lista=new ArrayList();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);            
            ArrayList objetos = DaoSucursal.listarSucursal(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    BeanSucursal objSucursal = new BeanSucursal();
                    objSucursal.setCodigo(rs.getString("COD_SUCURSAL"));
                    objSucursal.setNombre(rs.getString("NOMBRE"));
                    lista.add(objSucursal);
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
        return lista;
    }
    
}
