package com.introducao.javacore.test;

import com.introducao.javacore.domain.Carro;

public class carTest {
    public static void main(String[] args) {
        Carro Carro = new Carro(); // a variável de refêrencia precisa chamar o mesmo nome do objeto
        Carro Carro2 = new Carro();

        Carro.marca = "Wolks";
        Carro.ano = 2024;
        Carro.modelo = "Nivus";

        Carro2.marca = "Fiat";
        Carro2.ano = 2024;
        Carro2.modelo = "Fast-Back";

        System.out.println(Carro.marca);
    }
    }

