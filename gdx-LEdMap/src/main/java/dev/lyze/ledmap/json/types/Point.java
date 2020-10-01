package dev.lyze.ledmap.json.types;

public class Point {
    private int cx;
    private int cy;

    public Point(int cx, int cy) {
        this.cx = cx;
        this.cy = cy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "cx=" + cx +
                ", cy=" + cy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (getCx() != point.getCx()) return false;
        return getCy() == point.getCy();
    }

    @Override
    public int hashCode() {
        int result = getCx();
        result = 31 * result + getCy();
        return result;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }
}
