package org.deborah;

import java.util.Scanner;

public class EstruturaDeControle {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade = 20;

        System.out.println("Qual a sua idade?");
        idade = leia.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}

