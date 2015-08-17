/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.ws;

import com.ff.entity.*;
import com.ff.logic.LogicDetallePedido;
import com.ff.logic.LogicPedido;
import com.ff.logic.LogicProducto;
import com.ff.logic.LogicSucursal;
import com.ff.logic.LogicUsuario;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrador
 */
@WebService(serviceName = "wsfastfood")
public class wsfastfood {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "getBeanSucursal")
    public BeanSucursal getBeanSucursal(@WebParam(name = "codigo") String codigo) {
        return LogicSucursal.beanSucursal(codigo);
    }
    
    @WebMethod(operationName = "getListaSucursal")
    public ArrayList<BeanSucursal> getListaSucursal() {
        return LogicSucursal.listarSucursal();
    }
    
    @WebMethod(operationName = "getBeanUsuario")
    public BeanUsuario getBeanUsuario(@WebParam(name = "codigo") String codigo) {
        return LogicUsuario.beanUsuario(codigo);
    }
    
    @WebMethod(operationName = "getValidarUsuario")
    public BeanUsuario getValidarUsuario(@WebParam(name = "user") String user,@WebParam(name = "password") String password) {
        return LogicUsuario.logearUsuario(user, password);
    }
    
    @WebMethod(operationName = "getBeanProducto")
    public BeanProducto getBeanProducto(@WebParam(name = "codigo") String codigo) {
        return LogicProducto.beanProducto(codigo);
    }
    
    @WebMethod(operationName = "getListaProducto")
    public ArrayList<BeanProducto> getListaProducto() {
        return LogicProducto.ListarProducto();
    }
    
    @WebMethod(operationName = "getBeanPedido")
    public BeanPedido getBeanPedido(@WebParam(name = "idpedido") int idpedido) {
        return LogicPedido.beanPedido(idpedido);
    }
    
    @WebMethod(operationName = "getBeanDetallePedido")
    public BeanDetallePedido getBeanDetallePedido(@WebParam(name = "iddetallepedido") int idDetallePedido) {
        return LogicDetallePedido.beanDetallePedido(idDetallePedido);
    }
    
    @WebMethod(operationName = "getListaDetallePedido")
    public ArrayList<BeanDetallePedido> getListaDetallePedido(@WebParam(name = "idpedido") int idPedido) {
        return LogicDetallePedido.listarDetallePedido(idPedido);
    }
    
    @WebMethod(operationName = "getListarPedido")
    public ArrayList<BeanPedido> getListarPedido(@WebParam(name = "codusuario") String codUsuario,@WebParam(name = "codsucursal") String codSucursal) {
        return LogicPedido.listarPedido(codUsuario, codSucursal);
    }
    
    /*@WebMethod(operationName = "getRegistrarPedido")
    public int getRegistrarPedido(
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
        return LogicPedido.registrarPedido(pcliente, pdireccion, ptelefono, pimporte, ppago, pvuelto, pestado, pmodalidad, pcod_sucursal, pcod_usuario);
    }*/
    
    /*@WebMethod(operationName = "getRegistrarBeanPedido")
    public int getRegistrarBeanPedido(BeanPedido objPedido) {
        return LogicPedido.registrarPedido(objPedido);
    }*/
    
    @WebMethod(operationName = "getSeqPedido")
    public int getSeqPedido() {
        return LogicPedido.getSeqPedido();
    }
    
    @WebMethod(operationName = "getRegistrarPedido")
    public int getRegistrarPedido(ArrayList<BeanDetallePedido> detalle) {
        return LogicPedido.registrarPedido(detalle);
    }
    
    @WebMethod(operationName = "getUpdateEstado")
    public int getUpdateEstado(int idPedido,String estado) {
        return LogicPedido.updateEstado(idPedido, estado);
    }
}
