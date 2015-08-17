/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.entity;

/**
 *
 * @author Administrador
 */
public class BeanUsuario {
    private String codigo;
    private String nombre;
    private String alias;
    private String clave;
    private BeanSucursal objSucursal;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BeanSucursal getObjSucursal() {
        return objSucursal;
    }

    public void setObjSucursal(BeanSucursal objSucursal) {
        this.objSucursal = objSucursal;
    }
    
    
}
