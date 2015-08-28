
package com.ff.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBeanDetallePedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBeanDetallePedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iddetallepedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBeanDetallePedido", propOrder = {
    "iddetallepedido"
})
public class GetBeanDetallePedido {

    protected int iddetallepedido;

    /**
     * Gets the value of the iddetallepedido property.
     * 
     */
    public int getIddetallepedido() {
        return iddetallepedido;
    }

    /**
     * Sets the value of the iddetallepedido property.
     * 
     */
    public void setIddetallepedido(int value) {
        this.iddetallepedido = value;
    }

}
