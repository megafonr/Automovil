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
public class ClaseAuto {
    String marca, modelo;
    int kilometraje;
            
    public ClaseAuto() {
    this.marca = "Nacional";
    this.modelo = "Standard";
    this.kilometraje = -1;
    }   
//  Para Segunda parte    
    public ClaseAuto(String Marca) {
        this();
        this.marca = Marca;
    }
    public ClaseAuto(String Marca, String Modelo) {
        this(Marca);
        this.modelo = Modelo;
    }
    public ClaseAuto(String Marca, String Modelo, int Kilometro) {
        this(Marca,Modelo);
        this.kilometraje = Kilometro;
    }

//  Fin Para Segunda Parte


    
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
//  Para Segunda Parte
    System.out.println( "La Marca es: " + marca );
    System.out.println( "El Modelo es: " + this.modelo );
    System.out.println( "El Kilometraje: " + kilometraje );
    
}
    
}
