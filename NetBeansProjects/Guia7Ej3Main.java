/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6ej1;

import entidad.Operacion;

/**
 *
 * @author Migue
 */
public class P6ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
        A continuación, se deben crear los siguientes métodos:
        Método constructor con todos los atributos pasados por parámetro.
        Método constructor sin los atributos pasados por parámetro.
        Métodos get y set.
        Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
        Método sumar(): calcular la suma de los números y devolver el resultado al main.
        Método restar(): calcular la resta de los números y devolver el resultado al main
        Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
            el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
        Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
            el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el 
            resultado al main.*/
        
        Operacion n1 = new Operacion();
        
        
        n1.crearOperacion();
        System.out.println(n1.sumar());
        System.out.println(n1.restar());
        n1.multiplicar();
        System.out.println(n1.multi2());
        n1.dividir();
        
    }
    
}
