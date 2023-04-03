/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fifthGuide;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Manuel Dominich
 */
public class Excercises {
    static void excercise1() {
        int[] countdown = new int[100];
        
        for (int i = 99; i >= 0; i--) {
            countdown[i] = i + 1;
            System.out.println("[" + countdown[i] + "]");
        }
    }
    
    public static void excercise2() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dimensions of the array");
        int n = read.nextInt();
        int[] randomNumbers = new int[n];
        boolean check = false;
        
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 10);
        }
        
        int guess = read.nextInt();
        
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] == guess) {
                System.out.println("The guessed number was found in index " + i);
                check = true;
            }
        }
        if (check == false) {
            System.out.println("The number guessed wasn't found in the array");
        }
    }
    
    public static void excercise3() {
        Scanner read = new Scanner(System.in);
        System.out.println("Write the dimensions of the array");
        int n = read.nextInt();
        int[] numbers = new int[n];
        int[] numLength = new int[5];
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1));
            numbers[i] = read.nextInt();
            numLength[Integer.toString(numbers[i]).length() - 1]++;
        }
        
        int i = 0;
        for (int num : numLength) {
            if (num > 0) {
                System.out.println("Number of numbers with " + (i + 1) + " digit(s): " + num);
            }
            i++;
        }
    }
    
    public static void excercise4() {
        int[][] array = new int[4][4];
        int[][] trsArray = new int[4][4];
        
        System.out.println("Normal array");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                trsArray[j][i] = array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("Transposed array");
        for (int[] i : trsArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    public static void excercise5() {
        Scanner read = new Scanner(System.in);
        int[][] array = new int[3][3];
        int[][] trsArray = new int[3][3];
        boolean check = false;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Write the number on the index [" + (i + 1) + " : " + (j + 1) + "]");
                array[i][j] = read.nextInt();
                trsArray[j][i] = array[i][j];
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (trsArray[i][j] != array[i][j] * -1) {
                    check = true;
                }
            }
        }
        
        System.out.println("Normal array");
        writeArray(array);
        System.out.println("Transposed array");
        writeArray(trsArray);
        
        if (check == false) {
            System.out.println("Array is assimetrical");
        } else {
            System.out.println("Array isn't assimetrical");
        }
    }
    static void writeArray(int[][] array) {
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    
    public static void excercise6() {
        Scanner read = new Scanner(System.in);
        int[][] array = new int[3][3];
        int[][] sum = new int[2][3];
        int[] diags = new int[2];
        boolean check = true;
        diags[0] = 0;
        diags[1] = 0;
        
        for (int i = 0; i < array.length; i++) {
            sum[0][i] = 0;
            sum[1][i] = 0;
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Write a number for the index [" + i + " : " + j + "]");
                array[i][j] = read.nextInt();
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            diags[0] += array[i][i];
            diags[1] += array[i][2 - i];
            for (int j = 0; j < array[i].length; j++) {
                sum[0][i] += array[i][j];
                sum[1][i] += array[j][i];
            }
        }
        
        int aux = sum[0][0];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < sum[i].length; j++) {
                if (aux != sum[i][j]) {
                    check = false;
                }
            }
        }
        if (aux != diags[0]) check = false;
        if (aux != diags[1]) check = false;
        
        if (check) {
            System.out.println("The array is magical");
        } else {
            System.out.println("The array isn't magical");
        }
        
        System.out.println("Array:");
        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Horizontal additions");
        System.out.println(Arrays.toString(sum[0]));
        System.out.println("Vertical additions");
        System.out.println(Arrays.toString(sum[1]));
        System.out.println("Diagonal additions");
        System.out.println(Arrays.toString(diags));
    }
}