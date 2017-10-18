/*Написано 28.09.17
автор Александр Береговой
расчет суммы всех цифр и нечетных, нахождение максимальной цифры произвольного целого числа
*/

import java.util.Scanner;

public class DigitsOfNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int x = scanner.nextInt();
        int clone_x = x;
        int another_clone_x = x;
        int sum = 0;//сумма всех чисел
        int odd_sum = 0;//сумма нечетных
        int max_digit = 0;//максимальная цифра

        while (x>0) {
            int next_digit = x%10;//вопрос про область видимости
            sum = sum + next_digit;
            x = x - next_digit;
            x = x/10;
        }
        System.out.println(sum);

        while (clone_x>0) {
            int next_digit = clone_x%10;//вопрос про область видимости
            odd_sum = odd_sum + next_digit*(next_digit%2);
            clone_x = clone_x - next_digit;
            clone_x = clone_x/10;
        }
        System.out.println(odd_sum);

        while (another_clone_x>0) {
            int next_digit = another_clone_x%10;//вопрос про область видимости
            if (next_digit>max_digit) {
                max_digit = next_digit;
            }
            another_clone_x = another_clone_x - next_digit;
            another_clone_x = another_clone_x/10;
        }
        System.out.println(max_digit);
    }
}