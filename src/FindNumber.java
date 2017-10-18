import java.util.Scanner;

public class FindNumber {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int b = scanner.nextInt();
        System.out.print(find(a, b));

    }

    public static int find(int[] a, int b) {

        for (int i=0; i<a.length; i++) {

            if (a[i] == b) {
                return i;
            }
        }
        return -1;
    }
}