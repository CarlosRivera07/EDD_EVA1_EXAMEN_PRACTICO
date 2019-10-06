
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int aArreglo [] = new int [15];
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = 0;
        }
        
        imprimirArreglos(aArreglo);
        
        
        
        for (int i = aArreglo.length - 1; i >= 0 ; i--) {
            
             System.out.println("Igrese el valor número " + (i + 1) + ":");
            aArreglo[i] = input.nextInt();
            imprimirArreglos(aArreglo);
            
        }
         
           
        
        
       
        
    }
    private static void imprimirArreglos (int []args){
        System.out.println(" ");
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        }
        System.out.println(" ");
        
    }
    
}
