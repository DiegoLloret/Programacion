/** 

*  

*/ 

package UT3; 

  

import java.util.Scanner; 

  

/** 

* @author Fabiadmin 

* 

*/ 

public class camposfutbol { 

  

    /** 

     * @param args 

     */ 

    public static void main(String[] args) { 

        // TODO Auto-generated method stub 

        Scanner ent = new Scanner(System.in); 

        int minimo = 4050; 

        int maximo = 10800; 

        int metros = 1; 

  

        while (metros != 0) { 

            System.out.println("introduce numero de metros cuadrados o 0 para salir : "); 

            metros = ent.nextInt(); 

            if (metros != 0) { 

                System.out.println("introduce numero de campos de futbol: "); 

                int campos = ent.nextInt(); 

                double peque = (double) metros / minimo; 

                double grande = (double) metros / maximo; 

                // System.out.println("grande: "+grande+" peque: "+peque); 

                if (campos > peque) { 

                    System.out.println("No "); 

  

                } else if (campos < grande) { 

                    System.out.println("No "); 

                } else { 

                    System.out.println("si "); 

                } 

            }//fin if metros!=0 

        }//fin while 
        

    } 

} 