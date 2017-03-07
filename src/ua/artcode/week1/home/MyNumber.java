package ua.artcode.week1.home;

/**
 * Created by knyaz on 07.03.2017.
 */
public class MyNumber {


    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    public MyNumber add(MyNumber other){
        return new MyNumber(this.value + other.value);
    }

    public int getValue() {
        return value;
    }
}
