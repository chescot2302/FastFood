
package com.ff.ws_client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b04 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "wsfastfood", targetNamespace = "http://ws.ff.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Wsfastfood {


    /**
     * 
     * @param codigo
     * @return
     *     returns com.ff.ws_client.BeanSucursal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeanSucursal", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanSucursal")
    @ResponseWrapper(localName = "getBeanSucursalResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanSucursalResponse")
    public BeanSucursal getBeanSucursal(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @return
     *     returns java.util.List<com.ff.ws_client.BeanSucursal>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListaSucursal", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaSucursal")
    @ResponseWrapper(localName = "getListaSucursalResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaSucursalResponse")
    public List<BeanSucursal> getListaSucursal();

    /**
     * 
     * @param codigo
     * @return
     *     returns com.ff.ws_client.BeanUsuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeanUsuario", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanUsuario")
    @ResponseWrapper(localName = "getBeanUsuarioResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanUsuarioResponse")
    public BeanUsuario getBeanUsuario(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @param password
     * @param user
     * @return
     *     returns com.ff.ws_client.BeanUsuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getValidarUsuario", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetValidarUsuario")
    @ResponseWrapper(localName = "getValidarUsuarioResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetValidarUsuarioResponse")
    public BeanUsuario getValidarUsuario(
        @WebParam(name = "user", targetNamespace = "")
        String user,
        @WebParam(name = "password", targetNamespace = "")
        String password);

    /**
     * 
     * @param codigo
     * @return
     *     returns com.ff.ws_client.BeanProducto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeanProducto", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanProducto")
    @ResponseWrapper(localName = "getBeanProductoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanProductoResponse")
    public BeanProducto getBeanProducto(
        @WebParam(name = "codigo", targetNamespace = "")
        String codigo);

    /**
     * 
     * @return
     *     returns java.util.List<com.ff.ws_client.BeanProducto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListaProducto", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaProducto")
    @ResponseWrapper(localName = "getListaProductoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaProductoResponse")
    public List<BeanProducto> getListaProducto();

    /**
     * 
     * @param idpedido
     * @return
     *     returns com.ff.ws_client.BeanPedido
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeanPedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanPedido")
    @ResponseWrapper(localName = "getBeanPedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanPedidoResponse")
    public BeanPedido getBeanPedido(
        @WebParam(name = "idpedido", targetNamespace = "")
        int idpedido);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getUpdateEstado", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetUpdateEstado")
    @ResponseWrapper(localName = "getUpdateEstadoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetUpdateEstadoResponse")
    public int getUpdateEstado(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param iddetallepedido
     * @return
     *     returns com.ff.ws_client.BeanDetallePedido
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBeanDetallePedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanDetallePedido")
    @ResponseWrapper(localName = "getBeanDetallePedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetBeanDetallePedidoResponse")
    public BeanDetallePedido getBeanDetallePedido(
        @WebParam(name = "iddetallepedido", targetNamespace = "")
        int iddetallepedido);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getRegistrarPedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetRegistrarPedido")
    @ResponseWrapper(localName = "getRegistrarPedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetRegistrarPedidoResponse")
    public int getRegistrarPedido(
        @WebParam(name = "arg0", targetNamespace = "")
        List<BeanDetallePedido> arg0);

    /**
     * 
     * @param codsucursal
     * @param codusuario
     * @return
     *     returns java.util.List<com.ff.ws_client.BeanPedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListarPedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListarPedido")
    @ResponseWrapper(localName = "getListarPedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListarPedidoResponse")
    public List<BeanPedido> getListarPedido(
        @WebParam(name = "codusuario", targetNamespace = "")
        String codusuario,
        @WebParam(name = "codsucursal", targetNamespace = "")
        String codsucursal);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.HelloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSeqPedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetSeqPedido")
    @ResponseWrapper(localName = "getSeqPedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetSeqPedidoResponse")
    public int getSeqPedido();

    /**
     * 
     * @param idpedido
     * @return
     *     returns java.util.List<com.ff.ws_client.BeanDetallePedido>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListaDetallePedido", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaDetallePedido")
    @ResponseWrapper(localName = "getListaDetallePedidoResponse", targetNamespace = "http://ws.ff.com/", className = "com.ff.ws_client.GetListaDetallePedidoResponse")
    public List<BeanDetallePedido> getListaDetallePedido(
        @WebParam(name = "idpedido", targetNamespace = "")
        int idpedido);

}
