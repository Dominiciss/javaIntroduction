/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdGuide;

import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class ExtraExcercises {

    static void excercise1() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write some time in minutes");
        int minutes = read.nextInt();
        int hours = 0;
        int days = 0;

        while (minutes > 60) {
            minutes -= 60;
            hours += 1;
        }
        while (hours > 24) {
            hours -= 24;
            days += 1;
        }
        System.out.println("Your time converted to DD/HH/MM is: " + days + ":" + hours + ":" + minutes);
    }

    static void excercise2() {
        System.out.println("Before mix");
        int A = (int) (Math.random() * 10);
        System.out.println("The value of A is: " + A);
        int B = (int) (Math.random() * 10);
        int aux = B;
        System.out.println("The value of B is: " + B);
        int C = (int) (Math.random() * 10);
        System.out.println("The value of C is: " + C);
        int D = (int) (Math.random() * 10);
        System.out.println("The value of D is: " + D);

        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("After mix");
        System.out.println("The value of A is: " + A);
        System.out.println("The value of B is: " + B);
        System.out.println("The value of C is: " + C);
        System.out.println("The value of D is: " + D);
    }

    static void excercise3() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a letter");
        String vowel = read.next();

        if (vowel.equalsIgnoreCase("A") || vowel.equalsIgnoreCase("E") || vowel.equalsIgnoreCase("I") || vowel.equalsIgnoreCase("O") || vowel.equalsIgnoreCase("U")) {
            System.out.println("You wrote the vowel " + vowel.toUpperCase());
        } else {
            System.out.println("You didn't write a vowel");
        }
    }

    static void excercise4() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number between 1 and 10");
        int num = read.nextInt();
        String romanNumber = null;

        switch (num) {
            case 1:
                romanNumber = "I";
                break;
            case 2:
                romanNumber = "II";
                break;
            case 3:
                romanNumber = "III";
                break;
            case 4:
                romanNumber = "IV";
                break;
            case 5:
                romanNumber = "V";
                break;
            case 6:
                romanNumber = "VI";
                break;
            case 7:
                romanNumber = "VII";
                break;
            case 8:
                romanNumber = "IIX";
                break;
            case 9:
                romanNumber = "IX";
                break;
            case 10:
                romanNumber = "X";
                break;
        }
        System.out.println("Your roman number is " + romanNumber);
    }

    static void excercise5() {
        Scanner read = new Scanner(System.in);
        String associate;
        System.out.println("Write the type of health insurance you have (A, B, C)");
        do {
            associate = read.next().toUpperCase();

            if (!associate.equals("A") && !associate.equals("B") && !associate.equals("C")) {
                System.out.println("Invalid health insurance");
            }
        } while (!associate.equals("A") && !associate.equals("B") && !associate.equals("C"));

    }

    static void excercise6() {
        Scanner read = new Scanner(System.in);
        double height;
        double averageHeight = 0;
        double averageShrimp = 0;
        int j = 0;
        System.out.println("How many people are you going to measure?");
        int people = read.nextInt();

        for (int i = 0; i < people; i++) {
            System.out.print("Person " + (i + 1) + " Height(cm): ");
            height = read.nextDouble();
            averageHeight += height;
            if (height <= 160) {
                averageShrimp += height;
                j += 1;
            }
        }

        System.out.println("In average the group height is " + (Math.floor((averageHeight / people) * 10) / 10));
        System.out.println("only 160cm or less average is " + (Math.floor((averageShrimp / j) * 10) / 10));
    }

    static void excercise7() {
        Scanner read = new Scanner(System.in);
        double average = 0;
        double num;
        double max = 0;
        double min = 0;
        System.out.print("How many numbers do you wanna calculate? ");
        int numbers;
        do {
            numbers = read.nextInt();
            
            if (numbers > 0) {
                break;
            } else System.out.println("0 or negative numbers aren't allowed");
        } while (true);
        
        for (int i = 0; i < numbers; i++) {
            num = read.nextDouble();
            if (i == 0) {
                max = num;
                min = num;
            }
            
            max = Math.max(max, num);
            min = Math.min(min, num);
            average += num;
        }
        
        System.out.println("The max is " + max);
        System.out.println("The min is " + min);
        System.out.println("The average is " + (average / numbers));
    }

    static void excercise8() {
        Scanner read = new Scanner(System.in);
        int numbers;
        int even = 0;
        int odd = 0;
        
        do {
            System.out.println("Write numbers");
            numbers = read.nextInt();
            if (numbers % 10 != 5 && numbers % 10 != 0) {
                if (numbers % 2 == 0) {
                    even++;
                } else odd++;
            }
        } while (numbers % 10 != 5 && numbers % 10 != 0);
        System.out.println("There are " + even + " even numbers and " + odd + " odd numbers");
    }

    static void excercise9() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dividend");
        double dividend = read.nextDouble();
        System.out.println("Write the divider");
        double divider = read.nextDouble();
        int cnt = 0;
        
        for (double i = divider; i < dividend;) {
            dividend -= i;
            cnt++;
        }
        System.out.println("The rest is " + dividend + " and the quotient is " + cnt);
    }

    static void excercise10() {
        Scanner read = new Scanner(System.in);
        int number;
        int randomNumber = ((int) (Math.random() * 10)) * ((int) (Math.random() * 10));
        System.out.println("Well, try to guess");
        do {
            number = read.nextInt();
            if (number != randomNumber) {
                System.out.println("You didn't guess");
            } else System.out.println("You guessed right");
        } while (number != randomNumber);
    }

    static void excercise11() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number");
        int number = read.nextInt();
        int i;
        
        for (i = 1; true; i++) {
            number /= 10;
            if (number == 0) break;
        }
        System.out.println("Number of digits: " + i);
    }

    static void excercise12() {
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    String firstNumber = (i == 3) ? "E" : Integer.toString(i);
                    String secondNumber = (j == 3) ? "E" : Integer.toString(j);
                    String thirdNumber = (k == 3) ? "E" : Integer.toString(k);
                    System.out.println(firstNumber + "-" + secondNumber + "-" + thirdNumber);
                }
            }
        }
    }

    static void excercise13() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the stair length");
        int stairLength = read.nextInt();
        for (int i = 0; i < stairLength + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }

    static void excercise14() {
        Scanner read = new Scanner(System.in);
        int age;
        int averageAge = 0;
        int cnt = 0;
        System.out.println("Write the number of families");
        int families = read.nextInt();
        for (int family = 0; family < families; family++) {
            System.out.println("Write the number of children of family " + (family + 1));
            int children = read.nextInt();
            
            for (int child = 0; child < children; child++) {
                age = read.nextInt();
                averageAge += age;
                cnt++;
            }
        }
        System.out.println("The average age of children were " + (double) (averageAge / cnt));
    }
}
