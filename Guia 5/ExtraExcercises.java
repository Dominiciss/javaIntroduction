/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifthGuide;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class ExtraExcercises {

    static void excercise1() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dimensions of the array");
        int n = read.nextInt();
        int add = 0;
        int[] array = new int[n];
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("Number " + (i + 1));
            array[i] = read.nextInt();
            add += array[i];
        }
        
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println("Adding all the numbers of the array gives " + add);
    }
    
    static void excercise2() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dimensions of the array");
        int n = read.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        
        for (int i = 0; i < array1.length; i++) {
            System.out.println("First array, number " + (i + 1));
            array1[i] = read.nextInt();
        }
        
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Second array, number " + (i + 1));
            array2[i] = read.nextInt();
            if (array1[i] != array2[i]) {
                System.out.println("Numbers weren't equal");
                return;
            } 
        }
        System.out.println("All numbers were equal between vectors");
    }
    
    static void excercise3() {
        int[] array = new int[5];
        fillArray(array);
        printArray(array);
    }
    static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
    }
    static void printArray(int[] array) {
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    
    static void excercise4() {
        Scanner read = new Scanner(System.in);
        double[][] grades = new double[10][5];
        int pass = 0;
        int fail = 0;
        
        for (int i = 0; i < grades.length; i++) {
            System.out.println("What's the grade of the " + (i + 1) + " student in the first exam (0/10)");
            grades[i][0] = read.nextInt();
            System.out.println("What's the grade of the " + (i + 1) + " student in the second exam (0/10)");
            grades[i][1] = read.nextInt();
            System.out.println("What's the grade of the " + (i + 1) + " student in the mid-year exam (0/10)");
            grades[i][2] = read.nextInt();
            System.out.println("What's the grade of the " + (i + 1) + " student in the final exam (0/10)");
            grades[i][3] = read.nextInt();
            
            grades[i][4] = (grades[i][0] *  0.10) + (grades[i][1] * 0.15) + (grades[i][2] * 0.25) + (grades[i][3] * 0.50);
        }
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i][4] >= 7) {
                System.out.println("Student " + (i + 1) + " pass");
                pass++;
            } else {
                System.out.println("Student " + (i + 1) + " fail");
                fail++;
            }
        }
        System.out.println(pass + " student(s) passed");
        System.out.println(fail + " student(s) failed");
    }
    
    static void excercise5() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the first dimension of the array");
        int n = read.nextInt();
        System.out.println("Write the second dimension of the array");
        int m = read.nextInt();
        int sum = 0;
        int[][] array = new int[n][m];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("The sum of all the numbers of the array gives " + sum);
    }
    
    static void excercise6() {
        Scanner read = new Scanner(System.in);
        String[] words = new String[5];
        String[][] soup = new String[20][20];
        int[] indexs = new int[5];
        
        for (int i = 0; i < words.length; i++) {
            System.out.println("Add words to the word search with a length from 3 to 5 (" + (i + 1) + "/5)");
            do {
                words[i] = read.next();
            } while (words[i].length() < 3 || words[i].length() > 5);
        }
        
        fillSoup(soup);
        
        do {
            indexs[0] = (int) (Math.random() * 20);
            indexs[1] = (int) (Math.random() * 20);
            indexs[2] = (int) (Math.random() * 20);
            indexs[3] = (int) (Math.random() * 20);
            indexs[4] = (int) (Math.random() * 20);
        } while (indexs[0] == indexs[1] || indexs[0] == indexs[2] || indexs[0] == indexs[3] || indexs[0] == indexs[4] || indexs[1] == indexs[2] || indexs[1] == indexs[3] || indexs[1] == indexs[4] || indexs[2] == indexs[3] || indexs[2] == indexs[4] || indexs[3] == indexs[4] || indexs[0] == 20 || indexs[1] == 20 || indexs[2] == 20 || indexs[3] == 20 || indexs[4] == 20);
        
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                soup[indexs[i]][j] = words[i].substring(j, j + 1);
            }
        }
        
        System.out.println("Here's your word search");
        printSoup(soup);
    }
    static void fillSoup(String[][] soup) {
        for (int i = 0; i < soup.length; i++) {
            for (int j = 0; j < soup[i].length; j++) {
                soup[i][j] = Integer.toString((int) (Math.random() * 10));
            }
        }
    }
    static void printSoup(String[][] soup) {
        for (String[] i : soup) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    static void excercise7() {
        Scanner read = new Scanner(System.in);
        System.out.println("How many fibonacci sequences do you want to do?");
        int n = read.nextInt();
        int[] array = new int[n];
        int fibonacci;
        int aux1 = 0;
        int aux2 = 1;
        
        for (int i = 0; i < n; i++) {
            array[i] = aux2;
            fibonacci = aux2;
            aux2 = aux2 + aux1;
            aux1 = fibonacci;
        }
        System.out.println("Fibonacci sequence of " + n + " number(s)");
        System.out.println(Arrays.toString(array));
    }
}
