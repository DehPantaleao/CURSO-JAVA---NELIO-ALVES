package org.deborah;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 20;
        int code = 123456789;
        char gender = 'F';
        double price = 123.45;
        double measure = 123.456789;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", product1, price);
        System.out.printf("%s, which price is $%.2f%n", product2, price);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("Measure with three decimal places: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
    }
}
