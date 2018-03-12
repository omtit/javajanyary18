package education.lab01.lab14.task5449;

/**
 * @author akryukov
 *         17.07.2017
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String print(){
        return "(" + x + ";" + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null //объект существует
                || getClass() != o.getClass()) //проверка, что обхекты различные
            return false;

        Point point = (Point) o;//явное преобразование "о" к типу "point"

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
