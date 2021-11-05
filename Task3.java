package com.dz9;

import java.util.Arrays;

/**
 * @author Volodia Sachenko
 * @since 04.11.21
 */

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3); // Копируем массив сам в себя начиная с 8 и до 7
        Arrays.copyOf(arr, 5); // Не работает, но если копировать в самого себя, урезая длину до 5 то:
                                         // arr = Arrays.copyOf(arr, 5);
                                         // Или в новый массив int[] b = Arrays.copyOf(arr, 5);
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        // Можно так:
        System.out.print("\n");
        for (int j : arr) {
            System.out.print(j);
        }
    }
}
