//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        repeatWord();
    }

    private static void repeatWord() {
        StringBuilder sb = new StringBuilder();
        Scanner scannerWord = new Scanner(System.in);
        System.out.printf("Введите слово для повтора: ");
        String word = scannerWord.nextLine();
        for (int i = 0; i < 100; i++) {
            sb.append(word).append(" ");
        }
        System.out.println(sb);

        try(PrintWriter pw = new PrintWriter("D:\\JavaProject\\Geekbrains\\Practice\\Homework\\src\\main\\resources\\file.txt")) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
