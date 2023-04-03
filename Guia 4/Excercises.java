/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fourthGuide;

import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class Excercises {
    static void excercise1() {
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
                    System.out.println(addition(num1 + num2));
                    continue;
                case 2:
                    System.out.println(substract(num1 - num2));
                    continue;
                case 3:
                    System.out.println(multiply(num1 * num2));
                    continue;
                case 4:
                    System.out.println(divition(num1 / num2));
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
    static String addition(double add) {
        return "The result is " + add;
    }
    static String substract(double sub) {
        return "The result is " + sub;
    }
    static String multiply(double mltpy) {
        return "The result is " + mltpy;
    }
    static String divition(double dvdn) {
        return "The result is " + dvdn;
    }
    
    public static void excercise2() {
        Scanner read = new Scanner(System.in);
        System.out.println("How many people you want to interview?");
        int interviewedPeople = read.nextInt();
        
        for (int i = 0; i < interviewedPeople; i++) {
            System.out.println("Person number " + (i + 1) + " to get interviewed.");
            interviewerSystem();
            if (i != interviewedPeople - 1) {
                System.out.println("Do you want to continue (S/N)");
                String exit = read.next();
                if (exit.equalsIgnoreCase("N")) i = interviewedPeople;
            }
        }
    }
    public static void interviewerSystem() {
        Scanner read = new Scanner(System.in);
        System.out.print("Write your full name: ");
        String name = read.nextLine();
        System.out.print("Write your age: ");
        int age = read.nextInt();
        String minor = (age < 18) ? "under age" : "legal age";
        System.out.println(name + ".You are " + minor + ", you're " + age + " years old");
    }
    
    public static void excercise3() {
        Scanner read = new Scanner(System.in);
        System.out.println("How many euros do you have?");
        double euros = read.nextDouble();
        System.out.println("Which currency do you want to get?");
        String currency;
        do {
            System.out.println("(dollar/yen/pound)");
            currency = read.next();
        } while (!currency.equalsIgnoreCase("dollar") && !currency.equalsIgnoreCase("yen") && !currency.equalsIgnoreCase("pound"));
        
        convertCurrencies(euros, currency);
    }
    static void convertCurrencies(double euros, String currency) {
        double exchange = 0;
        switch (currency.toLowerCase()) {
            case "dollar": exchange = euros * 1.28611; break;
            case "yen": exchange = euros * 129.852; break;
            case "pound": exchange = euros * 0.86; break;
        }
        System.out.println("Your " + euros + " euros are worth " + Math.floor(exchange) + " " + currency.toLowerCase());
    }
    
    public static void excercise4() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number to look if it's prime");
        double prime = read.nextDouble();
        
        if (isPrime(prime)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number isn't prime");
        }
        
    }
    static boolean isPrime(double prime) {
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
        
    }
}