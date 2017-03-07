package ua.artcode.week1.home.task2;

/**
 Написать класс число.
 - сложение
 - вычитание
 - умножение
 - деление
 - возведение в степень
 - вычисление факториала
 - вычисление остатка от деления
 - метод который сравнивает два числа
 */
public class MyNumber {

    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public MyNumber add(MyNumber other){
        return new MyNumber(this.value + other.value);
    }

    public MyNumber sub(MyNumber other){
        return new MyNumber(this.value - other.value);
    }
}
