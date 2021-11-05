package com.dz9;

import java.util.Arrays;

/**
 * @author Volodia Sachenko
 * @since 04.11.21
 */

public class Task1 {
    public static void main(String[] args) {
        byte[] array = new byte[20];
        byte[] randomArray = random(array);
        System.out.print("Масив з випадкових чисел: \n" + Arrays.toString(randomArray));
        minimalValue(randomArray);
        maximumValue(randomArray);
    }

    private static byte[] random(byte[] array) { // Генерація випадкових чисел масиву
        for (int i = 0; i < array.length; i++) {
            array[i] = (byte) (-11 + (Math.random() * 22));
        }
        return array;
    }

    private static void minimalValue(byte[] array) {
        byte min = array[0];
        byte count = 0;
        for (int i = 1; i < array.length; i++) { // Пошук мінімальних чисел масиву
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (byte b : array) { // Пошук повторів
            if (b == min) {
                count++;
            }
        }

        System.out.println("\n\nМінімальне значення масиву: " + min);
        System.out.println("Кількість елементів з мінімальним значенням: " + count);

        byte[] result = new byte[count];
        Arrays.fill(result, min);

        System.out.println(Arrays.toString(result));
    }

    private static void maximumValue(byte[] array) {
        byte max = array[0];
        byte count = 0;
        for (int i = 1; i < array.length; i++) { // Пошук максимальних чисел масиву
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (byte b : array) { // Пошук повторів
            if (b == max) {
                count++;
            }
        }

        System.out.println("\nМаксимальне значення масиву: " + max);
        System.out.println("Кількість елементів з максимальним значенням: " + count);

        byte[] result = new byte[count];
        Arrays.fill(result, max);

        System.out.println(Arrays.toString(result));
    }
}
