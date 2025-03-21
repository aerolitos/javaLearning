package com.metodos.domain;

public class ImprimirDadosTrabalhador {
    public void imprimirDados (Trabalhador trabalhador){
        System.out.println("-----------------------");

        System.out.println("Nome: " + trabalhador.nome);
        System.out.println("Idade: " + trabalhador.idade);
        System.out.println("Sexo: " + trabalhador.sexo);
        System.out.println("Salario: " + trabalhador.salarios);

        for (double salario : trabalhador.salarios){
            System.out.println("Salario: " + salario);
        }
    }
}
