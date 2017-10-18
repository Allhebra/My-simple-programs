/*Написано 23.09.17
автор Александр Береговой
программа выполняет вычисление площади треугольника по заданным с консоли координатам его вершин
для вычисления площади используется формула Герона
 */

import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты трех точек на плоскости:");
        System.out.println("Координаты первой точки: ");
        System.out.print("x1 - ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 - ");
        double y1 = scanner.nextDouble();
        System.out.println("Координаты второй точки: ");
        System.out.print("x2 - ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 - ");
        double y2 = scanner.nextDouble();
        System.out.println("Координаты третьей точки: ");
        System.out.print("x3 - ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 - ");
        double y3 = scanner.nextDouble();

        if((x2-x1)/(y2-y1)==(x3-x1)/(y3-y1)){
            System.out.println("Неправильные данные - точки лежат на одной прямой.");
        }
        //вычисление сторон треугольника
        double a = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
        double b = Math.sqrt(Math.pow((x3-x1),2)+Math.pow((y3-y1),2));
        double c = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));

        double p = (a+b+c)/2;//вычисление полупериметра
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));//формула Герона
        System.out.println("Площадь треугольника равна: " + s);
    }
}