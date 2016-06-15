package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.distanceBetweenPoints;

public class Point {
    private double x;
    private double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }

    public static double calculateBetweenPoint(Point a, Point b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));

        // return Math.sqrt(Math.pow(b.getX() - a.getX()), 2) + (Math.pow(b.getY() - b.getX()), 2);

    }


    public static Point calculateBetweenPoint(double v, double v1) {
    }
}



//
//    double distance(double х, double у) {
//
//        int dx = this.x;
//
//        int dy = this.у;
//
//        return Math.sqrt(dx*dx + dy*dy);
//
//    }
//
//    double distance(Point p) {
//
//        return distance(p.x, p.y);
//
//    } }
//
