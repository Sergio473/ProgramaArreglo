/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaarreglo;

/**
 *
 * @author vicsa
 */
public class ModeloArreglo {
    //set = ingresar
    //get = escupir o leer 
    int Principio;
    
    public int getPrincipio(){
        return Principio;
    }
    public void setPrincipio(int n){
        this.Principio = n;
    }
    
    int[] Arreglo = new int[10];  
    
    public void setArreglo(int posicion, int valor){
        this.Arreglo[posicion] = valor;
    }
    public int[] getArreglo(){
        return Arreglo;
    }
    public int primerRegistro(){
        return getArreglo()[0];// para el primer registro
    }
    public int ultimoRegistro(){
        return getArreglo()[getArreglo().length-1]; //para ultimo registro
}
}
