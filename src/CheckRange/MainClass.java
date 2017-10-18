package CheckRange;

/*Написано 11.10.17
автор Александр Береговой
вычисление длины интервала на вещественной оси, определение принадлежности вещественного числа диапазону
основной класс, ввод числа
*/

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число: ");
        double value = scanner.nextDouble();

        System.out.println(new Range(3.2, 7.5));
        System.out.printf("Длина интервала равна %.3f\n", (new Range(2.5, 8.7)).intervalLength());
        System.out.println((new Range(-1.7, 8.4).isInside(-0.3)));
        System.out.printf("Введенное число %.3f находится в интервале от 0,2 до 0,5: %b", value, (new Range(0.2, 0.5).isInside(value)));
    }
}

