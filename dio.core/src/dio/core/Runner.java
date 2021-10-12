package dio.core;

import dio.utils.operadores.Calculadora;

public class Runner {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.mult(10, 10));
    }
}
