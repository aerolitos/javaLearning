package com.curso.aulas;

public class Aula03OperadoresJava  {
    public static void main(String[] args) {
        // <> , <= , >=, == , != sempre vão retornar valores booleanos

        // em variáveis booleanas o padrão é ''is'' antes do nome da váriavel
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualaVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("IsDezDiferenteVinte " + isDezDiferenteVinte);
        System.out.println("isDezMaiorQueVinte? " + isDezMaiorQueVinte);
        System.out.println("isMenorQueVinte? " + isDezMenorQueVinte);
        System.out.println("isDezIgualDez? " + isDezIgualDez);
        System.out.println("isDezIgualaVinte? " + isDezIgualaVinte);
    }
}
