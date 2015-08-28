
package com.ff.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getListarPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getListarPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codsucursal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getListarPedido", propOrder = {
    "codusuario",
    "codsucursal"
})
public class GetListarPedido {

    protected String codusuario;
    protected String codsucursal;

    /**
     * Gets the value of the codusuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodusuario() {
        return codusuario;
    }

    /**
     * Sets the value of the codusuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodusuario(String value) {
        this.codusuario = value;
    }

    /**
     * Gets the value of the codsucursal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodsucursal() {
        return codsucursal;
    }

    /**
     * Sets the value of the codsucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodsucursal(String value) {
        this.codsucursal = value;
    }

}
