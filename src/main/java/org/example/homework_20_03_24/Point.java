package org.example.homework_20_03_24;

import java.util.*;
      /*  Создать класс Point для хранения координат (x, y) точки на плоскости.
        Создать список точек, отсортировать по координате y.
        Создать TreeSet со всеми уникальными точками.
        Создать TreeSet со всеми различными по координате y точками.*/


public class Point implements Comparable<Point>{
    public static void main(String[] args) {
        List<Point> pointsList = new ArrayList<>();
        pointsList.add(new Point(5,6));
        pointsList.add(new Point(8,9));
        pointsList.add(new Point(12,15));
        pointsList.add(new Point(8,9));
        pointsList.add(new Point(8,93));
        pointsList.add(new Point(25,6));

        Collections.sort(pointsList);
        System.out.println("Список точек отсортированных по координате y");
        for (Point point : pointsList){
            System.out.println(point);
        }
        Set<Point> uniquePointsSet = new TreeSet<>(pointsList);

        System.out.println("\nTreeSet с уникальными точками:");
        for (Point point : uniquePointsSet) {
            System.out.println(point);
        }
        Set<Point> uniqueYPointsSet = new TreeSet<>(Comparator.comparingInt(Point::getY));

        uniqueYPointsSet.addAll(pointsList);

        System.out.println("\nTreeSet с уникальными точками по координате y:");
        for (Point point : uniqueYPointsSet) {
            System.out.println(point);
        }
    }
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

    @Override
    public int compareTo(Point other) {
        return Integer.compare(this.y, other.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }
}
