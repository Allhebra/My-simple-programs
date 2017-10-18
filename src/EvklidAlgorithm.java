/*Написано 30.09.17
автор Александр Береговой
расчет наибольшего общего делителя по алгоритму Евклида
*/

import java.util.Scanner;

public class EvklidAlgorithm {

    public static void main(String[] args) {

        int nod = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Введите целое число a не равное нулю: ");
            int a = scanner.nextInt();
            System.out.print("Введите целое число b не равное нулю: ");
            int b = scanner.nextInt();
            if (a == 0 || b == 0) {
                System.out.println("Числа не должны равняться нулю!");
            } else {
                while (!flag) {
                    if ((a % b) == 0) {
                        nod = b;
                        flag = true;
                    } else {
                        int temporary = a;
                        a = b;
                        b = temporary % b;
                    }
                }
                System.out.print("Наибольший общий делитель равен: " + nod);
                break;//лучшее место для прерывания цикла!!!
            }
        }
    }
}