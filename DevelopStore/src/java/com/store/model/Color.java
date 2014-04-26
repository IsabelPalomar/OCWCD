/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.model;

/**
 *
 * @author isabelpalomar
 */
public enum Color {
   
    CAFE("Cafe"),Azul("Azul"),AMARILLO("Amarillo"),MORADO("Morado");
        
    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    private Color(String Color){
        this.valor = Color;
    }
    
}
