package pilas;
import java.util.Scanner;

/**
 *
 * @author ESCOBAR
 */
public class PILAS {
    public static void main(String[] args) {
        Scanner PILAS = new Scanner(System.in);
        int cont=0,    opcion=0,   LONG;
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
            switch (opcion = PILAS.nextInt()) {
                case 1:
                    if(cont == PILAa.length){
                        System.out.println("LA PILA ESTA LLENA....");
                    }else{
                        for(int i=cont;i<PILAa.length;i++){
                            PILAa[cont]=(int)(Math.random()*(100-1)+(1));
                            PILAb[cont]=(int)(Math.random()*(200-100)+(100));
                            cont++;
                        }
                    }
                break;
                case 2:
                    if(cont >0){
                        for (int i= cont-1; i>=0;i--){
                            System.out.println(PILAa[i] + " " + PILAb[i]);
                        }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }
                break;
                case 3:
                    if(cont > 0){ 
                            int i=0;
                                while(i<=LONG-1){
                                    cont--;
                                    i++;
                                }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }
                break;
                case 4:
                    if(cont > 0){
                        int j=0,i=cont-1;
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
                if(cont >0){
                    int i=cont-1;
                    while(i>=0){
                        System.out.println(PILAc[i]);
                        i--;
                    }
                    }else{
                        System.out.println("LA PILA ESTA VACIA....");
                    }            
                break;
                
         }
        }while(opcion != 6);       
    }
}
    

    
