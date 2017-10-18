/*Написано 24.09.17
автор Александр Береговой
программа принимает с консоли два аргумента и код команды, если код команды удовлетворяет условию,
выводит на экран результат ее выполнения
 */

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд: ");
        double a = scanner.nextDouble();
        System.out.println("Введите второй операнд: ");
        double b = scanner.nextDouble();
        System.out.println("Введите код команды: ");
        int comandNumber = scanner.nextInt();

        switch (comandNumber) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Введена неправильная команда!");
        }
    }
}