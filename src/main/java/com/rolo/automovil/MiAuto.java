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
public class MiAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ClaseAuto miauto;
        ClaseAuto miauto2;           // para segunda parte

        miauto = new ClaseAuto();
        
        miauto2 = new ClaseAuto("Audi","Q6",22000);   // para segunda parte
        System.out.println(" Primera Parte --- constructor por defecto: " );    
        miauto.estadoAuto();

        System.out.println(" para KM0: " );    
        miauto.kilometraje=0;
        miauto.estadoAuto();

        System.out.println(" para KM 100: " );    
        miauto.kilometraje=100;
        miauto.estadoAuto();
        
        System.out.println(" para KM 10000: " );    
        miauto.kilometraje=10000;
        miauto.estadoAuto();
        
        System.out.println(" para KM 100000: " );    
        miauto.kilometraje=100000;
        miauto.estadoAuto();

// Para Segunda Parte
    System.out.println( " Segunda Parte ---------------------- " );
    miauto2.estadoAuto();
    }
}
