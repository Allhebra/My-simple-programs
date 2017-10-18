package CheckRange;

/*Написано 11.10.17
автор Александр Береговой
вычисление длины интервала на вещественной оси, определение принадлежности вещественного числа диапазону
класс представляющий диапазон
*/

class Range {

    private double from;
    private double to;

    Range(double from, double to){
        this.from = from;
        this.to = to;
    }

    double intervalLength() {
        return Math.abs(from-to);
    }

    boolean isInside(double value) {
        return (value>=from&&value<=to);
    }
}