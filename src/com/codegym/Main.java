package com.codegym;

public class Main {

    public static void main(String[] args) {
	Point point = new Point(20,50);
    point.setXY(40,30);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint(2,1,4,6);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
