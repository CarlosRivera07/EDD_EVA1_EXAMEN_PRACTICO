
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
        Scanner input = new Scanner (System.in);
        
        int aArreglo1 [] = new int [10];
        int aArreglo2 [] = new int [10];
        
        for (int i = 0; i < aArreglo1.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " del Arreglo 1:");
            aArreglo1[i] = input.nextInt();
        }
        
        for (int i = 0; i < aArreglo2.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + " del Arreglo 2:");
            aArreglo2[i] = input.nextInt();
        }
        
        imprimirArreglo(aArreglo1);
        imprimirArreglo(aArreglo2);
        int Acum =0;
        
        for (int i = 0; i < aArreglo1.length; i++) {
            //for (int j = 0; j < aArreglo2.length; j++) {
                if (aArreglo1[i] == aArreglo2[i]) {
                    Acum = Acum + 1;
                    System.out.println(Acum);
                }
            
        }
        if (Acum == 10) {
            System.out.println("Los arreglos son iguales.");
        }else{
            System.out.println("Los arreglos no son iguales.");
        }
                
        
            
        
    }
    public static void imprimirArreglo (int []args){
        System.out.println("");
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        }
        System.out.println(" ");
    }
    
}

