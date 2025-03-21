package com.metodos.domain.test;

import com.metodos.domain.Estudante;
import com.metodos.domain.ImpressoraEstudantes;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();


        estudante.nome = "Jorge";
        estudante.idade = 20;
        estudante.sexo = 'H';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'M';

        impressora.imprimirEstudantes(estudante);
        impressora.imprimirEstudantes(estudante2);
    }
}
