package com.mikeysoll;

public class PrimitiveOps {

    public static void main(String[] args) {

        int Z = 2;
        int O = 3;
        int V = 8;

        // 0) Арифметические операции над двумя примитивами типа int.
        System.out.println("Int operations:");
        System.out.println(Z + O); // 5
        System.out.println(V - Z); // 6
        System.out.println(O * V); // 24
        System.out.println(V / O); // 2 (целочисленное деление)

        // 1) Арифметические операции над над int и double в одном выражении.
        double D = 2.5;
        System.out.println("\nInt and double operations:");
        System.out.println(Z + D);      // 4.5
        System.out.println(V - D);      // 5.5
        System.out.println(O * D);      // 7.5
        System.out.println(V / D);      // 3.2

        // 2) Логических операций ( < , >, >=, <= ).
        System.out.println("\nLogical operations:");
        System.out.println(Z < O);      // true
        System.out.println(V > O);      // true
        System.out.println(Z >= 2);     // true
        System.out.println(O <= 1);     // false

        // 4) Переполнение при арифметической операции.
        System.out.println("\nOverflow example:");
        int maxInt = Integer.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE * 2;

        System.out.println("Max int: " + maxInt);
        System.out.println("Max int + 1: " + (maxInt + 1)); // переполнение
        System.out.println("Max double:" + maxDouble );
        System.out.println("Max double * 2:" + maxDouble * 2 );
    }
}
