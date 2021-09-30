package pilas;
import java.util.Scanner;

/**
 *
 * @author ESCOBAR
 */
public class PILAS {
    public static void main(String[] args) {
        Scanner PILAS = new Scanner(System.in);
        int CONT=0,    OP=0,   LONG;
        System.out.println("INGRESAR TAMAÑO DE LA PILA");
        LONG=PILAS.nextInt();
        int PILAa[] = new int[LONG];
        int PILAb[] = new int[LONG];
        int PILAc[] = new int[LONG];
        do{
            System.out.println("\nSELECCIONA LA OPCIÓN \n"
                    + "\n1. LLENAR PILAS\n"
                    + "2. MOSTRAR PILAS\n"
                    + "3. VACIAR PILAS\n"
                    + "4. UNIRFICACION DE PILAS B\n"
                    + "5. Mostrar pila \n"
                    + "6. Salida\n");
            switch (OP = PILAS.nextInt()) {
                case 1:
                    if(CONT == PILAa.length){
                        System.out.println("LA PILA ESTA LLENA....");
                    }else{
                        for(int i=CONT;i<PILAa.length;i++){
                            PILAa[CONT]=(int)(Math.random()*(100-1)+(1));
                            PILAb[CONT]=(int)(Math.random()*(200-100)+(100));
                            CONT++;
                        }
                    }
                break;
                case 2:
                    if(CONT >0){
                        for (int i= CONT-1; i>=0;i--){
                            System.out.println(PILAa[i] + " " + PILAb[i]);
                        }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }
                break;
                case 3:
                    if(CONT > 0){ 
                            int i=0;
                                while(i<=LONG-1){
                                    CONT--;
                                    i++;
                                }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }
                break;
                case 4:
                    if(CONT > 0){
                        int j=0,i=CONT-1;
                        while(i>=0){
                            PILAc[j]=PILAa[i]+PILAb[i];
                            j++;
                            i--;
                        }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }
                break;
                case 5:
                if(CONT >0){
                    int i=CONT-1;
                    while(i>=0){
                        System.out.println(PILAc[i]);
                        i--;
                    }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }            
                break;
                
         }
        }while(OP != 6);       
    }
}
    
