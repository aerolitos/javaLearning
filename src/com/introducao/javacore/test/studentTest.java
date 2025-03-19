package com.introducao.javacore.test;

import com.introducao.javacore.domain.student;

public class studentTest {
    public static void main(String[] args) {
        /* A linha 10, é uma variável de referência, ela chama o objeto ''student'' que está no pacote domain
           todo objeto precisa conter o ''new'' para ser criado/iniciado.
         */
       student student = new student();
       student.nome = "Luffy"; // assim como as linhas abaixo, o ''.'' após o nome do objeto, serve para você chamar os atributos
       student.idade = 18;     // basicamente estou definindo valores
       student.sexo = 'M';

        System.out.println(student.nome); //serve para imprimir um atributo da classe.

    }
}
