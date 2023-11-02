/**
 * Необхідно створити рядок із текстом (текст взяти будь-який з інтернету).
 * Розбити цей рядок на 2 підрядки рівної довжині
 * та вивести на екран кожну речення з нового рядка.
 */

public class Task2 {
    public static void main(String[] args) {
        String text = "Скоро наступить зима.";

        int midIndex = text.length() / 2;
        String firstHalf = text.substring(0, midIndex);
        String secondHalf = text.substring(midIndex);

        System.out.println(firstHalf);
        System.out.println(secondHalf);

    }
}
