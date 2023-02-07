//1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

public class TaskOne {
    public static void main(String[] args) {
        String message = "А роза упала на лапу Азора";
        String newStr = message.toLowerCase().replaceAll(" ", ""); // Переводим строку в нижний регистр и убираем пробелы
        System.out.println(isPalindrom(newStr));
    }

    private static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}