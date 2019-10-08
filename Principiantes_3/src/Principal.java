
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
        Scanner sCaner = new Scanner(System.in);
        int iAcum =0;
    int [] aArreglo = new int[10];
    int [] aArreglo2= new int[10];
        for (int i = 0; i < aArreglo.length; i++) {
        System.out.println("Dame en nuemro del espacio " + (i+1) + " del arreglo");
        aArreglo[i] = sCaner.nextInt();
        sCaner.nextLine();
        }
            for (int i = 0; i < aArreglo2.length; i++) {
            System.out.println("Dame en nuemro del espacio " + (i+1) + " del arreglo 2");
            aArreglo2[i] = sCaner.nextInt();
            sCaner.nextLine(); 
            }
            System.out.print("Arreglo 1:[");
                for (int j = 0; j < aArreglo.length; j++) {
                    System.out.print(+aArreglo[j]+ ",");
                }
                System.out.println("]");
                    System.out.print("Arreglo 2:[");
                    for (int q = 0; q < aArreglo2.length; q++) {
                    System.out.print(aArreglo2[q]+ ",");
                    }
                    System.out.println("]");
        for (int i = 0; i < aArreglo.length; i++) {
            for (int j = 0; j <aArreglo2.length; j++) {
             if (aArreglo[i] != aArreglo2[j])  {
             iAcum = iAcum +1;
             
             }    
             
            }
        }
            if (iAcum==10){
                System.out.println("Son similares");
            } else {
                System.out.println("No son similares");
            }
    }
    
}
