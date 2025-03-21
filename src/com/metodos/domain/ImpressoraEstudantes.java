package com.metodos.domain;

public class ImpressoraEstudantes {
    public void imprimirEstudantes(Estudante estudante) {
        System.out.println("------------------");
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);

    }
}
