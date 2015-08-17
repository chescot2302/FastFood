/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.entity;

/**
 *
 * @author Administrador
 */
public class BeanPedido {
    private int id;
    private String cliente;
    private String direccion;
    private String telefono;
    private String fecha;
    private double importe;
    private double pago;
    private double vuelto;
    private String estado;
    private String modalidad;
    private BeanSucursal objSucursal;
    private BeanUsuario objUsuario;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public BeanSucursal getObjSucursal() {
        return objSucursal;
    }

    public void setObjSucursal(BeanSucursal objSucursal) {
        this.objSucursal = objSucursal;
    }

    public BeanUsuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(BeanUsuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getVuelto() {
        return vuelto;
    }

    public void setVuelto(double vuelto) {
        this.vuelto = vuelto;
    }
    
    
}
