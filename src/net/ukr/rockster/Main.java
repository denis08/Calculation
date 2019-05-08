package net.ukr.rockster;


import java.util.Scanner;

import static net.ukr.rockster.OperationA.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int number1 = getInt();
        char operation = getOperation();
        int number2 = getInt();
        int result = calculation(number1, number2, operation);
        System.out.println("Результат операции: " + result);
    }
}