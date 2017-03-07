package ua.artcode.week1.home.task2;

/**
 *
 */
public class TestMyNumber {
    public static void main(String[] args) {

//        conditions
        MyNumber num1 = new MyNumber(5);
        MyNumber num2 = new MyNumber(3);

//        add
        MyNumber num3 = num1.add(num2);
        System.out.println(num3.getValue());

//        subtraction
        MyNumber num4 = num1.sub(num2);
        System.out.println(num4.getValue());

    }
}
