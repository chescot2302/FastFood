/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.ws;

import com.ff.ws_client.*;
import java.util.List;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 * REST Web Service
 *
 * @author Administrador
 */
@Path("wsfastfoodport")
public class wsfastfoodPort {
    private Wsfastfood port;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of wsfastfoodPort
     */
    public wsfastfoodPort() {
        port = getPort();
    }

    /**
     * Invokes the SOAP method getBeanSucursal
     * @param codigo resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanSucursal>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getbeansucursal/")
    public JAXBElement<BeanSucursal> getBeanSucursal(@QueryParam("codigo") String codigo) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanSucursal result = port.getBeanSucursal(codigo);
                return new JAXBElement<com.ff.ws_client.BeanSucursal>(new QName("http//ws_client.ff.com/", "beansucursal"), com.ff.ws_client.BeanSucursal.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getListaSucursal
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.GetListaSucursalResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getlistasucursal/")
    public JAXBElement<GetListaSucursalResponse> getListaSucursal() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<com.ff.ws_client.BeanSucursal> result = port.getListaSucursal();

                class GetListaSucursalResponse_1 extends com.ff.ws_client.GetListaSucursalResponse {

                    GetListaSucursalResponse_1(java.util.List<com.ff.ws_client.BeanSucursal> _return) {
                        this._return = _return;
                    }
                }
                com.ff.ws_client.GetListaSucursalResponse response = new GetListaSucursalResponse_1(result);
                return new com.ff.ws_client.ObjectFactory().createGetListaSucursalResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getBeanUsuario
     * @param codigo resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanUsuario>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getbeanusuario/")
    public JAXBElement<BeanUsuario> getBeanUsuario(@QueryParam("codigo") String codigo) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanUsuario result = port.getBeanUsuario(codigo);
                return new JAXBElement<com.ff.ws_client.BeanUsuario>(new QName("http//ws_client.ff.com/", "beanusuario"), com.ff.ws_client.BeanUsuario.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getValidarUsuario
     * @param user resource URI parameter
     * @param password resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanUsuario>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getvalidarusuario/")
    public JAXBElement<BeanUsuario> getValidarUsuario(@QueryParam("user") String user, @QueryParam("password") String password) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanUsuario result = port.getValidarUsuario(user, password);
                return new JAXBElement<com.ff.ws_client.BeanUsuario>(new QName("http//ws_client.ff.com/", "beanusuario"), com.ff.ws_client.BeanUsuario.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getBeanProducto
     * @param codigo resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanProducto>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getbeanproducto/")
    public JAXBElement<BeanProducto> getBeanProducto(@QueryParam("codigo") String codigo) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanProducto result = port.getBeanProducto(codigo);
                return new JAXBElement<com.ff.ws_client.BeanProducto>(new QName("http//ws_client.ff.com/", "beanproducto"), com.ff.ws_client.BeanProducto.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getListaProducto
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.GetListaProductoResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getlistaproducto/")
    public JAXBElement<GetListaProductoResponse> getListaProducto() {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<com.ff.ws_client.BeanProducto> result = port.getListaProducto();

                class GetListaProductoResponse_1 extends com.ff.ws_client.GetListaProductoResponse {

                    GetListaProductoResponse_1(java.util.List<com.ff.ws_client.BeanProducto> _return) {
                        this._return = _return;
                    }
                }
                com.ff.ws_client.GetListaProductoResponse response = new GetListaProductoResponse_1(result);
                return new com.ff.ws_client.ObjectFactory().createGetListaProductoResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getBeanPedido
     * @param idpedido resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanPedido>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getbeanpedido/")
    public JAXBElement<BeanPedido> getBeanPedido(@QueryParam("idpedido")
            @DefaultValue("0") int idpedido) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanPedido result = port.getBeanPedido(idpedido);
                return new JAXBElement<com.ff.ws_client.BeanPedido>(new QName("http//ws_client.ff.com/", "beanpedido"), com.ff.ws_client.BeanPedido.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getUpdateEstado
     * @param arg0 resource URI parameter
     * @param arg1 resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("getupdateestado/")
    public String getUpdateEstado(@QueryParam("arg0")
            @DefaultValue("0") int arg0, @QueryParam("arg1") String arg1) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.getUpdateEstado(arg0, arg1);
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getBeanDetallePedido
     * @param iddetallepedido resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.BeanDetallePedido>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getbeandetallepedido/")
    public JAXBElement<BeanDetallePedido> getBeanDetallePedido(@QueryParam("iddetallepedido")
            @DefaultValue("0") int iddetallepedido) {
        try {
            // Call Web Service Operation
            if (port != null) {
                com.ff.ws_client.BeanDetallePedido result = port.getBeanDetallePedido(iddetallepedido);
                return new JAXBElement<com.ff.ws_client.BeanDetallePedido>(new QName("http//ws_client.ff.com/", "beandetallepedido"), com.ff.ws_client.BeanDetallePedido.class, result);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getRegistrarPedido
     * @param arg0 resource URI parameter
     * @return an instance of java.lang.String
     */
    @POST
    @Produces("text/plain")
    @Consumes("application/xml")
    @Path("getregistrarpedido/")
    public String postGetRegistrarPedido(JAXBElement<List<BeanDetallePedido>> arg0) {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.getRegistrarPedido(arg0.getValue());
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getListarPedido
     * @param codusuario resource URI parameter
     * @param codsucursal resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.GetListarPedidoResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getlistarpedido/")
    public JAXBElement<GetListarPedidoResponse> getListarPedido(@QueryParam("codusuario") String codusuario, @QueryParam("codsucursal") String codsucursal) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<com.ff.ws_client.BeanPedido> result = port.getListarPedido(codusuario, codsucursal);

                class GetListarPedidoResponse_1 extends com.ff.ws_client.GetListarPedidoResponse {

                    GetListarPedidoResponse_1(java.util.List<com.ff.ws_client.BeanPedido> _return) {
                        this._return = _return;
                    }
                }
                com.ff.ws_client.GetListarPedidoResponse response = new GetListarPedidoResponse_1(result);
                return new com.ff.ws_client.ObjectFactory().createGetListarPedidoResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method hello
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("hello/")
    public String getHello(@QueryParam("name") String name) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.lang.String result = port.hello(name);
                return result;
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getSeqPedido
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("getseqpedido/")
    public String getSeqPedido() {
        try {
            // Call Web Service Operation
            if (port != null) {
                int result = port.getSeqPedido();
                return new java.lang.Integer(result).toString();
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     * Invokes the SOAP method getListaDetallePedido
     * @param idpedido resource URI parameter
     * @return an instance of javax.xml.bind.JAXBElement<com.ff.ws_client.GetListaDetallePedidoResponse>
     */
    @GET
    @Produces("application/xml")
    @Consumes("text/plain")
    @Path("getlistadetallepedido/")
    public JAXBElement<GetListaDetallePedidoResponse> getListaDetallePedido(@QueryParam("idpedido")
            @DefaultValue("0") int idpedido) {
        try {
            // Call Web Service Operation
            if (port != null) {
                java.util.List<com.ff.ws_client.BeanDetallePedido> result = port.getListaDetallePedido(idpedido);

                class GetListaDetallePedidoResponse_1 extends com.ff.ws_client.GetListaDetallePedidoResponse {

                    GetListaDetallePedidoResponse_1(java.util.List<com.ff.ws_client.BeanDetallePedido> _return) {
                        this._return = _return;
                    }
                }
                com.ff.ws_client.GetListaDetallePedidoResponse response = new GetListaDetallePedidoResponse_1(result);
                return new com.ff.ws_client.ObjectFactory().createGetListaDetallePedidoResponse(response);
            }
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }

    /**
     *
     */
    private Wsfastfood getPort() {
        try {
            // Call Web Service Operation
            com.ff.ws_client.Wsfastfood_Service service = new com.ff.ws_client.Wsfastfood_Service();
            com.ff.ws_client.Wsfastfood p = service.getWsfastfoodPort();
            return p;
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return null;
    }
}
