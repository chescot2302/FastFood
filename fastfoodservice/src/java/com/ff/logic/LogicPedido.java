/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.logic;

import com.ff.dao.Conexion;
import com.ff.dao.DaoPedido;
import com.ff.entity.BeanDetallePedido;
import com.ff.entity.BeanPedido;
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
public class LogicPedido {
    
    public static BeanPedido beanPedido(int id) {        
        BeanPedido objPedido = new BeanPedido();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(id);
            ArrayList objetos = DaoPedido.beanPedido(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    objPedido.setCliente(rs.getString("CLIENTE"));
                    objPedido.setDireccion(rs.getString("DIRECCION"));
                    objPedido.setEstado(rs.getString("ESTADO"));
                    objPedido.setFecha(rs.getString("FECHA"));
                    objPedido.setId(rs.getInt("ID_PEDIDO"));
                    objPedido.setImporte(rs.getDouble("IMPORTE"));
                    objPedido.setModalidad(rs.getString("MODALIDAD"));
                    objPedido.setObjSucursal(LogicSucursal.beanSucursal(rs.getString("COD_SUCURSAL")));
                    objPedido.setObjUsuario(LogicUsuario.beanUsuario(rs.getString("COD_USUARIO")));
                    objPedido.setPago(rs.getDouble("PAGO"));
                    objPedido.setTelefono(rs.getString("TELEFONO"));
                    objPedido.setVuelto(rs.getDouble("VUELTO"));
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
        return objPedido;
    }
    
    public static ArrayList<BeanPedido> listarPedido(String codUsuario,String codSucursal) {        
        ArrayList<BeanPedido> lista=new ArrayList();
        ResultSet rs = null;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.CURSOR);
            param.add(codUsuario);
            param.add(codSucursal);
            ArrayList objetos = DaoPedido.listarPedido(param);
            rs = (ResultSet) objetos.get(0);
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (rs != null && cst != null && cnx != null) {
                while (rs.next()) {
                    BeanPedido objPedido = new BeanPedido();
                    objPedido.setCliente(rs.getString("CLIENTE"));
                    objPedido.setDireccion(rs.getString("DIRECCION"));
                    objPedido.setEstado(rs.getString("ESTADO"));
                    objPedido.setFecha(rs.getString("FECHA"));
                    objPedido.setId(rs.getInt("ID_PEDIDO"));
                    objPedido.setImporte(rs.getDouble("IMPORTE"));
                    objPedido.setModalidad(rs.getString("MODALIDAD"));
                    objPedido.setObjSucursal(LogicSucursal.beanSucursal(rs.getString("COD_SUCURSAL")));
                    objPedido.setObjUsuario(LogicUsuario.beanUsuario(rs.getString("COD_USUARIO")));
                    objPedido.setPago(rs.getDouble("PAGO"));
                    objPedido.setTelefono(rs.getString("TELEFONO"));
                    objPedido.setVuelto(rs.getDouble("VUELTO"));
                    lista.add(objPedido);
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
    
    /*public static int registrarPedido(
            String pcliente,
            String pdireccion,
            String  ptelefono,
            double pimporte,
            double ppago,
            double pvuelto,
            String pestado,
            String pmodalidad,
            String pcod_sucursal,
            String pcod_usuario
            ) {         
        int val=-1;
        String rs;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.NUMBER);
            param.add(pcliente);
            param.add(pdireccion);            
            param.add(ptelefono);            
            param.add(pimporte);            
            param.add(ppago);            
            param.add(pvuelto);            
            param.add(pestado);            
            param.add(pmodalidad);            
            param.add(pcod_sucursal);   
            param.add(pcod_usuario);   
            ArrayList objetos = DaoPedido.registrarPedido(param);
            rs = String.valueOf(objetos.get(0).toString());
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (cst != null && cnx != null) {  
                val=Integer.parseInt(rs);
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {                
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
        return val;
    }*/
    
    /*public static int registrarPedido(BeanPedido obj) {         
        int val=-1;
        String rs;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.NUMBER);
            param.add(obj.getCliente());
            param.add(obj.getDireccion());            
            param.add(obj.getTelefono());            
            param.add(obj.getImporte());            
            param.add(obj.getPago());            
            param.add(obj.getVuelto());            
            param.add(obj.getEstado());            
            param.add(obj.getModalidad());            
            param.add(obj.getObjSucursal().getCodigo());   
            param.add(obj.getObjUsuario().getCodigo());   
            ArrayList objetos = DaoPedido.registrarPedido(param);
            rs = String.valueOf(objetos.get(0).toString());
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (cst != null && cnx != null) {  
                val=Integer.parseInt(rs);
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {                
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
        return val;
    }*/
    
    public static int registrarPedido(ArrayList<BeanDetallePedido> detalle) {          
        int val=-1;
        String rs;
        CallableStatement cst = null;        
        Conexion cnx=null;
        BeanPedido obj=detalle.get(0).getObjPedido();
        Iterator i=detalle.iterator();
        double importe=0;
        double vuelto=0;
        BeanDetallePedido bean;
        while(i.hasNext()){
            bean=(BeanDetallePedido)i.next();
            importe=importe+bean.getPrecio()*bean.getCantidad();
        }
        vuelto=obj.getPago()-importe;
        obj.setImporte(importe);
        obj.setVuelto(vuelto);
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.NUMBER);
            param.add(obj.getId());
            param.add(obj.getCliente());
            param.add(obj.getDireccion());            
            param.add(obj.getTelefono());            
            param.add(obj.getImporte());            
            param.add(obj.getPago());            
            param.add(obj.getVuelto());            
            param.add(obj.getEstado());            
            param.add(obj.getModalidad());            
            param.add(obj.getObjSucursal().getCodigo());   
            param.add(obj.getObjUsuario().getCodigo());   
            ArrayList objetos = DaoPedido.registrarPedido(param);
            rs = String.valueOf(objetos.get(0).toString());
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (cst != null && cnx != null) {  
                val=Integer.parseInt(rs);
                if(val==obj.getId()){                    
                    cst.close();                                        
                    String mensaje=LogicDetallePedido.registrarDetallePedido(detalle, cnx);
                    if(mensaje.equalsIgnoreCase("correcto")){
                        cnx.commit();
                    }else{
                    cnx.rollback();
                    cst.close();
                    cnx.destroy();
                    val=-1;
                    }
                }else{
                    cnx.rollback();
                    cst.close();
                    cnx.destroy();
                    val=-1;
                }                                           
            }
        } catch (SQLException ex) {
            try {                
                cnx.rollback();
                        cst.close();
                        cnx.destroy();
            } catch (SQLException ex1) {
                System.err.println(ex.getCause());
            }
        }catch(NullPointerException ex){
            try {                
                cnx.rollback();
                        cst.close();
                        cnx.destroy();
            } catch (SQLException ex1) {
                System.err.println(ex1.getCause());
            }
        } finally {
            try {                
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
        return val;
    }
    
    
    
    public static int getSeqPedido() {         
        int val=-1;
        String rs;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.NUMBER);            
            ArrayList objetos = DaoPedido.obtenerSeqPedido(param);
            rs = String.valueOf(objetos.get(0).toString());
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (cst != null && cnx != null) {  
                val=Integer.parseInt(rs);
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {                
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
        return val;
    }
    
    
    public static int updateEstado(int idpedido,String estado) {                
        int rs = -1;
        CallableStatement cst = null;
        Conexion cnx = null;
        try {            
            ArrayList param = new ArrayList();
            param.add(OracleTypes.NUMBER);
            param.add(idpedido);
            param.add(estado);
            ArrayList objetos = DaoPedido.actualizarEstado(param);
            rs = Integer.parseInt(String.valueOf(objetos.get(0)));
            cst = (CallableStatement) objetos.get(1);
            cnx = (Conexion) objetos.get(2);
            if (cst != null && cnx != null) {                                
                cst.close();
                cnx.destroy();
            }
        } catch (SQLException ex) {
            System.err.println(ex.getCause());
        } finally {
            try {                
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
        return rs;
    }
}
