package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.shape;

public class Rectagle extends Shape {
    private double widht;
    private double height;

    public Rectagle(double widht, double height) {
        if(widht > 0 && height > 0){
        this.widht = widht;
        this.height = height;
    } else {
        throw new IllegalArgumentException("Error2");
        }
    }

    @Override
    public double shapeArea() {
        return widht * height;

    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm Rectagle");
    }
}
