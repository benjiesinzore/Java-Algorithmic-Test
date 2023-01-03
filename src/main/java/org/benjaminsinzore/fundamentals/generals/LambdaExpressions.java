package org.benjaminsinzore.fundamentals.generals;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpressions {

    public static void main(String[] args){

//        myLambda();
        testMyLogic(24);
    }

    public static void myLambda(){

        int[] myArr = new int[5];
        int num = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.forEach( n -> {

            myArr[num] = n;
            String ben = "Hello Lambda";
            System.out.println(ben);
            System.out.println(Arrays.toString(myArr)+"\n");
        });

        for (Integer integer: numbers){

            myArr[num] = integer;
            String ben = "Hello Benjamin";
            System.out.println(ben);
            System.out.println(Arrays.toString(myArr));
        }

    }


    public static void testMyLogic(int N){
        if (N % 2 != 0){
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5){
            System.out.println("Not weird");
        } else if (N >= 6 && N <= 20){
            System.out.println("Weird");
        } else if (N > 20){
            System.out.println("Not weird");
        }
    }
}
