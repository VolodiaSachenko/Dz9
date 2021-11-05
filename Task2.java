package com.dz9;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Volodia Sachenko
 * @since 04.11.21
 */

public class Task2 {
    public static void main(String[] args) {
        try {
            System.out.println("Доступно п'ять емоцій, зараз ми перевіримо ваш настрій: ");
            String[] str = {"anger", "awe", "joy", "love", "grief"};
            System.out.println(Arrays.toString(str));
            System.out.println("\uD83D\uDE21  \uD83D\uDE47  \uD83D\uDE06  \uD83E\uDD70  \uD83D\uDE1E");
            System.out.println("\nВведіть, будь ласка, декілька англійських літер, без пробілу:");
            char[] letters = scanner();
            charCheck(letters);
        } catch (NoSuchElementException e) {
            System.out.println("Помилка, введіть, будь ласка, одне слово.");
        }
    }

    private static char[] scanner() { // Сканер с переводом String в строчные буквы char[]
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toLowerCase().toCharArray();
    }

    private static void charCheck(char[] letters) { // Проверка на совпадения
        int a = 0, n = 0, g = 0, e = 0, r = 0, w = 0, j = 0, o = 0, y = 0, l = 0, v = 0, i = 0, f = 0;
        int counter = 0;
        String feeling = "feeling";
        String converter = String.valueOf(letters);
        for (char letter : letters) {
            if (letter == 'a') {
                a++;
            }
            if (letter == 'n') {
                n++;
            }
            if (letter == 'g') {
                g++;
            }
            if (letter == 'e') {
                e++;
            }
            if (letter == 'r') {
                r++;
            }
            if (letter == 'w') {
                w++;
            }
            if (letter == 'j') {
                j++;
            }
            if (letter == 'o') {
                o++;
            }
            if (letter == 'y') {
                y++;
            }
            if (letter == 'l') {
                l++;
            }
            if (letter == 'v') {
                v++;
            }
            if (letter == 'i') {
                i++;
            }
            if (letter == 'f') {
                f++;
            }
        }

        if (a >= 1 && n >= 1 && g >= 1 && e >= 1 && r >= 1) {
            System.out.println("Мої вітання, з цих букв можна скласти слово \"anger\" \uD83D\uDE21");
            counter++;
        }
        if (a >= 1 && w >= 1 && e >= 1) {
            System.out.println("Мої вітання, з цих букв можна скласти слово \"awe\" \uD83D\uDE47");
            counter++;
        }
        if (j >= 1 && o >= 1 && y >= 1) {
            System.out.println("Мої вітання, з цих букв можна скласти слово \"joy\" \uD83D\uDE06");
            counter++;
        }
        if (l >= 1 && o >= 1 && v >= 1 && e >= 1) {
            System.out.println("Мої вітання, з цих букв можна скласти слово \"love\" \uD83E\uDD70");
            counter++;
        }
        if (g >= 1 && r >= 1 && i >= 1 && e >= 1 && f >= 1) {
            System.out.println("Мої вітання, з цих букв можна скласти слово \"grief\" \uD83D\uDE1E");
            counter++;
        }
        if (counter != 1) {
            feeling = "feelings";
        }
        if (counter == 0) {
            System.out.println("На превеликий жаль, з цих літер не вдалося скласти жодного слова.");
        }
        System.out.println("\"" + converter + "\"" + " == " + counter + " " + feeling);
    }
}
