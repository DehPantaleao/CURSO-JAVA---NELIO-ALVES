package org.exercicios;

import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
public class Exercicio2 {

    public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            double raio, area, pi = 3.14159;

            System.out.println("Digite o valor do raio: ");
            raio = leia.nextDouble();
            area = pi * (raio * raio);
            System.out.printf("A área do círculo é: %.4f%n", area);

            leia.close();
    }
}
