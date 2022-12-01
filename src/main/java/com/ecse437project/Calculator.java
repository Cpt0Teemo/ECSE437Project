package com.ecse437project;

import java.lang.invoke.MutableCallSite;
import java.util.Scanner;

public class Calculator {
    static int operation(String op,int x, int y){
        switch (op){
            case "add":
                return Addition.apply(x,y);

            case "sub":
                return Substraction.apply(x,y);

            case "multi":
                return Multiplication.apply(x,y);

            case "div":
                return Division.apply(x,y);

            case "pow":
                return Exponent.apply(x,y);

            default:
                throw new IllegalArgumentException("Please enter a valid operator.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a valid operator (add, sub, multi, div, pow)");
        String op = scanner.nextLine();
        System.out.println("Please input the first operand.");
        int x = scanner.nextInt();
        System.out.println("Please input the second operand.");
        int y = scanner.nextInt();

        System.out.println("\nThe result is "+operation(op,x,y));
    }
}