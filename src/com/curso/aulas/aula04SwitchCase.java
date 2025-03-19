package com.curso.aulas;

public class aula04SwitchCase {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando que o número 1 equivale á domingo

        int day = 5;
        // Estrutura do ''Switch'', é necessário um break, no final de cada caso, e a opção default normalmente fica no
        // final da estrutura, caso nenhuma das opções sejam válidas, o default é executado, lembrando que precisa de um break
        switch(day){
            case 1:
                System.out.println("Hoje é domingo");
                break;
            case 2:
                System.out.println("Hoje, infelizmente, é segunda-feira :(");
                break;
            case 3:
                System.out.println("Hoje ainda é terça-feira :(");
                break;
            case 4:
                System.out.println("Ta chegando em, hoje já é quarta-feira");
                break;
            case 5:
                System.out.println("Segura as pontas campeão, falta pouco!! hoje já é quinta-feira!!!");
                break;
            case 6:
                System.out.println("Finalmente né meu caro, o famigerado sextouuu!!!!");
                break;
            case 7:
                System.out.println("Hoje é sábado!!");
                break;
            default:
                System.out.println("Opção inválida!!");
                break;
        }

    }
}
