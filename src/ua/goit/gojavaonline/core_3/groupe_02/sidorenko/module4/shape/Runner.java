package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.shape;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(2, 4);
        Rectagle r = new Rectagle(3, 5);

        ArrayList<Shape> listShape = new ArrayList<>();
        listShape.add(c);
        listShape.add(t);
        listShape.add(r);

        for (Shape shape : listShape) {
            System.out.println(shape.shapeArea());
        }

        for (Shape shape : listShape){
            shape.sayHello();
        }

    }

}






