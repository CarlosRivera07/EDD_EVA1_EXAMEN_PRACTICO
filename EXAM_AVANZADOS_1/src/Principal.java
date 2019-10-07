
import java.util.Scanner;

/*
 * AVANZADOS - 1
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
        Scanner sc = new Scanner(System.in);
        int vidas = 4;
        char arPalabras[][] = new char[5][];
        arPalabras[0] = new char[9]; //Chihuahua
        arPalabras[1] = new char[9]; //Lagartija
        arPalabras[2] = new char[8]; //Poligono
        arPalabras[3] = new char[10]; //Revolucion
        arPalabras[4] = new char[8]; //Oculista
        boolean seguir = true;
        
        while(seguir){
            boolean p = false;
            int numPal = (int)(Math.random()*5+1);
            
            switch(numPal){
                case 1://Chihuahua - 0
                        while(!p){
                            impAr(arPalabras, 0);
                            String sab = saberRes();
                            if("si".equals(sab)){
                                System.out.print("Inserte la palabra:");
                                String r = sc.nextLine();
                                if("Chihuahua".equals(r) || "chihuahua".equals(r)){
                                    System.out.println("Felicidades, has ganado!");
                                    p = true;
                                }else{
                                    System.out.println("Palabra incorrecta, has perdido.");
                                    p = true;
                                }
                            }else{
                                boolean c=false, h=false, i=false, u=false, a=false;
                                while(vidas!=0 && !p){
                                    System.out.print("Inserte una letra:");
                                    char chih = sc.nextLine().charAt(0);
                                    switch (chih){
                                        case 'c':
                                            arPalabras[0][0] = chih;
                                            impAr(arPalabras, 0);
                                            c = true;
                                            break;
                                        case 'h':
                                            arPalabras[0][1] = chih;
                                            arPalabras[0][3] = chih;
                                            arPalabras[0][6] = chih;
                                            impAr(arPalabras, 0);
                                            h = true;
                                            break;
                                        case 'i':
                                            arPalabras[0][2] = chih;
                                            impAr(arPalabras, 0);
                                            i = true;
                                            break;
                                        case 'u':
                                            arPalabras[0][4] = chih;
                                            arPalabras[0][7] = chih;
                                            impAr(arPalabras, 0);
                                            u = true;
                                            break;
                                        case 'a':
                                            arPalabras[0][5] = chih;
                                            arPalabras[0][8] = chih;
                                            impAr(arPalabras, 0);
                                            a = true;
                                            break;
                                        default:
                                            vidas--;
                                            System.out.println("Esa letra no está. Vidas: "+vidas);
                                    }
                                    if(c && h && i && u && a){
                                        System.out.println("Felicidades, has ganado.");
                                        p = true;
                                    }else
                                        p = saberPalabra("chihuahua");
                                    if(vidas == 0){
                                        System.out.println("Has perdido.");
                                        p = true;
                                    }
                                }
                            }
                        }
                    break;
                case 2://Lagartija - 1

                    while(!p){
                        impAr(arPalabras, 1);
                        String sab = saberRes();
                        if("si".equals(sab)){
                            System.out.print("Inserte la palabra:");
                            String r = sc.nextLine();
                            if("Lagartija".equals(r) || "lagartija".equals(r)){
                                System.out.println("Felicidades, has ganado!");
                                p = true;
                            }else{
                                System.out.println("Palabra incorrecta, has perdido.");
                                p = true;
                            }
                        }else{
                            boolean l=false, a=false, g=false, r=false, t=false, i=false, j=false;
                            while(vidas!=0 && !p){
                                System.out.print("Inserte una letra:");
                                char lag = sc.nextLine().charAt(0);
                                switch (lag){
                                    case 'l':
                                        arPalabras[1][0] = lag;
                                        impAr(arPalabras, 1);
                                        l = true;
                                        break;
                                    case 'a':
                                        arPalabras[1][1] = lag;
                                        arPalabras[1][3] = lag;
                                        arPalabras[1][8] = lag;
                                        impAr(arPalabras, 1);
                                        a = true;
                                        break;
                                    case 'g':
                                        arPalabras[1][2] = lag;
                                        impAr(arPalabras, 1);
                                        g = true;
                                        break;
                                    case 'r':
                                        arPalabras[1][4] = lag;
                                        impAr(arPalabras, 1);
                                        r = true;
                                        break;
                                    case 't':
                                        arPalabras[1][5] = lag;
                                        impAr(arPalabras, 1);
                                        t = true;
                                        break;
                                    case 'i':
                                        arPalabras[1][6] = lag;
                                        impAr(arPalabras, 1);
                                        i = true;
                                        break;
                                    case 'j':
                                        arPalabras[1][7] = lag;
                                        impAr(arPalabras, 1);
                                        j = true;
                                        break;
                                    default:
                                        vidas--;
                                        System.out.println("Esa letra no está. Vidas: "+vidas);
                                }
                                if(l && a && g && r && t && i && j){
                                    System.out.println("Felicidades, has ganado.");
                                    p = true;
                                }else
                                    p = saberPalabra("lagartija");
                                if(vidas == 0){
                                    System.out.println("Has perdido.");
                                    p = true;
                                }
                            }
                        }
                    }

                    break;
                case 3://Poligono - 2 

                    while(!p){
                        impAr(arPalabras, 2);
                        String sab = saberRes();
                        if("si".equals(sab)){
                            System.out.print("Inserte la palabra:");
                            String r = sc.nextLine();
                            if("Poligono".equals(r) || "poligono".equals(r) || "Polígono".equals(r) || "polígono".equals(r)){
                                System.out.println("Felicidades, has ganado!");
                                p = true;
                            }else{
                                System.out.println("Palabra incorrecta, has perdido.");
                                p = true;
                            }
                        }else{
                            boolean po=false, o=false, l=false, i=false, g=false, n=false;
                            while(vidas!=0 && !p){
                                System.out.print("Inserte una letra:");
                                char pol = sc.nextLine().charAt(0);
                                switch (pol){
                                    case 'p':
                                        arPalabras[2][0] = pol;
                                        impAr(arPalabras, 2);
                                        po = true;
                                        break;
                                    case 'o':
                                        arPalabras[2][1] = pol;
                                        arPalabras[2][5] = pol;
                                        arPalabras[2][7] = pol;
                                        impAr(arPalabras, 2);
                                        o = true;
                                        break;
                                    case 'l':
                                        arPalabras[2][2] = pol;
                                        impAr(arPalabras, 2);
                                        l = true;
                                        break;
                                    case 'i':
                                        arPalabras[2][3] = pol;
                                        impAr(arPalabras, 2);
                                        i = true;
                                        break;
                                    case 'g':
                                        arPalabras[2][4] = pol;
                                        impAr(arPalabras, 2);
                                        g = true;
                                        break;
                                    case 'n':
                                        arPalabras[2][6] = pol;
                                        impAr(arPalabras, 2);
                                        n = true;
                                        break;
                                    default:
                                        vidas--;
                                        System.out.println("Esa letra no está. Vidas: "+vidas);
                                }
                                if(p && o && l && i && g && n){
                                    System.out.println("Felicidades, has ganado.");
                                    p = true;
                                }else
                                    p = saberPalabra("poligono");
                                if(vidas == 0){
                                    System.out.println("Has perdido.");
                                    p = true;
                                }
                            }
                        }
                    }

                    break;
                case 4://Revolucion - 3

                    while(!p){
                        impAr(arPalabras, 3);
                        String sab = saberRes();
                        if("si".equals(sab)){
                            System.out.print("Inserte la palabra:");
                            String r = sc.nextLine();
                            if("Revolucion".equals(r) || "revolucion".equals(r) || "revolución".equals(r) || "Revolución".equals(r)){
                                System.out.println("Felicidades, has ganado!");
                                p = true;
                            }else{
                                System.out.println("Palabra incorrecta, has perdido.");
                                p = true;
                            }
                        }else{
                            boolean r=false, e=false, v=false, o=false, l=false, u=false, c=false, i=false, n = false;
                            while(vidas!=0 && !p){
                                System.out.print("Inserte una letra:");
                                char rev = sc.nextLine().charAt(0);
                                switch (rev){
                                    case 'r':
                                        arPalabras[3][0] = rev;
                                        impAr(arPalabras, 3);
                                        r = true;
                                        break;
                                    case 'e':
                                        arPalabras[3][1] = rev; 
                                        impAr(arPalabras, 3);
                                        e= true;
                                        break;
                                    case 'v':
                                        arPalabras[3][2] = rev;
                                        impAr(arPalabras, 3);
                                        v = true;
                                        break;
                                    case 'o':
                                        arPalabras[3][3] = rev;
                                        arPalabras[3][8] = rev;
                                        impAr(arPalabras, 3);
                                        o = true;
                                        break;
                                    case 'l':
                                        arPalabras[3][4] = rev;
                                        impAr(arPalabras, 3);
                                        l = true;
                                        break;
                                    case 'u':
                                        arPalabras[3][5] = rev;
                                        impAr(arPalabras, 3);
                                        u = true;
                                        break;
                                    case 'c':
                                        arPalabras[3][6] = rev;
                                        impAr(arPalabras, 3);
                                        c = true;
                                        break;
                                    case 'i':
                                        arPalabras[3][7] = rev;
                                        impAr(arPalabras, 3);
                                        i = true;
                                        break;
                                    case 'n':
                                        arPalabras[3][9] = rev;
                                        impAr(arPalabras, 3);
                                        n = true;
                                        break;
                                    default:
                                        vidas--;
                                        System.out.println("Esa letra no está. Vidas: "+vidas);
                                }
                                if(r && e && v && o && l && u && c && i && n){
                                    System.out.println("Felicidades, has ganado.");
                                    p = true;
                                }else
                                    p = saberPalabra("revolucion");
                                if(vidas == 0){
                                    System.out.println("Has perdido.");
                                    p = true;
                                }
                            }
                        }
                    }

                    break;
                case 5://Oculista - 4
                    while(!p){
                        impAr(arPalabras, 4);
                        String sab = saberRes();
                        if("si".equals(sab)){
                            System.out.print("Inserte la palabra:");
                            String r = sc.nextLine();
                            if("Oculista".equals(r) || "oculista".equals(r)){
                                System.out.println("Felicidades, has ganado!");
                                p = true;
                            }else{
                                System.out.println("Palabra incorrecta, has perdido.");
                                p = true;
                            }
                        }else{
                            boolean o=false, c=false, u=false, l=false, i=false, s=false, t=false, a=false;
                            while(vidas!=0 && !p){
                                System.out.print("Inserte una letra:");
                                char ocu = sc.nextLine().charAt(0);
                                switch (ocu){
                                    case 'o':
                                        arPalabras[4][0] = ocu;
                                        impAr(arPalabras, 4);
                                        o = true;
                                        
                                        break;
                                    case 'c':
                                        arPalabras[4][1] = ocu;
                                        impAr(arPalabras, 4);
                                        c = true;
                                        
                                        break;
                                    case 'u':
                                        arPalabras[4][2] = ocu;
                                        impAr(arPalabras, 4);
                                        u = true;
                                        
                                        break;
                                    case 'l':
                                        arPalabras[4][3] = ocu;
                                        impAr(arPalabras, 4);
                                        l = true;
                                        
                                        break;
                                    case 'i':
                                        arPalabras[4][4] = ocu;
                                        impAr(arPalabras, 4);
                                        i = true;
                                        
                                        break;
                                    case 's':
                                        arPalabras[4][5] = ocu;
                                        impAr(arPalabras, 4);
                                        s = true;
                                        
                                        break;
                                    case 't':
                                        arPalabras[4][6] = ocu;
                                        impAr(arPalabras, 4);
                                        t= true;
                                        
                                        break;
                                    case 'a':
                                        arPalabras[4][7] = ocu;
                                        impAr(arPalabras, 4);
                                        a = true;
                                        
                                        break;
                                    default:
                                        vidas--;
                                        System.out.println("Esa letra no está. Vidas: "+vidas);
                                        impAr(arPalabras, 4);
                                }
                                if(o && c && u && l && i && s && t && a){
                                    System.out.println("Felicidades, has ganado.");
                                    p = true;
                                }else
                                    p = saberPalabra("oculista");
                                if(vidas == 0){
                                    System.out.println("Has perdido.");
                                    p = true;
                                }
                            }
                        }
                    }

                    break;
            }
            System.out.println("¿Desea volver a jugar?(Responda si o no)");
            String resp = sc.nextLine();
            if(!("si".equals(resp)))
                seguir = false;
        }
        
        
        
        
    } 
        
        
    
    public static void impAr(char a[][], int c){
        System.out.print((c+1)+"-> ");
        for (int i = 0; i < a[c].length; i++) {
                System.out.print("["+a[c][i]+"]");
        }
        System.out.println("");
    }
    
    public static String saberRes(){
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Conoce la palabra completa?(Conteste si o no)");
        String res = sc.nextLine();
        if("si".equals(res) || "Si".equals(res))
            return "si";
        else
            return "no";
    }
    
    public static boolean saberPalabra(String c){
        Scanner sc = new Scanner(System.in);
        String sionoO = saberRes();
        if("si".equals(sionoO)){
            System.out.print("Inserte la palabra en minusculas y sin tilde:");
            String r = sc.nextLine();
            if(c.equals(r)){
                System.out.println("Felicidades, has ganado!");
                return true;
            }else{
                System.out.println("Palabra incorrecta, has perdido.");
                return true;
            }
        }
        return false;
    }
    
    public static void reiniciarAr(char[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = ' ';
            }
        }
    }
}
