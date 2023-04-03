/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdGuide;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class Excercises {

    static void excercise1() {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

    }

    static void excercise2() {
        Scanner read = new Scanner(System.in);
        String keyWord = read.next();

        if (keyWord.equals("eureka")) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }

    static void excercise3() {
        Scanner read = new Scanner(System.in);
        String word = read.next();

        if (word.length() == 8) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }

    static void excercise4() {
        Scanner read = new Scanner(System.in);
        String word = read.next();

        if (word.substring(0, 1).equals("A")) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }

    static void excercise5() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the limit of the addition");
        int limit = read.nextInt();
        int num;
        int aux;

        for (aux = 0; aux < limit;) {
            System.out.println("Write a number to add");
            num = read.nextInt();
            aux += num;
        }
        System.out.println("The sum of the numbers is " + aux);
    }

    static void excercise6() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the first number of the equation");
        int num1 = read.nextInt();
        System.out.println("Write the second number of the equation");
        int num2 = read.nextInt();
        String exit;
        int menu;

        while (true) {
            System.out.println("Choose an option");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");
            menu = read.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("The result is " + (num1 + num2));
                    continue;
                case 2:
                    System.out.println("The result is " + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("The result is " + (num1 * num2));
                    continue;
                case 4:
                    System.out.println("The result is " + (num1 / num2));
                    continue;
                case 5:
                    do {
                        System.out.println("Are you sure you want to exit? (S/N)");
                        exit = read.next();
                    } while (!exit.equals("S") && !exit.equals("N"));
                    if (exit.equals("S")) {
                        break;
                    } else {
                        continue;
                    }
            }
            break;
        }
    }

    static void excercise7() {
        Scanner read = new Scanner(System.in);
        String message;
        List<String> listGood = new ArrayList<>();
        List<String> listBad = new ArrayList<>();

        while (true) {
            System.out.println("Write a message");
            message = read.next();
            if (message.length() <= 5) {
                if (message.substring(0, 1).equals("X") && message.substring(message.length() - 1, message.length()).equals("O")) {
                    listGood.add(message);
                    continue;
                } else {
                    if (message.equals("&&&&&")) {
                        break;
                    }
                }
            }
            listBad.add(message);
        }
        System.out.println("List with good strings");
        System.out.println(listGood);
        System.out.println("List with bad strings");
        System.out.println(listBad);
    }
    
    static void excercise8() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dimensions of the box");
        int box = read.nextInt();
        
        for (int i = 0; i < box; i++) {
            for (int j = 0; j < box; j++) {
                if (i == 0 || i == box - 1 || j == 0 || j == box - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
