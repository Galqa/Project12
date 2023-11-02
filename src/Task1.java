/* Створіть файл, запишіть у нього довільні дані та закрийте файл.
 Потім знову відкрийте цей файл, прочитайте дані і виведіть їх на консоль.
 */


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Task1 {
    public static void main(String[] args) {
        Path path = Paths.get("autumn.txt");
        String content = "Нині осінь нас чарує,\n" +
                "Неповторна, чарівна,\n" +
                "Різні барви нам дарує\n" +
                "І дивує нас вона.";
        try {
            Files.write(path, content.getBytes());
        } catch (IOException e) {
            System.out.println("Помилка при записуванні у файл: " + e.getMessage());
        }
        try {
            byte[] bytes = Files.readAllBytes(path);
            String readContent = new String(bytes);
            System.out.println(readContent);
        } catch (IOException e) {
            System.out.println("Помилка при читанні з файлу: " + e.getMessage());
        }
    }

}







