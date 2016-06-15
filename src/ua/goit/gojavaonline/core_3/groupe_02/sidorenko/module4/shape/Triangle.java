package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.shape;

public class Triangle extends Shape {
    private double widht;
    private double height;

    public Triangle(double widht, double height) {
        if (widht > 0 && height > 0) {
            this.widht = widht;
            this.height = height;
        } else {
            throw new IllegalArgumentException("Error3");
        }
    }


    @Override
    public double shapeArea() {
        return (widht * height) / 2;
    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm Triangle");
    }
}


