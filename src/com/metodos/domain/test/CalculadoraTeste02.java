package com.metodos.domain.test;

import com.metodos.domain.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(10,20); // Quando você utiliza um parametro, você precisa atribuir a uma nova variavel com o mesmo tipo
        System.out.println(result);
    }
}
