import java.util.Scanner;

class AgeChecking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой возраст от 1 до 112 лет включительно:");
        int age = scanner.nextInt();
        int ageLastDigit = age % 10;
        if (age < 1) {
            System.out.println("Вы слишком молоды.");
        }else if (age > 112) {
            System.out.println("Вы слишком стары.");
        }else if ((age >= 11 && age <= 19) || age == 111 || age == 112) {
            System.out.println("Вам " + age + " лет.");
        }else if (ageLastDigit == 1) {
            System.out.println("Вам " + age + " год.");
        }else if (ageLastDigit >= 2 && ageLastDigit <= 4) {
            System.out.println("Вам " + age + " года.");
        }else {
            System.out.println("Вам " + age + " лет.");
        }
    }
}