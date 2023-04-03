/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondGuide;

import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class Excercises {
    static void excercise1() {
        Scanner read = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Choose a number to add");
        num1 = read.nextInt();
        System.out.println("Choose another number to add");
        num2 = read.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
}
    
    static void excercise2() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write your name");
        String nombre = read.next();
        
        System.out.println("Your name is " + nombre);
}
    
    static void excercise3() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a phrase:");
        String nombre = read.nextLine();
        
        System.out.println("Your phrase in upper case is " + nombre.toUpperCase());
        System.out.println("Your phrase in lower case is " + nombre.toLowerCase());
}
    
    static void excercise4() {
        //  F = 32 + (9 * C / 5)
        Scanner read = new Scanner(System.in);
        System.out.println("Write the temperature in celcius");
        double grados = read.nextDouble();
        double fahrenheit = 32 + (9 * grados / 5);
        System.out.println("The temperature in fahrenheit is " + fahrenheit);
    }
    
    static void excercise5() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write a number");
        double num = read.nextDouble();
        System.out.println("The double of your number is " + (int) num * 2);
        System.out.println("The triple of your number is " + (int) num * 3);
        System.out.println("The square root of your number is " + Math.sqrt(num));
    }
}
