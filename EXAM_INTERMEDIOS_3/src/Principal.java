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
        int[] arreglo = new int[15];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100+1);
        }
        System.out.println("Arreglo original:");
        imp(arreglo);
        
        
        int[] cont = new int[100];
        for (int i = 0; i < arreglo.length; i++) {
            cont[arreglo[i]-1] += 1;
        }
        System.out.println("Sirve para saber cuántas repeticiones hay de cada número:");
        imp(cont);
        
        int ac = 0;
        for (int i = 0; i < cont.length; i++) {
            if(!(cont[i] == 0))
                ac+=1;
        }
        int[][] mat = new int[ac][2];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < cont.length; j++) {
                if(cont[j] != 0){
                    mat[i][0] = j+1;
                    mat[i][1] = cont[j];
                    cont[j] = 0;
                    j = cont.length;
                }
            }
        }
        
        
        System.out.println("");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("["+mat[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public static void imp(int[] ar){
        for (int i = 0; i < ar.length; i++) {
            System.out.print("["+ar[i]+"]");
        }
        System.out.println("");
    }
}
