package org.benjaminsinzore.fundamentals.functions;

import java.util.List;
import java.util.Objects;

public class RecursiveFunction {

    public static void main(String[] args){

        countVowels("Benjamin Sinzore");

    }

    public static void printNum(List<String> list){


        for (String ss : list) {

            String[] lts = ss.split("");

            int i = 0;
            while (i < lts.length){

                for (String st: lts){
                    if (Objects.equals(st, "Y")){

                    }
                }
                System.out.println(lts[i]);
                i++;
            }

        }
    }


    public static int countVowels(String str) {
        if(str == null || str.isEmpty()) {
            return 0;
        }
        char first = str.charAt(0);
        String vowels = "aeiouAEIOU";
        int countFirstVowel = 0;
        if(vowels.indexOf(first) >= 0) {
            countFirstVowel = 1;
        }
        String remaining = str.substring(1);
        return countFirstVowel + countVowels(remaining);
    }


    public static boolean areMutuallyReverse(String str1, String str2) {
        if(str1 == null || str2 == null) {
            return false;
        }
        if(str1.length() != str2.length()) {
            return false;
        }
        char a = str1.charAt(0);
        char b = str2.charAt(str2.length()-1);
        if(a != b) {
            return false;
        }
        String remaining1 = str1.substring(1);
        String remaining2 = str2.substring(0, str2.length()-1);
        return areMutuallyReverse(remaining1, remaining2);
    }


    public static String keepUnique(String str) {

        if(str == null || str.length() < 2) {
            return str;
        }
        char first = str.charAt(0);
        char second = str.charAt(1);
        String withoutFirstTwo = str.substring(2);
        if(first == second) {
            return keepUnique(first + withoutFirstTwo);
        }
        String withoutFirst = str.substring(1);
        return first + keepUnique(withoutFirst);
    }



    //Print a series of numbers with recursive Java methods
    /**
     * This program simply passes the number 9 to the program’s callMyself method.
     * This method prints the number, subtracts one from the number,
     * and then calls itself again until the number zero is reached.
     * The result? All of the numbers from the given number to 1 are printed out in reverse order.
     */
    public static void callMyself(long i) {
        if (i < 0) {
            return;
        }
        System.out.print(i);
        i = i - 1;
        callMyself(i);
    }




    //Sum a series of numbers
    /**
     *  In the previous example, the recursive Java method returned void.
     *  In this example, the recursive method returns a whole number that represents an ongoing sum.
     *
     *  The recursive Java logic is as follows. Start with a number and then add that number
     *  to one less than itself. Repeat that logic until you hit zero. Once zero is encountered,
     *  the total sum of all numbers from the starting number down to zero has been calculated.
     */
    /* A recursive Java example to sum all natural numbers up to a given long. */
    public static long sumOfAllNumbers(long number) {
        /* Stop the recursive Java program at zero */
        if (number != 0) {
            return number + sumOfAllNumbers(number - 1);
        } else {
            return number;
        }
    }



    //Recursive Java factorial program
    /**
     * If we can calculate a sum of a series of whole numbers,
     * it’s not that big of a stretch to multiply them together as well.
     * That’s what the recursive Java factorial program does. It provides a total of a
     * sequential series of numbers multiplied against each other.
     *
     * Here is the logic for a Java factorial program that uses recursion:
     * */
    /* Java factorial program with recursion. */
    public static long factorialProgram(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialProgram(n - 1);
        }
    }





    //Recursive Fibonacci series
    /**
     *  In this example, you’ll calculate the Fibonacci series in both iterative
     *  and recursive Java programs. This is actually the most common assignment young
     *  developers get when it comes to learning recursion. Here’s what it looks
     *  like when implemented in a purely recursive manner:
     * */
    /* A recursive Fibonacci sequence in Java program */
    public static long fibonacci(long number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }




    //Recursive Java palindrome program
    /**
     * All the Java recursion examples so far have dealt with numbers.
     * But this example, the recursive Java palindrome checker program,
     * deals with strings. Namely, it’s to see if a string is spelled the exact
     * same way when the letters in the word are reversed.
     * */
    /* Recursive Java example to check for palindromes */
    public static boolean palindromeCheck(String s){
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            return palindromeCheck(s.substring(1, s.length()-1));
        }
        return false;
    }





    //Use recursion to add all the numbers between 5 and 10.
    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }




    //java.lang.StackOverflowError
    static void p(){
        System.out.println("hello");
        p();
    }




    //Factorial Number
    static int factorial(int n){
        if (n == 1)
            return 1;
        else
            return(n * factorial(n-1));
    }





    //Fibonacci Series
    static int n1=0,n2=1,n3=0;
    static void printFibo(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }
    }
    //Add in main Method
    /**
     *     int count=15;
     *     System.out.print(n1+" "+n2);//printing 0 and 1
     *     printFibo(count-2);//n-2 because 2 numbers are already printed
     * */






    //Factorial of a Number Using Recursion
    static int factorialTwo( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }




}
