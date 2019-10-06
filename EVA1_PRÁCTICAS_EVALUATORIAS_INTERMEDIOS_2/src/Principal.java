
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
        int aArreglo [] = new int [15];
        
        
        
        int iNum = 0;
        int Acum = 0;
        
        for (int i = 0; i < aArreglo.length; i++) {
            aArreglo[i] = (int)(Math.random() * 100) + 1;
        }
        imprimirArreglo(aArreglo);
        System.out.println("Ingrese un valor entero: ");
        iNum = input.nextInt();
        
        
        for (int i = 0; i < aArreglo.length; i++) {

            
            if (aArreglo[i] == iNum) {
                Acum = Acum +1;
                
                
                    
                
                for (int j = i; j < aArreglo.length - 1 ; j++) {
                    aArreglo[j] = aArreglo[j + 1];
                }
                    for (int k = aArreglo.length - Acum; k < aArreglo.length ; k++) {
                        aArreglo[k] = 0;
                    
                }
                
                
            }
        }
         
        
        imprimirArreglo(aArreglo);
    }
    
    private static void imprimirArreglo (int []args){
        
        for (int i = 0; i < args.length; i++) {
            System.out.print("[" + args[i] + "]");
        }
        System.out.println("");
    }
    
}
