package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Input first integer number: ");
        a = scan.nextInt();
        System.out.println("Input second integer number: ");
        b = scan.nextInt();

        int addNumbers = addNumbers(a, b);
        int subtractNumbers = subtractNumbers(a, b);
        int multiplyNumbers = multiplyNumbers(a, b);
        double divideNumbers = divideNumbers(a, b);

        System.out.println("adding: " + addNumbers);
        System.out.println("subtracting: " + subtractNumbers);
        System.out.println("multiplying: " + multiplyNumbers);
        System.out.println("dividing: " + divideNumbers);
    }

    public static int addNumbers(int a, int b){
        return a + b;
    }
    public static int subtractNumbers(int a, int b){
        return a - b;
    }
    static int multiplyNumbers(int a, int b){
        return a * b;
    }
    static double divideNumbers(int a, int b){
        return (a * 1.0) / (b * 1.0); //Fixing the problem
    }
}
