// OOP

import model.Rectangle;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // Without OOP
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        System.out.println(width*height);
        System.out.println(2 * (width+height));
        System.out.println(Math.sqrt(Math.pow(height, 2)+ Math.pow(width, 2)));
        // With OOP
        // Used constructor of class
        Rectangle rectangle = new Rectangle(width, height);
/*
        Used default class call:

        model.Rectangle rectangle = new model.Rectangle();
        rectangle.height = height;
        rectangle.width = width;
 */
        rectangle.print();
    }

}

// Функции

// public - везде
// private - только внутри текущего класса
// default - внутри текущего класса и текущего пакета
