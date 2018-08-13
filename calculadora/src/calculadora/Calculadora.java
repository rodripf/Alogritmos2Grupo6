/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Mayra
 */
public class Calculadora implements ICalculadora {

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }

    @Override
    public int multiplicar(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
