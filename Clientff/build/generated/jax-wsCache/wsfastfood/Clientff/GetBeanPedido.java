
package Clientff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBeanPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBeanPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idpedido" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBeanPedido", propOrder = {
    "idpedido"
})
public class GetBeanPedido {

    protected int idpedido;

    /**
     * Gets the value of the idpedido property.
     * 
     */
    public int getIdpedido() {
        return idpedido;
    }

    /**
     * Sets the value of the idpedido property.
     * 
     */
    public void setIdpedido(int value) {
        this.idpedido = value;
    }

}
