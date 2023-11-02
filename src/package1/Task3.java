/**
 * Створіть у пакеті текстовий файл і клас,
 * внесіть у файл якийсь текст.
 * Виведіть на екран вміст файлу.
 */

package package1;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String filename = "winter.txt";
        String content = "Зима - це час року, коли все навколо покривається снігом, а дерева стають білими від інею.";

        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("Помилка при записуванні у файл: " + e.getMessage());
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }
}


