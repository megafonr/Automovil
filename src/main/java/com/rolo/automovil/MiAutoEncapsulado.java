/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rolo.automovil;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Rolo
 */
public class MiAutoEncapsulado {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClaseAutoEncapsulado autito, autito2;
        autito = new ClaseAutoEncapsulado();
        autito2 = new ClaseAutoEncapsulado();
        autito.setMarca("Jeep");
        autito.setModelo("Cherokee");
        autito.setKilometraje(130000);

        autito2.setModelo("Grand Cherokee");
        
        System.out.println( "Marca del Auto: " + autito.getMarca());
        System.out.println( "Modelo  del Auto: " + autito.getModelo());
        System.out.println( "Kilometraje del Auto: " + autito.getKilometraje());
        autito.estadoAuto();
        System.out.println( "  ------- Autito2 ------------------ " );
        System.out.println( "Marca del Auto: " + autito2.getMarca());
        System.out.println( "Modelo  del Auto: " + autito2.getModelo());
        System.out.println( "Kilometraje del Auto: " + autito2.getKilometraje());
        autito2.estadoAuto();
        
    }
}
