/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.automovil;

/**
 *
 * @author Rolo
 */
public class ClaseAutoEncapsulado {

    private String marca, modelo;
    private int kilometraje;

public void setMarca(String Marca){
    if (Marca == "") {
    } else {
        this.marca=Marca;
    }
}
public String getMarca(){
    return marca;
}    
    
public void setModelo(String Modelo){
    if (Modelo == "") {
        } else {
        this.modelo = Modelo;
        }
}
public String getModelo(){
    return modelo;
}    

public void setKilometraje(int Kilometro){
    if ( Kilometro < 0 ) {
        } else {
        this.kilometraje = Kilometro;
        }
}
public int getKilometraje(){
    return kilometraje;
}    

public void estadoAuto(){
    String Estado;
 
    Estado="";
    if (kilometraje < 0) {
        Estado = "Debe asignar un Kilometraje";
    } else if (kilometraje == 0) {
        Estado = "Nuevo";
    } else if (kilometraje < 10000) {
        Estado = "Poco Usado";
    } else if (kilometraje < 100000) {
        Estado = "Usado";
    } else if (kilometraje >=100000) {
        Estado = "Bastante Usado";
    }
    System.out.println( "El auto esta: " + Estado );
    
}
    
}
