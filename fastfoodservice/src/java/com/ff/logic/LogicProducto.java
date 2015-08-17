/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.logic;

import com.ff.dao.Conexion;
import com.ff.dao.DaoProducto;
import com.ff.entity.BeanProducto;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Administrador
 */
public class LogicProducto {
    
    public static BeanProducto beanProducto(String codigo) {
        
        BeanProducto objProducto = new BeanProducto();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(codigo);
            ArrayList objetos = DaoProducto.beanProducto(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objProducto.setCodigo(rs.getString("COD_PRODUCTO"));
                    objProducto.setNombre(rs.getString("NOMBRE"));
                    objProducto.setPrecio(rs.getDouble("PRECIO"));
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
        return objProducto;
    }
    
        public static ArrayList<BeanProducto> ListarProducto() {
        ArrayList<BeanProducto> lista = new ArrayList();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            ArrayList objetos = DaoProducto.ListarProducto(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    BeanProducto objProducto = new BeanProducto();
                    objProducto.setCodigo(rs.getString("COD_PRODUCTO"));
                    objProducto.setNombre(rs.getString("NOMBRE"));
                    objProducto.setPrecio(rs.getDouble("PRECIO"));
                    lista.add(objProducto);
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
