package ua.artcode.week1.home;

/**
 * Created by knyaz on 07.03.2017.
 */
public class TestMyNumber {
    public static void main(String[] args) {

        MyNumber num1 = new MyNumber(5);
        MyNumber num2 = new MyNumber(3);

        MyNumber num3 = num1.add(num2);

        System.out.println(num3.getValue());


        int i = 33;
        //
        // myNumber + myNumer = myNumber
        // myNum + 4 = double

    }
}
