/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaarreglo;

import java.util.Scanner;

/**
 *
 * @author vicsa
 */
public class ProgramaArreglo {
   
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ModeloArreglo modelo = new ModeloArreglo();
        ControlArreglo control = new ControlArreglo();
        //ingresa los datos 
        for(int i=0;i<modelo.getArreglo().length;i++){
            System.err.println("Ingresa un dato: "+ i);
            int iDato = sca.nextInt();
            modelo.setArreglo(i, iDato);
        }
        //lee los datos 
        for (int a = 0; a < modelo.getArreglo().length; a++) {
            System.out.print("\t"+modelo.getArreglo()[a]);
        }
        System.out.println("");
        System.out.println("El primer registro es: "+ modelo.primerRegistro());
        System.out.println("El ultimo registro es: "+ modelo.ultimoRegistro());
        
        // TODO code application logic here
    }
    
}
