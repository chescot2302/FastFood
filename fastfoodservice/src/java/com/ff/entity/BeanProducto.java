/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.entity;

/**
 *
 * @author Administrador
 */
public class BeanProducto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad=0;

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
