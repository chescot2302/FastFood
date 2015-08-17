/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.logic;

import com.ff.dao.Conexion;
import com.ff.dao.DaoDetallePedido;
import com.ff.entity.BeanDetallePedido;
import com.ff.entity.BeanPedido;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Administrador
 */
public class LogicDetallePedido {
    public static BeanDetallePedido beanDetallePedido(int id) {
        
        BeanDetallePedido objDetallePedido = new BeanDetallePedido();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(id);
            ArrayList objetos = DaoDetallePedido.beanDetallePedido(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objDetallePedido.setCantidad(rs.getInt("CANTIDAD"));
                    objDetallePedido.setId(rs.getInt("ID_DETALLE_PEDIDO"));
                    objDetallePedido.setObjPedido(LogicPedido.beanPedido(rs.getInt("ID_PEDIDO")));
                    objDetallePedido.setObjProducto(LogicProducto.beanProducto(rs.getString("COD_PRODUCTO")));
                    objDetallePedido.setPrecio(rs.getDouble("PRECIO"));
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
        return objDetallePedido;
    }
    
    public static ArrayList<BeanDetallePedido> listarDetallePedido(int idPedido) {
        ArrayList<BeanDetallePedido> lista=new ArrayList();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(idPedido);
            ArrayList objetos = DaoDetallePedido.listarDetallePedido(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    BeanDetallePedido objDetallePedido = new BeanDetallePedido();
                    objDetallePedido.setCantidad(rs.getInt("CANTIDAD"));
                    objDetallePedido.setId(rs.getInt("ID_DETALLE_PEDIDO"));
                    objDetallePedido.setObjPedido(LogicPedido.beanPedido(rs.getInt("ID_PEDIDO")));
                    objDetallePedido.setObjProducto(LogicProducto.beanProducto(rs.getString("COD_PRODUCTO")));
                    objDetallePedido.setPrecio(rs.getDouble("PRECIO"));
                    lista.add(objDetallePedido);
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
    
    public static String registrarDetallePedido(ArrayList<BeanDetallePedido> listaDetalles,Conexion cnx) {                
        String msg="error";
        CallableStatement cst = null;   
        Iterator i=listaDetalles.iterator();        
        try {
            ArrayList param = new ArrayList();
            ArrayList objetos;
            while(i.hasNext()){
                BeanDetallePedido bdp=(BeanDetallePedido)i.next();
                param.add(OracleTypes.VARCHAR);
                param.add(bdp.getCantidad());
                param.add(bdp.getPrecio());
                param.add(bdp.getObjProducto().getCodigo());
                param.add(bdp.getObjPedido().getId());
                objetos= DaoDetallePedido.registrarDetallePedido(param,cnx);
                msg=String.valueOf(objetos.get(0));
                cst = (CallableStatement) objetos.get(1);
                cnx = (Conexion) objetos.get(2);
                if (cst != null && cnx != null) {
                if(msg.equalsIgnoreCase("i")){                    
                    param.clear();
                    msg="correcto";
                }else{
                    cnx.rollback();
                    cst.close();
                    cnx.destroy();                    
                    msg="error";
                }
            }
          }                                  
            cnx.commit();
            cst.close();
            cnx.destroy();
        } catch (SQLException ex) {
            try {
                System.err.println(ex.getCause());    
                if (cnx!=null) {                    
                        cnx.rollback();
                        cnx.destroy();                    
                    }
            } catch (SQLException ex1) {
                System.err.println(ex1.getCause());    
            }
        }catch (NullPointerException ex) {
            try {
                System.err.println(ex.getCause());    
                if (cnx!=null) {                    
                        cnx.rollback();
                        cnx.destroy();                    
                    }
            } catch (SQLException ex1) {
                System.err.println(ex1.getCause());    
            }
        } finally {
            try {                
                if (cst!=null) {
                    cst.close();
                }
                if (cnx!=null) {
                    cnx.destroy();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getCause());
            }
        }
        return msg;
    }    
    
}
