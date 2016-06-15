package ua.goit.gojavaonline.core_3.groupe_02.sidorenko.module4.distanceBetweenPoints;

import java.util.Random;

public class Calculator {
        public static void main(String[] args) {

            Random random = new Random();


            double [] pointX = new double[5];
            double [] pointY = new double[5];
            for (int i = 0; i < 5 ; i++) {
                pointX[i] = random.nextDouble();
                pointY[i] = random.nextDouble();
                System.out.println("x = " + (i + 1) + pointX);
            }
            Point []result = new Point[5];
            for (int i = 0; i < 5; i++){
                result[i] = Point.calculateBetweenPoint(pointX[i], pointY[i]);
            }


        }
        }














/*
//        Point point1 = new Point(2, 3);
//        Point point2 = new Point(4, 5);*/
//
//        int[][] p = new int[5][5];
//        Random random = new Random();
//
//        for (int i = 0; i < 5; i++)
//            for (int j = 0; j < 5; j++)
//                p[i][j] = random.nextInt(10);
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++)
//                System.out.print(p[i][j] + " ");
//            System.out.println();
//
//        }
//
//
//    }
//}
///*
//        System.out.print(point1.getX() + point1.getY());
//        System.out.println(point1.distance(point2));
//        System.out.println(point1.distance(60, 80));
//
//        System.out.println(point1.calculateBetweenPoint(point1, point2));
//
//
//*/




