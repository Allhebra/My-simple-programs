/*Написано 26.09.17
автор Александр Береговой
программа выводит все целые числа от 1 до 100 в виде таблицы
*/

public class OutputInTable {

    public static void main(String[] args) {

        int i = 1;
        int k = 1;
        while (k<=10) {
            System.out.printf("%3d    ", k);
            k++;
        }
        System.out.println("");
        k = 1;

        while (i<=9) {
            while (k<=9) {
                System.out.printf("%2d%d    ", i, k);
                k++;
            }
            System.out.printf("%2d%d", ++i, 0);
            k = 1;
            System.out.println("");
        }
    }
}