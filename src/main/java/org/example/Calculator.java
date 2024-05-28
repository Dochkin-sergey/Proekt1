package org.example;

public class Calculator {

    public int summ(int a, int b){
    int result;
    result = a + b;
    System.out.printf("Cумма %d и %d равна %d", a, b, result);
    System.out.println();
    return result;
    }

    public int subtraction(int a, int b){
        int result;
        result = a - b;
        System.out.printf("Вычитание %d из %d равна %d", a, b, result);
        System.out.println();
        return result;
    }
}