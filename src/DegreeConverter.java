/*Написано 04.10.17
автор Александр Береговой
перевод температуры из градусов Цельсия в Кельвины и Фаренгейты
*/

import java.util.Scanner;

public class DegreeConverter {

    static double celsiusToKelvin(double celsiusTemperature) {

        double tK = celsiusTemperature + 273.15;
        return tK;
    }

    static double celsiusToFahrenheit(double celsiusTemperature) {

        double tF = celsiusTemperature*9/5+32;
        return tF;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double celsiusTemperature = scanner.nextInt();

        System.out.printf("Температура в градусах Кельвина: %f\nТемпература по шкале Фаренгейта: %f", celsiusToKelvin(celsiusTemperature), celsiusToFahrenheit(celsiusTemperature));
    }
}