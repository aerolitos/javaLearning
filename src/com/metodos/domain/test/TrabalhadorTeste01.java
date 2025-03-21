package com.metodos.domain.test;

import com.metodos.domain.ImprimirDadosTrabalhador;
import com.metodos.domain.Trabalhador;

public class TrabalhadorTeste01 {
    public static void main(String[] args) {
        ImprimirDadosTrabalhador dados = new ImprimirDadosTrabalhador();
        Trabalhador trab = new Trabalhador();

        trab.nome = "João";
        trab.idade = 20;
        trab.sexo = 'M';
        trab.salarios = new double [] {1200, 1750, 2675};


        dados.imprimirDados(trab);

    }
}
