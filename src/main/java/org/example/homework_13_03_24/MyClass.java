package org.example.homework_13_03_24;

public class MyClass {
    /* 3 Создать LinkedList с объектами вашего собственного класса и удалить все элементы,
    удовлетворяющие определенному условию.*/
    private final String name;
    private final int id;

    public MyClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
