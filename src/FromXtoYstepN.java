/*Написано 27.09.17
автор Александр Береговой
программа выводит в консоль числа от x до y по n в строке
числа x, y, n вводятся с консоли
*/

import java.util.Scanner;

public class FromXtoYstepN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();
        System.out.print("Введите y: ");
        int y = scanner.nextInt();
        System.out.print("Введите n: ");
        int n = scanner.nextInt();

        while (x<=y) {
            int i = 1;
            while ((i<=n)&&(x<=y)) {
                System.out.printf("%3d    ", x);
                i++;
                x++;
            }
            System.out.println("");
        }
    }
}