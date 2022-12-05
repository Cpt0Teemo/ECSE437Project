package com.ecse437project;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    final static ArrayList<String> valid = new ArrayList<String>() {
        {
            add("add");
            add("sub");
            add("multi");
            add("div");
            add("pow");
            add("exit");
        }
    };

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

    static int calculate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease input a valid operator (add,sub, multi, pow, div, exit).");
        String op = scanner.nextLine();
        while(!valid.contains(op)) {
            System.err.println("Please enter a valid operator.");
            op = scanner.nextLine();
        }

        if (op.equals("exit")) {
            scanner.close();
            System.exit(0);
        }

        System.out.println("Please input the first operand.");
        int x = scanner.nextInt();

        System.out.println("Please input the second operand.");
        int y = scanner.nextInt();

        return operation(op,x,y);
    }
    public static void main(String[] args) {
        while(true) {
            try {
                System.out.println("\nThe result is " + calculate());
            } catch (Exception exception){
                if(exception.getMessage() == null){
                    System.err.println("Please input a valid integer");
                }
                else {
                    System.err.println(exception.getMessage());
                }
            }
        }
    }
}