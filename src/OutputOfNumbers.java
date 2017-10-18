/*Написано 24.09.17
автор Александр Береговой
программа принимает с консоли целое число, и выводит все целые числа от 1 до заданного
*/

import java.util.Scanner;

public class OutputOfNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        int i = 1;
        while (i<=n) {
            System.out.print(i + "  ");
            i++;
        }
    }
}