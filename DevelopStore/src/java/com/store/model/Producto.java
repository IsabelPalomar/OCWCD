/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.model;

/**
 *
 * @author isabelpalomar
 */
public class Producto {

    private Color color;
    private Talla talla;
    private TipoProducto tipoProducto;
    private String descripcion;
    private Integer id;
    private double precio;
    
    // ctrl + shift + f
    public Producto(Color color, Talla talla, TipoProducto tipoProducto, String descripcion, Integer id, double precio) {
        this.color = color;
        this.talla = talla;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
        this.id = id;
        this.precio = precio;
    }

    public Producto() {
    }
    
    
    
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto TipoProducto) {
        this.tipoProducto = TipoProducto;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color Color) {
        this.color = Color;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla Talla) {
        this.talla = Talla;
    }
}
