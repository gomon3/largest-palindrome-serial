/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestpalindrome;

import java.util.Scanner;

/**
 *
 * @author Vaio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Evalacuación Indigo");
        System.out.println("¿Cuántos casos de prueba deseas ejecutar?");
        
        
        System.out.print("T = ");
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        System.out.println("");
        
        while(t<1 || t>100){
            System.out.println("El rango de casos de prueba es de 1 <= T <= 100");
            
            System.out.print("T = ");
            scan = new Scanner(System.in);
            
            t = scan.nextInt();
            System.out.println("");
        }
        
        System.out.println("");
        
        Calculating c;
        
        for(int i = 0; i < t; i++){
            
            System.out.println("Ingresa el valor de N");
            System.out.print("N = ");
            scan = new Scanner(System.in);
            long n = scan.nextLong();
            
            System.out.println("");
            
            try{
                c = new Calculating(n);
                System.out.println("El número palíndromo más grande menor que " + n + " es " + c.getLargestPalindrome());
                System.out.println("");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
        
        
    }
    
}
