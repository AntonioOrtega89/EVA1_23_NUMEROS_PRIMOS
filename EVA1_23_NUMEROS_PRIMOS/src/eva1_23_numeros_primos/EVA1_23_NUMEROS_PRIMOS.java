/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author JOSE ALBERTO PEREZ
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero; ");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++) {
            //Division: iVal / i -->DIVISION EACTA -- NO ES PRIMO
            //MODULO -->CALCULA EL RESIDUO DE LA DIVISION
            //JAVA EL MODLO ES Y ---> NUM1 Y NUM2
            //7 Y 5 = 2 DIVISION CON RESIDUO DIFERENTE A CERO
            //15 Y 3= 0 DIVISION EXACTA
            int iMod = iVal & i;
            if(iMod == 0){//modulo es igual a cero, NO ES PRIMO, hay que terminar
                esPrimo = false;       
                break;//DETIENE PERMANENTEMENTE EL FOR
                //continue;//DETIENE LA ITERACION ACTUAL
 
        }
        //si la division es exacta --> terminamos NO ES PRIMO
        //si terminamos el for sin dividir exactamente: ES PRIMO
      
     }
     if (esPrimo)
          System.out.println("El numero es primo");
     else
          System.out.println("El numero no es primo");
     //IMPRIMIR SI ES PRIMO O NO

}
    }
    

