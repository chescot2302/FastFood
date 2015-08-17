/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ff.entity;

/**
 *
 * @author Administrador
 */
public class BeanDetallePedido {
    private int id;
    private int cantidad;
    private double precio;
    private BeanProducto objProducto;
    private BeanPedido objPedido;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BeanPedido getObjPedido() {
        return objPedido;
    }

    public void setObjPedido(BeanPedido objPedido) {
        this.objPedido = objPedido;
    }

    public BeanProducto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(BeanProducto objProducto) {
        this.objProducto = objProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
