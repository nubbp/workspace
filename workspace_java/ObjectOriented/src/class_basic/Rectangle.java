package class_basic;

public class Rectangle {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int area;

    public Rectangle() {
        x1 = 0;
        x2 = 0;
        y1 = 0;
        x2 = 0;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void set(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int square() {
        int xMax = (x1 > x2 ? x1 : x2);
        int xMin = (x1 < x2 ? x1 : x2);
        int yMax = (y1 > y2 ? y1 : y2);
        int yMin = (y1 < y2 ? y1 : y2);
        int xlength = xMax - xMin;
        int ylength = yMax - yMin;
        return xlength * ylength;
    }

    public void show() {
        System.out.println("좌표 : (" + this.x1 + ", " + this.y1 + "), (" + this.x2 + ", " + y2 + ")");
        System.out.println("넓이 : " + this.square());
    }

    public boolean equals(Rectangle r) {

        return true;
    }
}
