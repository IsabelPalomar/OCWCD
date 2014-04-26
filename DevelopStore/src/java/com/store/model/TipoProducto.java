/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.model;

/**
 *
 * @author isabelpalomar
 */
public enum TipoProducto {
    
  PLAYERA("Playera"), BLUSA("Blusa"), PANTALON("Pantalon"), CAMISA("Camisa");
 
  private String tipo;

    private TipoProducto(String tipoProducto ){
        this.tipo = tipoProducto;
    }
    

    /**
     * Get the value of tipo
     *
     * @return the value of tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Set the value of tipo
     *
     * @param tipo new value of tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
