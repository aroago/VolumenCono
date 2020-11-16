/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.volumencono;

import static java.lang.Math.PI;

/**
 *It contais the data of the cone to calculate it's the volume.
 * @author aroago
 */
public class cono {
    private float radio;
    private float height;
   
    public cono() {
    }
  
     public cono(float radio, float height) {
        this.radio = radio;
        this.height = height;
    }
     
    float calculateVolume(){
    return (float) ((PI*(radio*radio)*height)/3);
            }
    
    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
   
     
   
   
    
}
