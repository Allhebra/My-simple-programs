/*Написано 30.09.17
автор Александр Береговой
расчет банковского вклада
*/

import java.util.Scanner;

public class Contribution {

    public static void main(String[] args) {

        double percent;
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.print("Введите сумму вклада: ");
            double cash = scanner.nextDouble();
            System.out.print("Введите количество месяцев: ");
            int monthNumber = scanner.nextInt();
            System.out.print("Введите процентную ставку: ");
            double rate = scanner.nextDouble();

            if (cash > 0 && monthNumber >= 1 && rate > 0) {
                double accumulatedCash = cash;
                for (int i = 1; i <= monthNumber; i++) {
                    percent = accumulatedCash * (0.01 * rate / 12);
                    accumulatedCash += percent;
                }
                System.out.printf("Сумма вклада по истечении %d месяцев равна %f.", monthNumber, accumulatedCash);
                System.out.printf("Чистая прибыль составляет %f.", accumulatedCash-cash);
                break;
            } else {
                System.out.println("Вы ввели неправильные данные, повторите ввод");
            }
        }
    }
}