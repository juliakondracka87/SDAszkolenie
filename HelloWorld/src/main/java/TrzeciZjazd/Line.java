package TrzeciZjazd;

public class Line {

    private Point begin;//obiekt1
    private Point end;//obiekt2


    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    @Override
    public String toString() {

        return "odcinek [początek = " + begin + ", koniec = " + end + "]";
    }

    public double getLength() {
        return end.distance(begin);
    }

    public Point getBegin() {

        return begin;
    }

    public void setBegin(Point begin) {

        this.begin = begin;
    }

    public void setEnd(Point end) {

        this.end = end;
    }

    public Point getEnd() {

        return end;
    }

}
