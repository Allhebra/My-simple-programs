/*Написано 04.10.17
автор Александр Береговой
расчет стоимости заказа с учетом скидок
*/

import java.util.Scanner;

public class OrderCostCount {

    static final double FIRST_TYPE_PRICE = 300;
    static final double SECOND_TYPE_PRICE = 50;
    static double fullCost;
    static double discountCost;

    static double costCount(int firstTypeNumber, int secondTypeNumber) {

        fullCost = (firstTypeNumber*FIRST_TYPE_PRICE + secondTypeNumber*SECOND_TYPE_PRICE);
        discountCost = fullCost - fullCost*getDiscount(firstTypeNumber, secondTypeNumber)/100;
        return discountCost;
    }

    static int getDiscount(int firstTypeNumber, int secondTypeNumber) {

        int discount;
        if ((firstTypeNumber + secondTypeNumber)>=10&&fullCost>=1000) {
            discount = 10;
        }
        else if ((firstTypeNumber + secondTypeNumber)>=10||fullCost>=1000) {
            discount = 5;
        }
        else discount = 0;
        return discount;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество первого товара: ");
        int firstTypeNumber = scanner.nextInt();
        System.out.println("Введите количество второго товара: ");
        int secondTypeNumber = scanner.nextInt();

        System.out.printf("Стоимость вашего заказа со скидкой: %.2f рублей\n", costCount(firstTypeNumber, secondTypeNumber));
        System.out.printf("Скидка: %d процентов   (%.2f рублей)", getDiscount(firstTypeNumber, secondTypeNumber), fullCost-discountCost);
    }
}