/*Написано 23.09.2017 Береговым Александром. Данная программа рассчитывает и выводит в консоль дату,
следующую за введенной пользователем*/

import java.util.Scanner;

class NextDate {

    public static void main(String[] args) {

        int dayNumbers;//количество дней в месяце
        boolean error = false;//флаг устанавливается при вводе ошибочных данных
        boolean modified = false;/*флаг устанавливается когда изменяется переменная day
        для блокировки ее переопределения и избежания связанных с этим недоразумений*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату:");
        System.out.print("День - ");
        int day = scanner.nextInt();
        System.out.print("Месяц - ");
        int month = scanner.nextInt();
        System.out.print("Год - ");
        int year = scanner.nextInt();

        if(day<1||day>31) {
            error = true;
            System.out.println("Количество дней в месяце должно быть в интервале от 1 до 31!");
        }

        if(month<1||month>12){
            error = true;
            System.out.println("Такого месяца не существует!");
        }

        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
            dayNumbers=31;
            if(day>dayNumbers) {
                error=true;
                System.out.println("Количество дней не соответствует месяцу!");
            }
        }else if(month==4||month==6||month==9||month==11) {
            dayNumbers=30;
            if(day>dayNumbers) {
                error=true;
                System.out.println("Количество дней не соответствует месяцу!");
            }
        }else if(month==2&&((year%4==0 && !(year % 100 == 0)) || (year % 400 == 0))) {
            dayNumbers = 29;
            if(day>dayNumbers) {
                error=true;
                System.out.println("Количество дней не соответствует месяцу!");
            }
        }else {
            dayNumbers = 28;
            if(day>dayNumbers) {
                error=true;
                System.out.println("Количество дней не соответствует месяцу!");
            }
        }

        if(!error) {
            if (day == dayNumbers) {
                if (month == 12) {
                    day = 1;
                    month = 1;
                    year = year + 1;
                    modified = true;
                }else {
                    day = 1;
                    month = month + 1;
                    modified = true;
                }
            }
            if (!modified & (day != dayNumbers)) {
                day = day + 1;
            }
            System.out.println("Завтрашняя дата: " + day + "." + month + "." + year);
        }else {
            System.out.println("Были введены некорректные данные!");
            System.out.println("Проверьте данные и перезапустите программу!");
        }
    }
}