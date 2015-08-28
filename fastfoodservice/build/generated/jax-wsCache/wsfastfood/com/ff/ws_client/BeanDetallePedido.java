
package com.ff.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beanDetallePedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beanDetallePedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objPedido" type="{http://ws.ff.com/}beanPedido" minOccurs="0"/>
 *         &lt;element name="objProducto" type="{http://ws.ff.com/}beanProducto" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanDetallePedido", propOrder = {
    "cantidad",
    "id",
    "objPedido",
    "objProducto",
    "precio"
})
public class BeanDetallePedido {

    protected int cantidad;
    protected int id;
    protected BeanPedido objPedido;
    protected BeanProducto objProducto;
    protected double precio;

    /**
     * Gets the value of the cantidad property.
     * 
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     */
    public void setCantidad(int value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the objPedido property.
     * 
     * @return
     *     possible object is
     *     {@link BeanPedido }
     *     
     */
    public BeanPedido getObjPedido() {
        return objPedido;
    }

    /**
     * Sets the value of the objPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanPedido }
     *     
     */
    public void setObjPedido(BeanPedido value) {
        this.objPedido = value;
    }

    /**
     * Gets the value of the objProducto property.
     * 
     * @return
     *     possible object is
     *     {@link BeanProducto }
     *     
     */
    public BeanProducto getObjProducto() {
        return objProducto;
    }

    /**
     * Sets the value of the objProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanProducto }
     *     
     */
    public void setObjProducto(BeanProducto value) {
        this.objProducto = value;
    }

    /**
     * Gets the value of the precio property.
     * 
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Sets the value of the precio property.
     * 
     */
    public void setPrecio(double value) {
        this.precio = value;
    }

}
