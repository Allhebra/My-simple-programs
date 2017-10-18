import java.util.Scanner;

class YearChecking {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = scanner.nextInt();
        if((year%4==0 && !(year % 100 == 0)) || (year % 400 == 0)){
            System.out.println("Год, который вы ввели, является високосным.");
        }else {
            System.out.println("Год, который вы ввели, не является високосным.");
        }
    }
}