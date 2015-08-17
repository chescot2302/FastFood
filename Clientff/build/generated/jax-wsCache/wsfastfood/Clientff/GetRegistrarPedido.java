
package Clientff;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getRegistrarPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getRegistrarPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://ws.ff.com/}beanDetallePedido" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRegistrarPedido", propOrder = {
    "arg0"
})
public class GetRegistrarPedido {

    protected List<BeanDetallePedido> arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arg0 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArg0().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeanDetallePedido }
     * 
     * 
     */
    public List<BeanDetallePedido> getArg0() {
        if (arg0 == null) {
            arg0 = new ArrayList<BeanDetallePedido>();
        }
        return this.arg0;
    }

}
