/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author jechague
 */
public class Main {
    
    public void main(String args[]) {
        Calculadora calculadora = new Calculadora();

        int resultadoSuma = calculadora.sumar(1, 1);
        int resultadoMultiplicacion = calculadora.multiplicar(2, 2);
        
        System.out.println(resultadoSuma);
        System.out.println(resultadoMultiplicacion);
    }        
}
