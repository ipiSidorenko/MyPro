package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.shape;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("Error");
        }
    }


    @Override
    public double shapeArea() {
        return radius = Math.PI * radius;

    }

    @Override
    public void sayHello() {
        System.out.println("Hi, I'm Circle");
    }
}


