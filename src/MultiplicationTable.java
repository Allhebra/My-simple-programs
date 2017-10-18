/*Написано 30.09.17
автор Александр Береговой
вывод в консоль таблицы умножения
*/

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число не равное нулю: ");
        int n = scanner.nextInt();
        if (n!=0) {
            for (int i = -1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == -1 || i == 0) {
                        System.out.print("-------");
                    } else {
                        System.out.printf("%5d  ", i * j);
                    }
                }
                System.out.printf(System.lineSeparator());
            }
        }
        else {
            System.out.print ("Вы ввели ноль!");
        }
    }
}