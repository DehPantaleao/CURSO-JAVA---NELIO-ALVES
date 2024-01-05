package org.exercicios;

import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa.
public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int a, b, soma;

        System.out.println("Digite o primeiro número: ");
        a = leia.nextInt();
        System.out.println("Digite o segundo número: ");
        b = leia.nextInt();
        soma = a + b;
        System.out.println("A soma dos números é: " + soma);
        soma = leia.nextInt();

        leia.close();
    }
}
