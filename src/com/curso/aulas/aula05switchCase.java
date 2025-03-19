package com.curso.aulas;

public class aula05switchCase {
    public static void main(String[] args) {
        // Dados os valores de 1 à 7, imprima se é dia útil ou final de semana
        // considerando que, 1 é equivalente à Domingo.

        int day = 3;
        switch(day){
            case 1:
                System.out.println("hoje é domingo portanto, não é um dia útil.");
                break;
            case 2:
                System.out.println("Hoje é um dia útil, segunda-feira");
                break;
            case 3:
                System.out.println("Hoje é um dia útil, terça-feira");
                break;
            case 4:
                System.out.println("Hoje é um dia útil, quarta-feira");
                break;
            case 5:
                System.out.println("Hoje é um dia útil, quinta-feira");
                break;
            case 6:
                System.out.println("Hoje é um dia útil, sexta-feira");
                break;
            case 7:
                System.out.println("hoje é sábado portanto, não é um dia útil.");
                break;
            default:
                System.out.println("Opção inválida!");
                break;


        }
    }
}
