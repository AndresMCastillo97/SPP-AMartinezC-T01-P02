// Andrés de Jesús Martínez Castillo A014411447 IMT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.amartinec.t1.p2;
import java.util.Scanner;
/**
 *
 * @author andres
 */
public class SPPAMartineCT1P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de superficies y perímetros de rectángulos");
        Scanner teclado= new Scanner(System.in);
        
        double base, altu, sup, per;
        
        System.out.println("Ingrese la base");
        base= teclado.nextDouble();
        System.out.println("Ingrese la altura");
        altu= teclado.nextDouble();
        
        sup= base*altu;
        per= 2*(base+altu);
        
        System.out.println("Superficie="+sup+" Perímetro="+per);
     
    }
    
}
