/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Mayra, Daniel, Bruno, Rodrigo, Diego
 */
public class Calculadora implements ICalculadora {

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }


}
