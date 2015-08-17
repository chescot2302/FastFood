
package Clientff;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beanPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beanPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="modalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objSucursal" type="{http://ws.ff.com/}beanSucursal" minOccurs="0"/>
 *         &lt;element name="objUsuario" type="{http://ws.ff.com/}beanUsuario" minOccurs="0"/>
 *         &lt;element name="pago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vuelto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanPedido", propOrder = {
    "cliente",
    "direccion",
    "estado",
    "fecha",
    "id",
    "importe",
    "modalidad",
    "objSucursal",
    "objUsuario",
    "pago",
    "telefono",
    "vuelto"
})
public class BeanPedido {

    protected String cliente;
    protected String direccion;
    protected String estado;
    protected String fecha;
    protected int id;
    protected double importe;
    protected String modalidad;
    protected BeanSucursal objSucursal;
    protected BeanUsuario objUsuario;
    protected double pago;
    protected String telefono;
    protected double vuelto;

    /**
     * Gets the value of the cliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Sets the value of the cliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCliente(String value) {
        this.cliente = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
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
     * Gets the value of the importe property.
     * 
     */
    public double getImporte() {
        return importe;
    }

    /**
     * Sets the value of the importe property.
     * 
     */
    public void setImporte(double value) {
        this.importe = value;
    }

    /**
     * Gets the value of the modalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Gets the value of the objSucursal property.
     * 
     * @return
     *     possible object is
     *     {@link BeanSucursal }
     *     
     */
    public BeanSucursal getObjSucursal() {
        return objSucursal;
    }

    /**
     * Sets the value of the objSucursal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanSucursal }
     *     
     */
    public void setObjSucursal(BeanSucursal value) {
        this.objSucursal = value;
    }

    /**
     * Gets the value of the objUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link BeanUsuario }
     *     
     */
    public BeanUsuario getObjUsuario() {
        return objUsuario;
    }

    /**
     * Sets the value of the objUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeanUsuario }
     *     
     */
    public void setObjUsuario(BeanUsuario value) {
        this.objUsuario = value;
    }

    /**
     * Gets the value of the pago property.
     * 
     */
    public double getPago() {
        return pago;
    }

    /**
     * Sets the value of the pago property.
     * 
     */
    public void setPago(double value) {
        this.pago = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the vuelto property.
     * 
     */
    public double getVuelto() {
        return vuelto;
    }

    /**
     * Sets the value of the vuelto property.
     * 
     */
    public void setVuelto(double value) {
        this.vuelto = value;
    }

}
