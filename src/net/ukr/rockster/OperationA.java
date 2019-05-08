package net.ukr.rockster;

import java.util.Scanner;

public class OperationA {
        static Scanner sc = new Scanner(System.in);

        public static   int getInt(){
            System.out.println("Введіть число:");
            int number1;
            if(sc.hasNextInt()){
                number1 = sc.nextInt();
            } else {
                System.out.println("Помилка");
                sc.next();
                number1 = getInt();
            }
            return number1;
        }

        public static   char getOperation(){
            System.out.println("Введіть операцію:");
            char operation;
            if(sc.hasNext()){
                operation = sc.next().charAt(0);
            } else {
                System.out.println("Помилка");
                sc.next();
                operation = getOperation();
            }
            return operation;
        }

        public static int calculation(int number1, int number2, char operation){
            int result;
            switch (operation){
                case '+':
                    result = number1+number2;
                    break;
                case '-':
                    result = number1-number2;
                    break;
                case '*':
                    result = number1*number2;
                    break;
                case '/':
                    result = number1/number2;
                    break;
                default:
                    System.out.println("Помилка");
                    result = calculation(number1, number2, getOperation());
            }
            return result;
        }
    }

