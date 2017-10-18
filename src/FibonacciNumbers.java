/*Написано 27.09.17
автор Александр Береговой
программа принимает с консоли целое число, и выводит соответствующее число Фибоначчи
*/

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        int i = 1;
        int fn = 1;   //f  с индексом n
        int fn_1 = 1; //f с индексом (n-1)
        int fn_2 = 0; //f с индексом (n-2)

        while (i<n) {
            fn = fn_1 + fn_2;
            i++;
            fn_2 = fn_1;
            fn_1 = fn;
        }
        System.out.print(fn);
    }
}