public class CircleParamCalc {

    static double radiusOfCirclePreset = 10;
    static double areaOfCirclePreset = 31400;
    static double angleDegreePreset = 180;
    static double radiusOfCircle;
    static double lengthOfCircle;
    static double areaOfCircle;
    static double areaOfSector;

    public static void main(String[] args) {

        lengthOfCircle = 2*Math.PI*radiusOfCirclePreset;
        areaOfCircle = Math.PI*Math.pow(radiusOfCirclePreset, 2);

        radiusOfCircle = Math.sqrt(areaOfCirclePreset/Math.PI);

        areaOfSector = Math.toRadians(angleDegreePreset)*Math.pow(radiusOfCirclePreset, 2)/2;

        System.out.printf("Результаты вычислений:  \n lengthOfCircle \t %20.10f \n areaOfCircle \t %20.10f \n radiusOfCircle \t %20.10f \n areaOfSector \t %20.10f", lengthOfCircle, areaOfCircle, radiusOfCircle, areaOfSector);

    }
}